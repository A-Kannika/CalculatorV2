package Calculator.Controller;
import Calculator.Model.Number;

import java.math.BigInteger;

public class BigIntegerCalculator extends NumericCalculator {

    public String bigIntAdd(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            BigInteger num1 = new BigInteger(input1);
            BigInteger num2 = new BigInteger(input2);
            result += num1.add(num2);
        }
        return result;
    }

    public String bigIntSubtract(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            BigInteger num1 = new BigInteger(input1);
            BigInteger num2 = new BigInteger(input2);
            result += num1.subtract(num2);
        }
        return result;
    }

    public String bigIntMultiply(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            BigInteger num1 = new BigInteger(input1);
            BigInteger num2 = new BigInteger(input2);
            result += num1.multiply(num2);
        }
        return result;
    }

    public String bigIntDivide(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            result = Number.getInvalidValue();
        } else {
            BigInteger num1 = new BigInteger(input1);
            BigInteger num2 = new BigInteger(input2);
            if (num2.equals(BigInteger.ZERO)){
                result = "UNDEFINED";
            } else {
                result += num1.divide(num2);
            }
        }
        return result;
    }

    public String bigIntDivRemainder(String input1, String input2) {

        //check Input return, "Invalid", "0",and String binNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            return result = Number.getInvalidValue();
        } else {
            BigInteger num1 = new BigInteger(input1);
            BigInteger num2 = new BigInteger(input2);
            if (num2.equals(BigInteger.ZERO)){
                return result = "UNDEFINED";
            } else if (num1.mod(num2).equals(BigInteger.ZERO)) {
                return result = "0";
            } else {
                return result += num1.mod(num2);
            }
        }
    }
}
