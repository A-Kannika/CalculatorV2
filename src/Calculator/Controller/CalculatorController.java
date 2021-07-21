package Calculator.Controller;

/* The controller class use to control the class model to 

 */

import Calculator.Model.Number;
import Calculator.Model.*;

import java.util.Scanner;


public class CalculatorController {

    // Control the Binary Calculator
    public static void callBinaryCalculator(){

        BinaryCalculator number = new BinaryCalculator();
        BinNum bin = new BinNum();
        String result ="";
        String remainder = "";

        //method to call binary calculation
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Binary Calculator:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your first binary number: " + ConsoleColors.RESET);
        String input1 = scanner.nextLine();
        bin.setNumber(input1);
        input1 = bin.checkInput();
        System.out.print(ConsoleColors.RED_BOLD + "Enter your second binary number: " + ConsoleColors.RESET);
        String input2 = scanner.nextLine();
        bin.setNumber(input2);
        input2 = bin.checkInput();
        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the operator: " + ConsoleColors.RESET
                + "\n\t1. Add:      Press" + ConsoleColors.PURPLE_BOLD + " +" + ConsoleColors.RESET
                + "\n\t2. Subtract: Press" + ConsoleColors.PURPLE_BOLD + " -" + ConsoleColors.RESET
                + "\n\t3. Multiply: Press" + ConsoleColors.PURPLE_BOLD + " *" + ConsoleColors.RESET
                + "\n\t4. Divide:   Press" + ConsoleColors.PURPLE_BOLD + " /" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your operator: " + ConsoleColors.RESET);
        String operator = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getBinaryInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            switch(operator){
                case "+":
                    result = number.binaryAdd(input1,input2);
                    System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                            + input1 + " + " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + number.convertBin2Dec(input1) + " + " + number.convertBin2Dec(input2)
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + number.convertBin2Dec(result) + ConsoleColors.RESET);
                    break;
                case "-":
                    result = number.binarySubtract(input1,input2);
                    System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                            + input1 + " - " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + number.convertBin2Dec(input1) + " - " + number.convertBin2Dec(input2)
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + number.convertBin2Dec(result) + ConsoleColors.RESET);
                    break;
                case "*":
                    result = number.binaryMultiply(input1,input2);
                    System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                            + input1 + " x " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + number.convertBin2Dec(input1) + " x " + number.convertBin2Dec(input2)
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + number.convertBin2Dec(result) + ConsoleColors.RESET);
                    break;
                case "/":
                    result = number.binaryDivide(input1,input2);
                    remainder = number.binaryDivideRemainder(input1,input2);
                    if (remainder.equals("0")) {
                        System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                                + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                                + number.convertBin2Dec(input1) + " / " + number.convertBin2Dec(input2)
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + number.convertBin2Dec(result) + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED_BOLD + "\tBinary value: \n\t" + ConsoleColors.RESET
                                + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + result
                                + " Remainder : " + remainder + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                                + number.convertBin2Dec(input1) + " / " + number.convertBin2Dec(input2)
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + number.convertBin2Dec(result)
                                + " Remainder : " + number.convertBin2Dec(remainder) + ConsoleColors.RESET);
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tInvalid Operator!" + ConsoleColors.RESET);
                    break;
            }
        }
    }

    public static void callConvertBinary2Decimal(){

        BinaryCalculator number = new BinaryCalculator();
        BinNum bin = new BinNum();
        String result ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Binary to Decimal:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your binary number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        bin.setNumber(input);
        input = bin.checkInput();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        result = number.convertBin2Dec(input);
        if (input.equals(Number.getInvalidValue())){
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getBinaryInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            System.out.println("\tConverting Binary Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " to Decimal value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static void callConvertDecimal2Binary(){

        BinaryCalculator number = new BinaryCalculator();
        DecNum decNum = new DecNum();
        String result ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Decimal to Binary:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your decimal number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        decNum.setNumber(input);
        input = decNum.checkInput();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        result = number.convertDec2Bin(input);
        if (input.equals(Number.getInvalidValue())){
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getNumericInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            long dec = (long) Math.floor(Double.parseDouble(input));
            System.out.println("\tConverting Decimal Value " + ConsoleColors.GREEN_BOLD + dec + ConsoleColors.RESET
                    + " to Binary value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static void callConvertBigInteger2Binary(){

        BinaryCalculator number = new BinaryCalculator();
        BigIntNum bigIntNum = new BigIntNum();
        String result ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert BigInteger to Binary:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your big integer number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        bigIntNum.setNumber(input);
        input = bigIntNum.checkInput();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        result = number.convertBigInt2Bin(input);
        if (input.equals(Number.getInvalidValue())){
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getNumericInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            System.out.println("\tConverting Big Integer Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " \n\tto Binary value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static void callConvertBinary2BigInteger(){
        BinaryCalculator number = new BinaryCalculator();
        BinNum bin = new BinNum();
        String result ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Binary to BigInteger:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your binary number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        bin.setNumber(input);
        input = bin.checkInput();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        result = number.convertBin2BigInt(input);
        if (input.equals(Number.getInvalidValue())){
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getBinaryInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            System.out.println("\tConverting Binary Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " to Big Integer value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }


    // Control the Hexadecimal Calculator
    public static void callHexadecimalCalculator(){

        HexCalculator number = new HexCalculator();
        HexNum hex = new HexNum();
        String result ="";
        String remainder = "";

        //method to call binary calculation
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Hexadecimal Calculator:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your first hexadecimal number: " + ConsoleColors.RESET);
        String input1 = scanner.nextLine();
        hex.setNumber(input1);
        input1 = hex.checkInput();
        System.out.print(ConsoleColors.RED_BOLD + "Enter your second hexadecimal number: " + ConsoleColors.RESET);
        String input2 = scanner.nextLine();
        hex.setNumber(input2);
        input2 = hex.checkInput();
        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the operator: " + ConsoleColors.RESET
                + "\n\t1. Add:      Press" + ConsoleColors.PURPLE_BOLD + " +" + ConsoleColors.RESET
                + "\n\t2. Subtract: Press" + ConsoleColors.PURPLE_BOLD + " -" + ConsoleColors.RESET
                + "\n\t3. Multiply: Press" + ConsoleColors.PURPLE_BOLD + " *" + ConsoleColors.RESET
                + "\n\t4. Divide:   Press" + ConsoleColors.PURPLE_BOLD + " /" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your operator: " + ConsoleColors.RESET);
        String operator = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getHexInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            switch(operator){
                case "+":
                    result = number.hexAdd(input1,input2);
                    System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                            + input1 + " + " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + number.convertHex2Dec(input1) + " + " + number.convertHex2Dec(input2)
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + number.convertHex2Dec(result) + ConsoleColors.RESET);
                    break;
                case "-":
                    result = number.hexSubtract(input1,input2);
                    System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                            + input1 + " - " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + number.convertHex2Dec(input1) + " - " + number.convertHex2Dec(input2)
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + number.convertHex2Dec(result) + ConsoleColors.RESET);
                    break;
                case "*":
                    result = number.hexMultiply(input1,input2);
                    System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                            + input1 + " x " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                            + number.convertHex2Dec(input1) + " x " + number.convertHex2Dec(input2)
                            + ConsoleColors.GREEN_BOLD +"\n\t = " + number.convertHex2Dec(result) + ConsoleColors.RESET);
                    break;
                case "/":
                    result = number.hexDivide(input1,input2);
                    remainder = number.hexDivideRemainder(input1,input2);
                    if (remainder.equals("0")) {
                        System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                                + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                                + number.convertHex2Dec(input1) + " / " + number.convertHex2Dec(input2)
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + number.convertHex2Dec(result) + ConsoleColors.RESET);
                    } else {
                        System.out.println(ConsoleColors.RED_BOLD + "\tHexadecimal value: \n\t" + ConsoleColors.RESET
                                + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + result
                                + " Remainder : " + remainder + ConsoleColors.RESET);
                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
                                + number.convertHex2Dec(input1) + " / " + number.convertHex2Dec(input2)
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + number.convertHex2Dec(result)
                                + " Remainder : " + number.convertHex2Dec(remainder) + ConsoleColors.RESET);
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tInvalid Operator!" + ConsoleColors.RESET);
                    break;
            }
        }
    }

    public static void callConvertHexadecimal2Decimal(){

        HexCalculator number = new HexCalculator();
        HexNum hex = new HexNum();
        String result ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Hexadecimal to Decimal:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your hexadecimal number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        hex.setNumber(input);
        input = hex.checkInput();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        result = number.convertHex2Dec(input);
        if (input.equals(Number.getInvalidValue())){
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getBinaryInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            System.out.println("\tConverting Hexadecimal Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " to Decimal value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static void callConvertDecimal2Hexadecimal(){

        HexCalculator number = new HexCalculator();
        DecNum decNum = new DecNum();
        String result ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Decimal to Hexadecimal:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your decimal number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        decNum.setNumber(input);
        input = decNum.checkInput();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        result = number.convertDec2Hex(input);
        if (input.equals(Number.getInvalidValue())){
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getNumericInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            long dec = (long) Math.floor(Double.parseDouble(input));
            System.out.println("\tConverting Decimal Value " + ConsoleColors.GREEN_BOLD + dec + ConsoleColors.RESET
                    + " to Hexadecimal value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static void callConvertBigInteger2Hexadecimal(){

        HexCalculator number = new HexCalculator();
        BigIntNum bigIntNum = new BigIntNum();
        String result ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert BigInteger to Hexadecimal:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your big integer number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        bigIntNum.setNumber(input);
        input = bigIntNum.checkInput();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        result = number.convertBigInt2Hex(input);
        if (input.equals(Number.getInvalidValue())){
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getNumericInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            System.out.println("\tConverting Big Integer Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " \n\tto Hexadecimal value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    public static void callConvertHexadecimal2BigInteger(){
        HexCalculator number = new HexCalculator();
        HexNum hex = new HexNum();
        String result ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Hexadecimal to BigInteger:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your Hexadecimal number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        hex.setNumber(input);
        input = hex.checkInput();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        result = number.convertHex2BigInt(input);
        if (input.equals(Number.getInvalidValue())){
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getBinaryInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            System.out.println("\tConverting Hexadecimal Value " + ConsoleColors.GREEN_BOLD + input + ConsoleColors.RESET
                    + " to Big Integer value: " + ConsoleColors.GREEN_BOLD + result + ConsoleColors.RESET);
        }
    }

    // Control the Decimal Calculator
    public static void callDecimalCalculator(){

        DecimalCalculator number = new DecimalCalculator();
        DecNum dec = new DecNum();
        String result ="";
        String remainder = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Decimal Calculator:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your first decimal number: " + ConsoleColors.RESET);
        String input1 = scanner.nextLine();
        dec.setNumber(input1);
        input1 = dec.checkInput();
        System.out.print(ConsoleColors.RED_BOLD + "Enter your second decimal number: " + ConsoleColors.RESET);
        String input2 = scanner.nextLine();
        dec.setNumber(input2);
        input2 = dec.checkInput();
        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the operator: " + ConsoleColors.RESET
                + "\n\t1. Add:      Press" + ConsoleColors.PURPLE_BOLD + " +" + ConsoleColors.RESET
                + "\n\t2. Subtract: Press" + ConsoleColors.PURPLE_BOLD + " -" + ConsoleColors.RESET
                + "\n\t3. Multiply: Press" + ConsoleColors.PURPLE_BOLD + " *" + ConsoleColors.RESET
                + "\n\t4. Divide:   Press" + ConsoleColors.PURPLE_BOLD + " /" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your operator: " + ConsoleColors.RESET);
        String operator = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getNumericInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            switch(operator){
                case "+":
                    result = number.decAdd(input1,input2);
                    System.out.println("\n\t" + input1 + " + " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    break;
                case "-":
                    result = number.decSub(input1,input2);
                    System.out.println("\n\t" + input1 + " - " + input2
                                    + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    break;
                case "*":
                    result = number.decMultiply(input1,input2);
                    System.out.println("\n\t" + input1 + " x " + input2
                                    + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    break;
                case "/":
                    result = number.decDivide(input1,input2);
                    remainder = number.decDivideRemainder(input1,input2);
                    if (result.equals("UNDEFINED")){
                        System.out.println("\n\t" + input1 + " / " + input2 + "\n\t" + ConsoleColors.RED_BOLD + "Divider cannot be 0 " + ConsoleColors.RESET);
                    } else if (remainder.equals("0")) {
                        System.out.println("\n\t" + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    } else {
                        System.out.println("\n\t" + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + result
                                + " Remainder : " + remainder + ConsoleColors.RESET);
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tInvalid Operator!" + ConsoleColors.RESET);
                    break;
            }
        }
    }

    // Control the Big Integer Calculator
    public static void callBigIntCalculator(){

        BigIntegerCalculator number = new BigIntegerCalculator();
        BigIntNum bigInt = new BigIntNum();
        String result ="";
        String remainder = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Big Integer Calculator:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your first big integer number: " + ConsoleColors.RESET);
        String input1 = scanner.nextLine();
        bigInt.setNumber(input1);
        input1 = bigInt.checkInput();
        System.out.print(ConsoleColors.RED_BOLD + "Enter your second big integer number: " + ConsoleColors.RESET);
        String input2 = scanner.nextLine();
        bigInt.setNumber(input2);
        input2 = bigInt.checkInput();
        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the operator: " + ConsoleColors.RESET
                + "\n\t1. Add:      Press" + ConsoleColors.PURPLE_BOLD + " +" + ConsoleColors.RESET
                + "\n\t2. Subtract: Press" + ConsoleColors.PURPLE_BOLD + " -" + ConsoleColors.RESET
                + "\n\t3. Multiply: Press" + ConsoleColors.PURPLE_BOLD + " *" + ConsoleColors.RESET
                + "\n\t4. Divide:   Press" + ConsoleColors.PURPLE_BOLD + " /" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your operator: " + ConsoleColors.RESET);
        String operator = scanner.nextLine();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        if (input1.equals(Number.getInvalidValue()) || input2.equals(Number.getInvalidValue())) {
            System.out.println(ConsoleColors.RED_BOLD + "\t" + Number.getNumericInvalidValueMessage() + ConsoleColors.RESET);
        } else {
            switch(operator){
                case "+":
                    result = number.bigIntAdd(input1,input2);
                    System.out.println("\n\t" + input1 + " + " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    break;
                case "-":
                    result = number.bigIntSubtract(input1,input2);
                    System.out.println("\n\t" + input1 + " - " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    break;
                case "*":
                    result = number.bigIntMultiply(input1,input2);
                    System.out.println("\n\t" + input1 + " x " + input2
                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    break;
                case "/":
                    result = number.bigIntDivide(input1,input2);
//                    System.out.println("\n\t" + input1 + " / " + input2
//                            + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
                    remainder = number.bigIntDivRemainder(input1,input2);
//                    System.out.println(remainder);
                    if (result.equals("UNDEFINED")){
                        System.out.println("\n\t" + input1 + " / " + input2 + "\n\t" + ConsoleColors.RED_BOLD + "Divider cannot be 0 " + ConsoleColors.RESET);
                    } else if (remainder.equals("0")) {
                        System.out.println("\n\t" + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + result + ConsoleColors.RESET);
//                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
//                                + number.convertHex2Dec(input1) + " / " + number.convertHex2Dec(input2)
//                                + ConsoleColors.GREEN_BOLD + "\n\t = " + number.convertHex2Dec(result) + ConsoleColors.RESET);
                    } else {
                        System.out.println("\n\t" + input1 + " / " + input2
                                + ConsoleColors.GREEN_BOLD + "\n\t = " + result
                                + " Remainder : " + remainder + ConsoleColors.RESET);
//                        System.out.println(ConsoleColors.RED_BOLD + "\tDecimal value: \n\t" + ConsoleColors.RESET
//                                + number.convertHex2Dec(input1) + " / " + number.convertHex2Dec(input2)
//                                + ConsoleColors.GREEN_BOLD + "\n\t = " + number.convertHex2Dec(result)
//                                + " Remainder : " + number.convertHex2Dec(remainder) + ConsoleColors.RESET);
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tInvalid Operator!" + ConsoleColors.RESET);
                    break;
            }
        }
    }
}
