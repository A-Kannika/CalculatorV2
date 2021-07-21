package Calculator.Controller;

import Calculator.Model.Number;

public class DecimalCalculator extends NumericCalculator {

    public String decAdd(String input1, String input2) {

        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            return result = Number.getInvalidValue();
        } else {
            try{
                long int1 = Long.parseLong(input1);
                long int2 = Long.parseLong(input2);
                return result += (int1 + int2);
            } catch (NumberFormatException e) {
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                return result += (num1 + num2);
            }
        }
    }

    public String decSub(String input1, String input2) {

        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            return result = Number.getInvalidValue();
        } else {
            try{
                long int1 = Long.parseLong(input1);
                long int2 = Long.parseLong(input2);
                return result += (int1 - int2);
            } catch (NumberFormatException e) {
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                return result += (num1 - num2);
            }
        }
    }

    public String decMultiply(String input1, String input2) {

        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            return result = Number.getInvalidValue();
        } else {
            try{
                long int1 = Long.parseLong(input1);
                long int2 = Long.parseLong(input2);
                return result += (int1 * int2);
            } catch (NumberFormatException e) {
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                return result += (num1 * num2);
            }
        }
    }

    public String decDivide(String input1, String input2) {

        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            return result = Number.getInvalidValue();
        } else {
            try{
                long int1 = Long.parseLong(input1);
                long int2 = Long.parseLong(input2);
                if (int2 == 0) {
                    return result = "UNDEFINED";
                } else {
                    return result += (int1 / int2);
                }
            } catch (NumberFormatException e) {
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                if (num2 == 0) {
                    return result = "UNDEFINED";
                } else {
                    return result += (num1 / num2);
                }
            }
        }
    }

    public String decDivideRemainder(String input1, String input2) {

        //check Input return, "Invalid", "0",and String decNum
        String result = "";
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            return result = Number.getInvalidValue();
        } else {
            try{
                long int1 = Long.parseLong(input1);
                long int2 = Long.parseLong(input2);
                if (int2 == 0) {
                    return result = "UNDEFINED";
                } else {
                    return result += (int1 % int2);
                }
            } catch (NumberFormatException e) {
                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);
                if (num2 == 0) {
                    return result = "UNDEFINED";
                } else {
                    return result += "0";
                }
            }
        }
    }

//    public String decDivRemainder(String input1, String input2) {
//
//        //check Input return, "Invalid", "0",and String binNum
//        String result = "";
//        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
//            result = Number.getInvalidValue();
//        } else {
//            long num1 = (long) Double.parseDouble(input1);
//            long num2 = (long) Double.parseDouble(input2);
//            if (num2 == 0){
//                result = "";
//            } else if (num1 % num2 == 0) {
//                result = "0";
//            } else {
//                result += (num1 % num2);
//            }
//        }
//        return result;
//    }

}
