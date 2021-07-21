package Calculator.Controller;

import Calculator.Model.CheckInput;

public class ConvertHostingBandwidth extends BandwidthCalculator {

    public static void main(String[] args) {
        convertMonthlyUsage2Bandwidth(5,"-1", 1);
        convertMonthlyUsage2Bandwidth(5,"rt", 2);
        convertMonthlyUsage2Bandwidth(5,"1", 3);
        convertMonthlyUsage2Bandwidth(6,"1", 4);
        convertMonthlyUsage2Bandwidth(5,"1", 6);
        convertBandwidth2MonthlyUsage(2,"-tyeuwer2",1);
        convertBandwidth2MonthlyUsage(2,"2",2);
        convertBandwidth2MonthlyUsage(2,"2",3);
        convertBandwidth2MonthlyUsage(6,"2",4);
        convertBandwidth2MonthlyUsage(2,"2",6);

    }
    public static void convertMonthlyUsage2Bandwidth(int unit1, String monthlyUsage, int unit2){
        double result = calcMonthlyUsage2Bandwidth(unit1, monthlyUsage, unit2);
        if (result == -1){
            System.out.println(ConsoleColors.RED_BOLD + "\tPlease provide a positive value to convert." + ConsoleColors.RESET);
        } else {
            switch (unit1){
                case 1: //byte per month
                    switch (unit2){
                        case 1: //bit per second
                            System.out.println("\t" + monthlyUsage + " Bytes (B) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " bit/s." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobits per second
                            System.out.println("\t" + monthlyUsage + " Bytes (B) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kbit/s." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabits per second
                            System.out.println("\t" + monthlyUsage + " Bytes (B) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Mbit/s." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabits per second
                            System.out.println("\t" + monthlyUsage + " Bytes (B) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gbit/s." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabits per second
                            System.out.println("\t" + monthlyUsage + " Bytes (B) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Tbit/s." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid bandwidth unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 2: //Kilobyte per month
                    switch (unit2){
                        case 1: //bit per second
                            System.out.println("\t" + monthlyUsage + " Kilobytes (KB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD+ result + " bit/s." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobits per second
                            System.out.println("\t" + monthlyUsage + " Kilobytes (KB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kbit/s." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabits per second
                            System.out.println("\t" + monthlyUsage + " Kilobytes (KB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Mbit/s." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabits per second
                            System.out.println("\t" + monthlyUsage + " Kilobytes (KB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gbit/s." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabits per second
                            System.out.println("\t" + monthlyUsage + " Kilobytes (KB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Tbit/s." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid bandwidth unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 3: //Megabyte per month
                    switch (unit2){
                        case 1: //bit per second
                            System.out.println("\t" + monthlyUsage + " Megabytes (MB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " bit/s." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobits per second
                            System.out.println("\t" + monthlyUsage + " Megabytes (MB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kbit/s." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabits per second
                            System.out.println("\t" + monthlyUsage + " Megabytes (MB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Mbit/s." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabits per second
                            System.out.println("\t" + monthlyUsage + " Megabytes (MB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gbit/s." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabits per second
                            System.out.println("\t" + monthlyUsage + " Megabytes (MB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Tbit/s." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid bandwidth unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 4: //Megabyte per month
                    switch (unit2){
                        case 1: //bit per second
                            System.out.println("\t" + monthlyUsage + " Gigabytes (GB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " bit/s." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobits per second
                            System.out.println("\t" + monthlyUsage + " Gigabytes (GB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kbit/s." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabits per second
                            System.out.println("\t" + monthlyUsage + " Gigabytes (GB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Mbit/s." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabits per second
                            System.out.println("\t" + monthlyUsage + " Gigabytes (GB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gbit/s." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabits per second
                            System.out.println("\t" + monthlyUsage + " Gigabytes (GB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Tbit/s." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid bandwidth unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 5: //Megabyte per month
                    switch (unit2){
                        case 1: //bit per second
                            System.out.println("\t" + monthlyUsage + " Terabytes (TB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " bit/s." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobits per second
                            System.out.println("\t" + monthlyUsage + " Terabytes (TB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kbit/s." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabits per second
                            System.out.println("\t" + monthlyUsage + " Terabytes (TB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Mbit/s." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabits per second
                            System.out.println("\t" + monthlyUsage + " Terabytes (TB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gbit/s." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabits per second
                            System.out.println("\t" + monthlyUsage + " Terabytes (TB) per month is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Tbit/s." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid bandwidth unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid monthly usage unit!" + ConsoleColors.RESET);
                    break;
            }
        }
    }

    public static double calcMonthlyUsage2Bandwidth(int unit1, String monthlyUsage, int unit2){
        double bandWidth = 0, byteData;
        double monthlyUsages = CheckInput.checkPositiveNumber(monthlyUsage);
        if (monthlyUsages == -1){
            bandWidth = -1;
        } else {
            switch(unit1){
                case 1: //byte per month
                    byteData = monthlyUsages;
                    bandWidth = getBandWidth(unit2, bandWidth, byteData);
                    break;
                case 2: //Kilobyte per month
                    byteData = ConvertDataUnits.convertKilobytes2Bytes(monthlyUsages);
                    bandWidth = getBandWidth(unit2, bandWidth, byteData);
                    break;
                case 3: //Megabyte per month
                    byteData = ConvertDataUnits.convertMegabytes2Bytes(monthlyUsages);
                    bandWidth = getBandWidth(unit2, bandWidth, byteData);
                    break;
                case 4: //Gigabyte per month
                    byteData = ConvertDataUnits.convertGigabytes2Bytes(monthlyUsages);
                    bandWidth = getBandWidth(unit2, bandWidth, byteData);
                    break;
                case 5: //Terabyte per month
                    byteData = ConvertDataUnits.convertTerabytes2Bytes(monthlyUsages);
                    bandWidth = getBandWidth(unit2, bandWidth, byteData);
                    break;
                default:
                    break;
            }
        }
        return bandWidth;
    }

    private static double getBandWidth(int unit2, double bandWidth, double byteData) {
        switch (unit2){
            case 1://bit per second
                bandWidth = convertByte2BitPerSec(byteData);
                break;
            case 2://Kilobits per second
                bandWidth = convertByte2KilobitPerSec(byteData);
                break;
            case 3://Megabits per second
                bandWidth = convertByte2MegabitPerSec(byteData);
                break;
            case 4://Gigabits per second
                bandWidth = convertByte2GigabitPerSec(byteData);
                break;
            case 5://Terabits per second
                bandWidth = convertByte2TerabitPerSec(byteData);
                break;
            default:
                break;
        }
        return bandWidth;
    }

    public static void convertBandwidth2MonthlyUsage(int unit1, String bandwidth, int unit2) {
        double result = calcBandwidth2MonthlyUsage(unit1, bandwidth, unit2);
        if (result == -1){
            System.out.println(ConsoleColors.RED_BOLD + "\tPlease provide a positive value to convert." + ConsoleColors.RESET);
        } else {
            switch (unit1){
                case 1: //bit per second
                    switch (unit2){
                        case 1: //byte per month
                            System.out.println("\t" + bandwidth + " bit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Bytes (B) per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobyte per month
                            System.out.println("\t" + bandwidth + " bit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kilobytes (KB) per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabyte per month
                            System.out.println("\t" + bandwidth + " bit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Megabytes (MB) per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabyte per month
                            System.out.println("\t" + bandwidth + " bit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gigabytes (GB) per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabyte per month
                            System.out.println("\t" + bandwidth + " bit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Terabytes (TB) per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid monthly usage unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 2: //Kilobit per second
                    switch (unit2){
                        case 1: //byte per month
                            System.out.println("\t" + bandwidth + " Kbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Bytes (B) per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobyte per month
                            System.out.println("\t" + bandwidth + " Kbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kilobytes (KB) per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabyte per month
                            System.out.println("\t" + bandwidth + " Kbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Megabytes (MB) per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabyte per month
                            System.out.println("\t" + bandwidth + " Kbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gigabytes (GB) per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabyte per month
                            System.out.println("\t" + bandwidth + " Kbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Terabytes (TB) per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid monthly usage unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 3: //Megabit per second
                    switch (unit2){
                        case 1: //byte per month
                            System.out.println("\t" + bandwidth + " Mbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Bytes (B) per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobyte per month
                            System.out.println("\t" + bandwidth + " Mbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kilobytes (KB) per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabyte per month
                            System.out.println("\t" + bandwidth + " Mbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Megabytes (MB) per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabyte per month
                            System.out.println("\t" + bandwidth + " Mbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gigabytes (GB) per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabyte per month
                            System.out.println("\t" + bandwidth + " Mbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Terabytes (TB) per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid monthly usage unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 4: //Gigabit per second
                    switch (unit2){
                        case 1: //byte per month
                            System.out.println("\t" + bandwidth + " Gbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Bytes (B) per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobyte per month
                            System.out.println("\t" + bandwidth + " Gbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kilobytes (KB) per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabyte per month
                            System.out.println("\t" + bandwidth + " Gbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Megabytes (MB) per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabyte per month
                            System.out.println("\t" + bandwidth + " Gbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gigabytes (GB) per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabyte per month
                            System.out.println("\t" + bandwidth + " Gbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Terabytes (TB) per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid monthly usage unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 5: //Terabit per second
                    switch (unit2){
                        case 1: //byte per month
                            System.out.println("\t" + bandwidth + " Tbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Bytes (B) per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobyte per month
                            System.out.println("\t" + bandwidth + " Tbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Kilobytes (KB) per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabyte per month
                            System.out.println("\t" + bandwidth + " Tbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Megabytes (MB) per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabyte per month
                            System.out.println("\t" + bandwidth + " Tbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Gigabytes (GB) per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabyte per month
                            System.out.println("\t" + bandwidth + " Tbit/s is equivalent to "
                                    + ConsoleColors.GREEN_BOLD + result + " Terabytes (TB) per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "You choose invalid monthly usage unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "You choose invalid bandwidth unit!" + ConsoleColors.RESET);
                    break;
            }
        }
    }

    public static double calcBandwidth2MonthlyUsage(int unit1, String bandwidth, int unit2){
        double monthlyUsage = 0, bitData;
        double bandWidths = CheckInput.checkPositiveNumber(bandwidth);
        if (bandWidths == -1){
            monthlyUsage = -1;
        } else {
            switch (unit1){
                case 1: //bit per second
                    bitData = bandWidths;
                    monthlyUsage = getMonthlyUsage(unit2, monthlyUsage, bitData);
                    break;
                case 2: //Kilobit per second
                    bitData = ConvertDataUnits.convertKilobits2Bits(bandWidths);
                    monthlyUsage = getMonthlyUsage(unit2, monthlyUsage, bitData);
                    break;
                case 3: //Megabit per second
                    bitData = ConvertDataUnits.convertMegabits2Bits(bandWidths);
                    monthlyUsage = getMonthlyUsage(unit2, monthlyUsage, bitData);
                    break;
                case 4: //Gigabit per second
                    bitData = ConvertDataUnits.convertGigabits2Bits(bandWidths);
                    monthlyUsage = getMonthlyUsage(unit2, monthlyUsage, bitData);
                    break;
                case 5: //Terabit per second
                    bitData = ConvertDataUnits.convertTerabits2Bits(bandWidths);
                    monthlyUsage = getMonthlyUsage(unit2, monthlyUsage, bitData);
                    break;
                default:
                    break;
            }
        }
        return monthlyUsage;
    }

    private static double getMonthlyUsage(int unit2, double monthlyUsage, double bitData) {
        switch (unit2){
            case 1: //byte per month
                monthlyUsage = convertBits2BytePerMonth(bitData);
                break;
            case 2: //Kilobyte per month
                monthlyUsage = convertBits2KilobytePerMonth(bitData);
                break;
            case 3: //Megabyte per month
                monthlyUsage = convertBits2MegabytePerMonth(bitData);
                break;
            case 4: //Gigabyte per month
                monthlyUsage = convertBits2GigabytePerMonth(bitData);
                break;
            case 5: //Terabyte per month
                monthlyUsage = convertBits2TerabytePerMonth(bitData);
                break;
            default:
                break;
        }
        return monthlyUsage;
    }

    //convert to bits/s
    public static double convertByte2BitPerSec(double input){
        return ConvertDataUnits.convertBytes2Bits(input)/(365.25 * 24 * 60 * 60 / 12);
    }

    public static double convertByte2KilobitPerSec(double input){
        return ConvertDataUnits.convertBytes2Bits(input)/(365.25 * 24 * 60 * 60 * 1_000L/ 12);
    }

    public static double convertByte2MegabitPerSec(double input){
        return ConvertDataUnits.convertBytes2Bits(input)/(365.25 * 24 * 60 * 60 * 1_000_000L/ 12);
    }

    public static double convertByte2GigabitPerSec(double input){
        return ConvertDataUnits.convertBytes2Bits(input)/(365.25 * 24 * 60 * 60 * 1_000_000_000L/ 12);
    }

    public static double convertByte2TerabitPerSec(double input){
        return ConvertDataUnits.convertBytes2Bits(input)/(365.25 * 24 * 60 * 60 * 1_000_000_000_000L/ 12);
    }

    //convert to Byte per Month
    public static double convertBits2BytePerMonth(double input){
        return ConvertDataUnits.convertBits2Bytes(input) * (24 * 60 * 60 * 30.4375);
    }

    public static double convertBits2KilobytePerMonth(double input){
        return ConvertDataUnits.convertBits2Bytes(input) * (24 * 60 * 60 * 30.4375)/ 1_000L;
    }

    public static double convertBits2MegabytePerMonth(double input){
        return ConvertDataUnits.convertBits2Bytes(input) * (24 * 60 * 60 * 30.4375)/ 1_000_000L;
    }

    public static double convertBits2GigabytePerMonth(double input){
        return ConvertDataUnits.convertBits2Bytes(input) * (24 * 60 * 60 * 30.4375)/ 1_000_000_000L;
    }

    public static double convertBits2TerabytePerMonth(double input){
        return ConvertDataUnits.convertBits2Bytes(input) * (24 * 60 * 60 * 30.4375)/ 1_000_000_000_000L;
    }

}
