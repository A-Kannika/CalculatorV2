package Calculator.Controller;

import Calculator.Model.Number;

import java.math.BigInteger;

public class HexCalculator extends NumericCalculator implements Hex2Dec, Dec2Hex, Hex2BigInt, BigInt2Hex {

    public String hexAdd(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertHex2Dec(input1);
        String number2 = convertHex2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String add = Long.toString(addValues(num1, num2));
            result = convertDec2Hex(add);
        }
        return result;
    }

    public String hexSubtract(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertHex2Dec(input1);
        String number2 = convertHex2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String sub = Long.toString(subtractValues(num1, num2));
            result = convertDec2Hex(sub);
        }
        return result;
    }

    public String hexMultiply(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertHex2Dec(input1);
        String number2 = convertHex2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String mul = Long.toString(multiplyValues(num1, num2));
            result = convertDec2Hex(mul);
        }
        return result;
    }

    public String hexDivide(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertHex2Dec(input1);
        String number2 = convertHex2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String div = Long.toString(divideValues(num1,num2));
            result = convertDec2Hex(div);
        }
        return result;
    }

    public String hexDivideRemainder(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertHex2Dec(input1);
        String number2 = convertHex2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String remainder = Long.toString(divideRemainderValues(num1,num2));
            result = convertDec2Hex(remainder);
        }
        return result;
    }


    @Override
    public String convertHex2Dec(String input) {

        //check Input return, "Invalid", "0",and String decNum
        String hex = input.toUpperCase();
        String hexList = "0123456789ABCDEF";
        long decSum = 0;
        String result = "";
        if (input.equals(Number.getInvalidValue())) {
            result += Number.getHexInvalidValueMessage();
        }else if (hex.startsWith("-")) {
            hex = hex.substring(1);
            for (int i = 0; i < hex.length(); i++) {
                char c = hex.charAt(i);
                int dec = hexList.indexOf(c);
                decSum = 16 * decSum + dec;
            }
            result += "-" + decSum;
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = hex.charAt(i);
                int dec = hexList.indexOf(c);
                decSum = 16 * decSum + dec;
            }
            result += decSum;
        }
        return result;
    }

    @Override
    public String convertDec2Hex(String input) {

        //check Input return, "Invalid", "0",and String decNum
        long decimalNumber = (long) Math.floor(Double.parseDouble(input));
        String result = "";
        long remainder = 0;   //store the remainder and use as the index of the hexList

        StringBuilder hexNumber = new StringBuilder();  // store the hexNumber
        char[] hexList = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (input.equals(Number.getInvalidValue())) {
            result += Number.getNumericInvalidValueMessage();
        } else if (decimalNumber == 0){
            result = "0";
        } else if (decimalNumber > 0) {
            while (decimalNumber > 0) {
                remainder = (decimalNumber % 16);
                hexNumber.insert(0, hexList[(int) remainder]);
                decimalNumber /= 16;
            }
            result += hexNumber;
        } else {
            if (decimalNumber < 0) {
                int posDec = (int) Math.abs(decimalNumber);
                while (posDec > 0) {
                    remainder = posDec % 16;
                    hexNumber.insert(0, hexList[(int) remainder]);
                    posDec /= 16;
                }
                result += "-" + hexNumber;
            }
        }
        return result;
    }

    @Override
    public String convertBigInt2Hex(String input) {
        //check Input return, "Invalid", "0",and String decNum
        BigInteger bigInteger = new BigInteger(input);
        String result = "";
        if (input.equals(Number.getInvalidValue())) {
            result += Number.getNumericInvalidValueMessage();
        } else if (input.equals("0")) {
            result = input;
        } else {
            result += (bigInteger.toString(16)).toUpperCase();
        }
        return result;
    }


    @Override
    public String convertHex2BigInt(String input) {
        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        if (input.equals(Number.getInvalidValue())) {
            result += Number.getBinaryInvalidValueMessage();
        } else if (input.equals("0")) {
            result = input;
        } else {
            BigInteger bigInt = new BigInteger(input, 16);
            result += bigInt;
        }
        return result;
    }
}
