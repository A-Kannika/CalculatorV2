package Calculator.View;

import Calculator.Controller.BandwidthCalculator;
import Calculator.Controller.CalculatorController;
import Calculator.Controller.ConsoleColors;

import java.util.Scanner;

public class CalculatorView {

    public static void calculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Calculator:" + ConsoleColors.RESET);

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect Calculator Function: " + ConsoleColors.RESET

                + "\n\t" + ConsoleColors.PURPLE_BOLD + ConsoleColors.PURPLE_UNDERLINED + "Binary Calculator" + ConsoleColors.RESET

                + "\n\t\t 1. Binary Calculator:                   Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t\t 2. Convert Binary to Decimal:           Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t\t 3. Convert Decimal to Binary:           Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t\t 4. Convert Binary to Big Integer:       Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t\t 5. Convert Big Integer to Binary:       Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET

                + "\n\t" + ConsoleColors.PURPLE_BOLD + ConsoleColors.PURPLE_UNDERLINED + "Hexadecimal Calculator" + ConsoleColors.RESET

                + "\n\t\t 6. Hexadecimal Calculator:              Press" + ConsoleColors.PURPLE_BOLD + " 6" + ConsoleColors.RESET
                + "\n\t\t 7. Convert Hexadecimal to Decimal:      Press" + ConsoleColors.PURPLE_BOLD + " 7" + ConsoleColors.RESET
                + "\n\t\t 8. Convert Decimal to Hexadecimal:      Press" + ConsoleColors.PURPLE_BOLD + " 8" + ConsoleColors.RESET
                + "\n\t\t 9. Convert Hexadecimal to Big Integer:  Press" + ConsoleColors.PURPLE_BOLD + " 9" + ConsoleColors.RESET
                + "\n\t\t10. Convert Big Integer to Hexadecimal:  Press" + ConsoleColors.PURPLE_BOLD + " 10" + ConsoleColors.RESET

                + "\n\t" + ConsoleColors.PURPLE_BOLD + ConsoleColors.PURPLE_UNDERLINED + "Decimal Calculator" + ConsoleColors.RESET

                + "\n\t\t11. Decimal Calculator:                  Press" + ConsoleColors.PURPLE_BOLD + " 11" + ConsoleColors.RESET

                + "\n\t" + ConsoleColors.PURPLE_BOLD + ConsoleColors.PURPLE_UNDERLINED + "Big Integer Calculator" + ConsoleColors.RESET

                + "\n\t\t12. Big Integer Calculator:              Press" + ConsoleColors.PURPLE_BOLD + " 12" + ConsoleColors.RESET


                + "\n\t" + ConsoleColors.PURPLE_BOLD + ConsoleColors.PURPLE_UNDERLINED + "Bandwidth Calculator Function" + ConsoleColors.RESET

                + "\n\t\t13. Data Unit Converter:                 Press" + ConsoleColors.PURPLE_BOLD + " 13" + ConsoleColors.RESET
                + "\n\t\t14. Download/Upload Time Calculator:     Press" + ConsoleColors.PURPLE_BOLD + " 14" + ConsoleColors.RESET
                + "\n\t\t15. Website Bandwidth Calculator:        Press" + ConsoleColors.PURPLE_BOLD + " 15" + ConsoleColors.RESET
                + "\n\t\t16. Hosting Bandwidth Converter:         Press" + ConsoleColors.PURPLE_BOLD + " 16" + ConsoleColors.RESET

//                + "\n\t" + ConsoleColors.PURPLE_BOLD + ConsoleColors.PURPLE_UNDERLINED + "Run Test Program" + ConsoleColors.RESET
//
//                + "\n\t\t15. Run Test Mode:                       Press" + ConsoleColors.PURPLE_BOLD + " 15" + ConsoleColors.RESET

                + ConsoleColors.RED_BOLD + "\nSelect Your Calculation Function: " + ConsoleColors.RESET);
        int unit = scanner.nextInt();

        switch (unit){
            case 1:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Binary Calculator function.\n" + ConsoleColors.RESET);
                CalculatorController.callBinaryCalculator();
                break;
            case 2:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Binary to Decimal function.\n" + ConsoleColors.RESET);
                CalculatorController.callConvertBinary2Decimal();
                break;
            case 3:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Decimal to Binary function.\n" + ConsoleColors.RESET);
                CalculatorController.callConvertDecimal2Binary();
                break;
            case 4:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Binary to Big Integer function.\n" + ConsoleColors.RESET);
                CalculatorController.callConvertBinary2BigInteger();
                break;
            case 5:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Big Integer to Binary function.\n" + ConsoleColors.RESET);
                CalculatorController.callConvertBigInteger2Binary();
                break;
            case 6:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Hexadecimal Calculator function.\n" + ConsoleColors.RESET);
                CalculatorController.callHexadecimalCalculator();
                break;
            case 7:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Hexadecimal to Decimal function.\n" + ConsoleColors.RESET);
                CalculatorController.callConvertHexadecimal2Decimal();
                break;
            case 8:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Decimal to Hexadecimal function.\n" + ConsoleColors.RESET);
                CalculatorController.callConvertDecimal2Hexadecimal();
                break;
            case 9:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Hexadecimal to Big Integer function.\n" + ConsoleColors.RESET);
                CalculatorController.callConvertHexadecimal2BigInteger();
                break;
            case 10:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Convert Big Integer to Hexadecimal function.\n" + ConsoleColors.RESET);
                CalculatorController.callConvertBigInteger2Hexadecimal();
                break;
            case 11:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Decimal Calculator function\n" + ConsoleColors.RESET);
                CalculatorController.callDecimalCalculator();
                break;
            case 12:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Big Integer Calculator function\n" + ConsoleColors.RESET);
                CalculatorController.callBigIntCalculator();
                break;
            case 13:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Data Unit Converter function.\n" + ConsoleColors.RESET);
                BandwidthCalculator.callConvertDataUnit();
                break;
            case 14:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Download/Upload Time Calculator function.\n" + ConsoleColors.RESET);
                BandwidthCalculator.callCalcDownloadUploadTime();
                break;
            case 15:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Website Bandwidth Calculator function.\n" + ConsoleColors.RESET);
                BandwidthCalculator.callCalcWebsiteBandwidth();
                break;
            case 16:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Hosting Bandwidth Converter function.\n" + ConsoleColors.RESET);
                BandwidthCalculator.callConvertHostingBandwidth();
                break;
//            case 15:
//                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select Run Test Mode.\n" + ConsoleColors.RESET);
//                RunTest.runTest();
//                break;
            default:
                System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid Function!" + ConsoleColors.RESET);
                break;
        }
    }
}
