package Calculator.Controller;

import Calculator.Model.CheckInput;

import java.math.BigDecimal;

public class ConvertDataUnits extends BandwidthCalculator {

    public static void main(String[] args) {
        convertDataUnits(11, "1");

    }

    public static void convertDataUnits(int unit, String num) {
        double input = CheckInput.checkPositiveNumber(num);
        double i = 0;
        if (input == -1) {
            System.out.println(ConsoleColors.RED_BOLD + "\tPlease provide a positive value to convert." + ConsoleColors.RESET);
        } else {
            switch (unit) {
                case 1:
                    i = convertBits2Bits(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " b" + ConsoleColors.RESET + " is equivalent to any of the following:");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBits2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBits2Megabits(i) + " megabits (mb)\n\t"
                            + convertBits2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBits2Terabits(i) + " terabits (tb)\n\t"
                            + convertBits2Bytes(i) + " Bytes (B)\n\t"
                            + convertBits2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBits2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBits2Gigabytes(i) + " Gigabytes (GB)\n\t"
                            + convertBits2Terabytes(i) + " Terabytes (TB)" + ConsoleColors.RESET);
                    break;
                case 2:
                    i = convertKilobits2Bits(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " kb " + ConsoleColors.RESET + "is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBits2Bits(i) + " bits (b)\n\t"
                            + convertBits2Megabits(i) + " megabits (mb)\n\t"
                            + convertBits2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBits2Terabits(i) + " terabits (tb)\n\t"
                            + convertBits2Bytes(i) + " Bytes (B)\n\t"
                            + convertBits2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBits2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBits2Gigabytes(i) + " Gigabytes (GB)\n\t"
                            + convertBits2Terabytes(i) + " Terabytes (TB)" + ConsoleColors.RESET);
                    break;
                case 3:
                    i = convertMegabits2Bits(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " mb " + ConsoleColors.RESET + "is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBits2Bits(i) + " bits (b)\n\t"
                            + convertBits2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBits2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBits2Terabits(i) + " terabits (tb)\n\t"
                            + convertBits2Bytes(i) + " Bytes (B)\n\t"
                            + convertBits2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBits2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBits2Gigabytes(i) + " Gigabytes (GB)\n\t"
                            + convertBits2Terabytes(i) + " Terabytes (TB)" + ConsoleColors.RESET);
                    break;
                case 4:
                    i = convertGigabits2Bits(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " gb " + ConsoleColors.RESET + "is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBits2Bits(i) + " bits (b)\n\t"
                            + convertBits2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBits2Megabits(i) + " megabits (mb)\n\t"
                            + convertBits2Terabits(i) + " terabits (tb)\n\t"
                            + convertBits2Bytes(i) + " Bytes (B)\n\t"
                            + convertBits2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBits2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBits2Gigabytes(i) + " Gigabytes (GB)\n\t"
                            + convertBits2Terabytes(i) + " Terabytes (TB)" + ConsoleColors.RESET);
                    break;
                case 5:
                    i = convertTerabits2Bits(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " tb " + ConsoleColors.RESET +"is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBits2Bits(i) + " bits (b)\n\t"
                            + convertBits2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBits2Megabits(i) + " megabits (mb)\n\t"
                            + convertBits2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBits2Bytes(i) + " Bytes (B)\n\t"
                            + convertBits2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBits2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBits2Gigabytes(i) + " Gigabytes (GB)\n\t"
                            + convertBits2Terabytes(i) + " Terabytes (TB)" + ConsoleColors.RESET);
                    break;
                case 6:
                    i = convertBytes2Bytes(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " B " + ConsoleColors.RESET + "is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBytes2Bits(i) + " bits (b)\n\t"
                            + convertBytes2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBytes2Megabits(i) + " megabits (mb)\n\t"
                            + convertBytes2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBytes2Terabits(i) + " terabits (tb)\n\t"
                            + convertBytes2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBytes2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBytes2Gigabytes(i) + " Gigabytes (GB)\n\t"
                            + convertBytes2Terabytes(i) + " Terabytes (TB)"+ ConsoleColors.RESET);
                    break;
                case 7:
                    i = convertKilobytes2Bytes(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " KB " + ConsoleColors.RESET + "is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBytes2Bits(i) + " bits (b)\n\t"
                            + convertBytes2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBytes2Megabits(i) + " megabits (mb)\n\t"
                            + convertBytes2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBytes2Terabits(i) + " terabits (tb)\n\t"
                            + convertBytes2Bytes(i) + " Bytes (B)\n\t"
                            + convertBytes2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBytes2Gigabytes(i) + " Gigabytes (GB)\n\t"
                            + convertBytes2Terabytes(i) + " Terabytes (TB)" + ConsoleColors.RESET);
                    break;
                case 8:
                    i = convertMegabytes2Bytes(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " MB " + ConsoleColors.RESET + "is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBytes2Bits(i) + " bits (b)\n\t"
                            + convertBytes2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBytes2Megabits(i) + " megabits (mb)\n\t"
                            + convertBytes2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBytes2Terabits(i) + " terabits (tb)\n\t"
                            + convertBytes2Bytes(i) + " Bytes (B)\n\t"
                            + convertBytes2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBytes2Gigabytes(i) + " Gigabytes (GB)\n\t"
                            + convertBytes2Terabytes(i) + " Terabytes (TB)" + ConsoleColors.RESET);
                    break;
                case 9:
                    i = convertGigabytes2Bytes(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " GB " + ConsoleColors.RESET + "is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBytes2Bits(i) + " bits (b)\n\t"
                            + convertBytes2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBytes2Megabits(i) + " megabits (mb)\n\t"
                            + convertBytes2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBytes2Terabits(i) + " terabits (tb)\n\t"
                            + convertBytes2Bytes(i) + " Bytes (B)\n\t"
                            + convertBytes2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBytes2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBytes2Terabytes(i) + " Terabytes (TB)" + ConsoleColors.RESET);
                    break;
                case 10:
                    i = convertTerabytes2Bytes(input);
                    System.out.println(ConsoleColors.GREEN_BOLD + input + " TB " + ConsoleColors.RESET + "is equivalent to any of the following:\t");
                    System.out.println(ConsoleColors.GREEN_BOLD + "\t" + convertBytes2Bits(i) + " bits (b)\n\t"
                            + convertBytes2Kilobits(i) + " kilobits (kb)\n\t"
                            + convertBytes2Megabits(i) + " megabits (mb)\n\t"
                            + convertBytes2Gigabits(i) + " gigabits (gb)\n\t"
                            + convertBytes2Terabits(i) + " terabits (tb)\n\t"
                            + convertBytes2Bytes(i) + " Bytes (B)\n\t"
                            + convertBytes2Kilobytes(i) + " Kilobytes (KB)\n\t"
                            + convertBytes2Megabytes(i) + " Megabytes (MB)\n\t"
                            + convertBytes2Gigabytes(i) + " Gigabytes (GB)" + ConsoleColors.RESET);
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid unit!" + ConsoleColors.RESET);
                    break;
            }
        }
    }

    // Convert from another bits to bits.
    public static double convertKilobits2Bits(double b) {
        return new BigDecimal(Double.toString(b * 1_000L)).doubleValue();
    }

    public static double convertMegabits2Bits(double b) {
        return new BigDecimal(Double.toString(b * 1_000_000L)).doubleValue();
    }

    public static double convertGigabits2Bits(double b) {
        return new BigDecimal(Double.toString(b * 1_000_000_000L)).doubleValue();
    }

    public static double convertTerabits2Bits(double b) {
        return new BigDecimal(Double.toString(b * 1_000_000_000_000L)).doubleValue();
    }

    // Convert from Bits to all data units.
    public static double convertBits2Bits(double b) {
        return new BigDecimal(Double.toString(b)).doubleValue();
    }

    public static double convertBits2Kilobits(double b) {
        return new BigDecimal(Double.toString(b / 1_000L)).doubleValue();
    }

    public static double convertBits2Megabits(double b) {
        return new BigDecimal(Double.toString(b / 1_000_000L)).doubleValue();
    }

    public static double convertBits2Gigabits(double b) {
        return new BigDecimal(Double.toString(b / 1_000_000_000L)).doubleValue();
    }

    public static double convertBits2Terabits(double b) {
        return new BigDecimal(Double.toString(b / 1_000_000_000_000L)).doubleValue();
    }

    public static double convertBits2Bytes(double b) {
        return new BigDecimal(Double.toString(b / 8L)).doubleValue();
    }

    public static double convertBits2Kilobytes(double b) {
        return new BigDecimal(Double.toString(b / 8_000L)).doubleValue();
    }

    public static double convertBits2Megabytes(double b) {
        return new BigDecimal(Double.toString(b / 8_000_000L)).doubleValue();
    }

    public static double convertBits2Gigabytes(double b) {
        return new BigDecimal(Double.toString(b / 8_000_000_000L)).doubleValue();
    }

    public static double convertBits2Terabytes(double b) {
        return new BigDecimal(Double.toString(b / 8_000_000_000_000L)).doubleValue();
    }

    // Convert from another bytes to bytes.
    public static double convertKilobytes2Bytes(double b) {
        return new BigDecimal(Double.toString(b * 1_000L)).doubleValue();
    }

    public static double convertGigabytes2Bytes(double b) {
        return new BigDecimal(Double.toString(b * 1_000_000_000L)).doubleValue();
    }

    public static double convertTerabytes2Bytes(double b) {
        return new BigDecimal(Double.toString(b * 1_000_000_000_000L)).doubleValue();
    }

    // Convert from Bytes to all data units.
    public static double convertBytes2Bytes(double b) {
        return new BigDecimal(Double.toString(b)).doubleValue();
    }

    public static double convertBytes2Kilobytes(double b) {
        return new BigDecimal(Double.toString(b / 1_000L)).doubleValue();
    }

    public static double convertBytes2Megabytes(double b) {
        return new BigDecimal(Double.toString(b / 1_000_000L)).doubleValue();
    }

    public static double convertBytes2Gigabytes(double b) {
        return new BigDecimal(Double.toString(b / 1_000_000_000L)).doubleValue();
    }

    public static double convertBytes2Terabytes(double b) {
        return new BigDecimal(Double.toString(b / 1_000_000_000_000L)).doubleValue();
    }

    public static double convertBytes2Bits(double b) {
        return new BigDecimal(Double.toString(b * 8)).doubleValue();
    }

    public static double convertBytes2Kilobits(double b) {
        return new BigDecimal(Double.toString(b * 8 / 1_000L)).doubleValue();
    }

    public static double convertBytes2Megabits(double b) {
        return new BigDecimal(Double.toString(b * 8 / 1_000_000L)).doubleValue();
    }

    public static double convertBytes2Gigabits(double b) {
        return new BigDecimal(Double.toString(b * 8 / 1_000_000_000L)).doubleValue();
    }

    public static double convertBytes2Terabits(double b) {
        return new BigDecimal(Double.toString(b * 8 / 1_000_000_000_000L)).doubleValue();
    }

    //run test mode
    //This is for run test I will complete all of converting class

    public static double convertMegabytes2Bits(double b) {
        return new BigDecimal(Double.toString(b * 8 * 1_000_000L)).doubleValue();
    }

    public static double convertMegabytes2Kilobits(double b) {
        return new BigDecimal(Double.toString(b * 8 * 1_000L)).doubleValue();
    }

    public static double convertMegabytes2Megabits(double b) {
        return new BigDecimal(Double.toString(b * 8)).doubleValue();
    }

    public static double convertMegabytes2Gigabits(double b) {
        return new BigDecimal(Double.toString(b * 8 / 1_000L)).doubleValue();
    }

    public static double convertMegabytes2Terabits(double b) {
        return new BigDecimal(Double.toString(b * 8 / 1_000_000L)).doubleValue();
    }

    public static double convertMegabytes2Bytes(double b) {
        return new BigDecimal(Double.toString(b * 1_000_000L)).doubleValue();
    }

    public static double convertMegabytes2Kilobytes(double b) {
        return new BigDecimal(Double.toString(b * 1_000L)).doubleValue();
    }

    public static double convertMegabytesGigabytes(double b) {
        return new BigDecimal(Double.toString(b / 1_000L)).doubleValue();
    }

    public static double convertMegabytesTerabytes(double b) {
        return new BigDecimal(Double.toString(b / 1_000_000L)).doubleValue();
    }


}
