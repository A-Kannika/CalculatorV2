package Calculator.Controller;

import java.util.Scanner;

public class BandwidthCalculator extends Calculator {
    public static void main(String[] args) {

    }

    public static void callConvertDataUnit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Data Unit Converter:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your data number: " + ConsoleColors.RESET);
        String input = scanner.nextLine();
        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the original unit: " + ConsoleColors.RESET
                + "\n\t 1. bits (b):        Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. kilobits (kb):   Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. megabits (mb):   Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. gigabits (gb):   Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. terabits (tb):   Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + "\n\t 6. Bytes (B):       Press" + ConsoleColors.PURPLE_BOLD + " 6" + ConsoleColors.RESET
                + "\n\t 7. Kilobytes (KB):  Press" + ConsoleColors.PURPLE_BOLD + " 7" + ConsoleColors.RESET
                + "\n\t 8. Megabytes (MB):  Press" + ConsoleColors.PURPLE_BOLD + " 8" + ConsoleColors.RESET
                + "\n\t 9. Gigabytes (GB):  Press" + ConsoleColors.PURPLE_BOLD + " 9" + ConsoleColors.RESET
                + "\n\t10. Terabytes (TB):  Press" + ConsoleColors.PURPLE_BOLD + " 10" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your original unit: " + ConsoleColors.RESET);
        int unit = scanner.nextInt();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        ConvertDataUnits.convertDataUnits(unit,input);
    }

    public static void callCalcDownloadUploadTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Download/Upload Time Calculator:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your file size number: " + ConsoleColors.RESET);
        String input1 = scanner.nextLine();

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the file size unit: " + ConsoleColors.RESET
                + "\n\t 1. Bytes (B):       Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Kilobytes (KB):  Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. Megabytes (MB):  Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. Gigabytes (GB):  Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. Terabytes (TB):  Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your file size unit: " + ConsoleColors.RESET);
        int unit1 = scanner.nextInt();

        System.out.print(ConsoleColors.RED_BOLD + "\nEnter your bandwidth number: " + ConsoleColors.RESET);
        scanner.nextLine();
        String input2 = scanner.nextLine();


        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the bandwidth unit: " + ConsoleColors.RESET
                + "\n\t 1. bits/s:    Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Kbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. Mbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. Gbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. Tbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your bandwidth unit: " + ConsoleColors.RESET);
        int unit2 = scanner.nextInt();
        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        CalcDownloadUploadTime.calcDownloadUploadTime(unit1,input1,unit2,input2);
    }

    public static void callCalcWebsiteBandwidth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Website Bandwidth Calculator:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your page views number: " + ConsoleColors.RESET);
        String input1 = scanner.nextLine();

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect page view unit: " + ConsoleColors.RESET
                + "\n\t 1. Per Second:  Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Per Minute:  Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. Per Hour:    Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. Per Day:     Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. Per Week:    Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + "\n\t 6. Per Month:   Press" + ConsoleColors.PURPLE_BOLD + " 6" + ConsoleColors.RESET
                + "\n\t 7. Per Year:    Press" + ConsoleColors.PURPLE_BOLD + " 7" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your page veiws unit: " + ConsoleColors.RESET);
        int unit1 = scanner.nextInt();

        System.out.print(ConsoleColors.RED_BOLD + "\nEnter your average page size number: " + ConsoleColors.RESET);
        scanner.nextLine();
        String input2 = scanner.nextLine();

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the average page size unit: " + ConsoleColors.RESET
                + "\n\t 1. Bytes (B):       Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Kilobytes (KB):  Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. Megabytes (MB):  Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. Gigabytes (GB):  Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. Terabytes (TB):  Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your average page size unit: " + ConsoleColors.RESET);
        int unit2 = scanner.nextInt();

        System.out.print(ConsoleColors.RED_BOLD + "\nEnter your redundancy factor number: " + ConsoleColors.RESET);
        scanner.nextLine();
        String input3 = scanner.nextLine();

        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        CalcWebsiteBandwidth.calcWebsiteBandwidth(unit1,input1,unit2,input2,input3);
    }

    public static void callConvertHostingBandwidth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Hosting Bandwidth Converter:" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "\nSelect Converter Functions: " + ConsoleColors.RESET
                + "\n\t 1. Convert Monthly Usage to Bandwidth:  Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Convert Bandwidth to Monthly Usage:  Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your function: " + ConsoleColors.RESET);
        int unit = scanner.nextInt();
        switch (unit){
            case 1:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select to Convert Monthly Usage to Bandwidth.\n" + ConsoleColors.RESET);
                callConvertMonthlyUsage2Bandwidth();
                break;
            case 2:
                System.out.println(ConsoleColors.GREEN_BOLD + "\nYou select to Convert Bandwidth to Monthly Usage.\n" + ConsoleColors.RESET);
                callConvertBandwidth2MonthlyUsage();
                break;
            default:
                System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid Function!" + ConsoleColors.RESET);
                break;
        }
    }

    public static void callConvertMonthlyUsage2Bandwidth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Monthly Usage to Bandwidth:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your monthly usage data: " + ConsoleColors.RESET);
        String input = scanner.nextLine();

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the monthly usage data unit: " + ConsoleColors.RESET
                + "\n\t 1. Bytes (B):       Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Kilobytes (KB):  Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. Megabytes (MB):  Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. Gigabytes (GB):  Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. Terabytes (TB):  Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your monthly usage data unit: " + ConsoleColors.RESET);
        int unit1 = scanner.nextInt();

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the bandwidth unit: " + ConsoleColors.RESET
                + "\n\t 1. bits/s:    Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Kbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. Mbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. Gbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. Tbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your bandwidth unit: " + ConsoleColors.RESET);
        int unit2 = scanner.nextInt();

        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        ConvertHostingBandwidth.convertMonthlyUsage2Bandwidth(unit1,input,unit2);
    }

    public static void callConvertBandwidth2MonthlyUsage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED + "Convert Bandwidth to Monthly Usage:\n" + ConsoleColors.RESET);
        System.out.print(ConsoleColors.RED_BOLD + "Enter your bandwidth data: " + ConsoleColors.RESET);
        String input = scanner.nextLine();

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the bandwidth unit: " + ConsoleColors.RESET
                + "\n\t 1. bits/s:    Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Kbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. Mbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. Gbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. Tbits/s:   Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your bandwidth unit: " + ConsoleColors.RESET);
        int unit1 = scanner.nextInt();

        System.out.print(ConsoleColors.RED_BOLD + "\nSelect the monthly usage data unit: " + ConsoleColors.RESET
                + "\n\t 1. Bytes (B):       Press" + ConsoleColors.PURPLE_BOLD + " 1" + ConsoleColors.RESET
                + "\n\t 2. Kilobytes (KB):  Press" + ConsoleColors.PURPLE_BOLD + " 2" + ConsoleColors.RESET
                + "\n\t 3. Megabytes (MB):  Press" + ConsoleColors.PURPLE_BOLD + " 3" + ConsoleColors.RESET
                + "\n\t 4. Gigabytes (GB):  Press" + ConsoleColors.PURPLE_BOLD + " 4" + ConsoleColors.RESET
                + "\n\t 5. Terabytes (TB):  Press" + ConsoleColors.PURPLE_BOLD + " 5" + ConsoleColors.RESET
                + ConsoleColors.RED_BOLD + "\nSelect your monthly usage data unit: " + ConsoleColors.RESET);
        int unit2 = scanner.nextInt();

        System.out.println(ConsoleColors.BLUE_BOLD + "\nResult: " + ConsoleColors.RESET);
        ConvertHostingBandwidth.convertBandwidth2MonthlyUsage(unit1,input,unit2);

    }


}

