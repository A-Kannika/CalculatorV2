package Calculator.Model;

import Calculator.Controller.Calculator;

public class CheckInput extends Calculator {
    public static void main(String[] args) {
        System.out.println(checkBinary("10101010"));
        System.out.println(checkBinary(""));
        System.out.println(checkBinary("-ser"));
        System.out.println(checkHex("DAD"));
        System.out.println(checkHex("-8ab"));
        System.out.println(checkHex("axk"));
        System.out.println(checkDecimal("3456"));
        System.out.println(checkDecimal("-234.67"));
        System.out.println(checkDecimal("-45tr"));
        System.out.println(checkPositiveNumber("-345"));
        System.out.println(checkPositiveNumber("0"));
        System.out.println(checkPositiveNumber("rty"));
        System.out.println(checkNumberAtLeast1("234"));
        System.out.println(checkNumberAtLeast1("-345"));
        System.out.println(checkNumberAtLeast1("0"));
        System.out.println(checkNumberAtLeast1("ser"));

    }

    public static String checkBinary(String input) {
        String bin = "";
        var chars = input.toCharArray();
        if (chars.length == 0) {
            return bin = "0";
        } else {
            int i = chars.length - 1;
            while (i >= 0) {
                if (!(chars[i] == '0' || chars[i] == '1')) {
                    bin = "-1";
                    break;
                } else {
                    bin = input;
                }
                i--;
            }
        }
        return bin;
    }

    public static String checkHex(String input) {
        String hex = "";
        String hexInput = input.toUpperCase();
        if (hexInput.startsWith("-")){
            hexInput = hexInput.substring(1);
        }
        if (hexInput.equals("")) {
            hex += "0";
        } else {
            int i = hexInput.length() - 1;
            while (i >= 0) {
                char c = hexInput.charAt(i);
                if (!(c >= '0' && c <= '9' || c >= 'A' && c <= 'F')) {
//                    System.out.println(ConsoleColors.RED_BOLD + "\tThe number need to contain 0-9 and A-F only." + ConsoleColors.RESET);
                    hex = "Z";
                    break;
                } else {
                    hex = input;
                }
                i--;
            }
        }
        return hex;
    }

    public static double checkDecimal(String input) {
        if (input.equals("0")){
            return 0.0;
        } else {
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
//                System.out.println(ConsoleColors.RED_BOLD + "\tThe number need to be numeric." + ConsoleColors.RESET);
                return Math.sqrt(-1);
            }
        }
    }

    public static double checkPositiveNumber(String input) {
        if (input.startsWith("-")){
            return -1;
        } else if (input.equals("0")) {
            return 0.0;
        } else {
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                return -1;
            }
        }
    }

    public static double checkNumberAtLeast1(String input) {
        if (input.startsWith("-") || input.equals("0")){
            return -1;
        } else {
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                return -1;
            }
        }
    }
}