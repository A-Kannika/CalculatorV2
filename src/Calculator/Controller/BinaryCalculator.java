package Calculator.Controller;
import Calculator.Model.Number;

import java.math.BigInteger;

public class BinaryCalculator extends NumericCalculator implements Bin2Dec, Dec2Bin, Bin2BigInt, BigInt2Bin {

    public String binaryAdd(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertBin2Dec(input1);
        String number2 = convertBin2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String add = Long.toString(addValues(num1, num2));
            result = convertDec2Bin(add);
        }
        return result;
    }

    public String binarySubtract(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertBin2Dec(input1);
        String number2 = convertBin2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String sub = Long.toString(subtractValues(num1, num2));
            result = convertDec2Bin(sub);
        }
        return result;
    }

    public String binaryMultiply(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertBin2Dec(input1);
        String number2 = convertBin2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String mul = Long.toString(multiplyValues(num1, num2));
            result = convertDec2Bin(mul);
        }
        return result;
    }

    public String binaryDivide(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertBin2Dec(input1);
        String number2 = convertBin2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String div = Long.toString(divideValues(num1, num2));
            result = convertDec2Bin(div);
        }
        return result;
    }

    public String binaryDivideRemainder(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        String number1 = convertBin2Dec(input1);
        String number2 = convertBin2Dec(input2);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            long num1 = Long.parseLong(number1);
            long num2 = Long.parseLong(number2);
            String remainder = Long.toString(divideRemainderValues(num1, num2));
            result = convertDec2Bin(remainder);
        }
        return result;
    }

    @Override
    public String convertBin2Dec(String input) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        long decNum = 0;
        if (input.equals(Number.getInvalidValue())) {
            result += Number.getBinaryInvalidValueMessage();
        } else if (input.equals("0")) {
            result = input;
        } else {
            long binaryNumber = Long.parseLong(input);
            for (int i = 0; i < input.length(); i++) {
                long base = binaryNumber % 10;
                long pow = (long) Math.pow(2, i);
                decNum += base * pow;
                binaryNumber /= 10;
            }
            result += decNum;
        }
        return result;
    }

    @Override
    public String convertDec2Bin(String input) {

        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        StringBuilder binary = new StringBuilder();

        if (input.equals(Number.getInvalidValue())) {
            result += Number.getNumericInvalidValueMessage();
        } else if (input.equals("0")) {
            result += binary.insert(0, "0");
        } else {
            long decimalNumber = (long) Math.floor(Double.parseDouble(input));
            if (decimalNumber > 0) {
                while (decimalNumber > 0) {
                    if (decimalNumber % 2 == 0) {
                        binary.insert(0, "0");
                    } else {
                        binary.insert(0, "1");
                    }
                    decimalNumber /= 2;
                }
                result += binary;
            } else {
                while (decimalNumber < 0) {
                    if (decimalNumber % 2 == 0) {
                        binary.insert(0, "0");
                    } else {
                        binary.insert(0, "1");
                    }
                    decimalNumber /= 2;
                }
                result = "-" + binary;
            }
        }
        return result;
    }

    @Override
    public String convertBin2BigInt(String input) {

        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        if (input.equals(Number.getInvalidValue())) {
            result += Number.getBinaryInvalidValueMessage();
        } else if (input.equals("0")) {
            result = "0";
        } else {
            BigInteger bigInt = new BigInteger(input, 2);
            result += bigInt;
        }
        return result;
    }

    @Override
    public String convertBigInt2Bin(String input) {

        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        if (input.equals(Number.getInvalidValue())) {
            result += Number.getNumericInvalidValueMessage();
        } else if (input.equals("0")) {
            result = input;
        } else {
            BigInteger bigInteger = new BigInteger(input);
            result += bigInteger.toString(2);
        }
        return result;
    }
}
