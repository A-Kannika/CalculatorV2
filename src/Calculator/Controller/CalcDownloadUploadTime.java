package Calculator.Controller;
import Calculator.Model.CheckInput;

public class CalcDownloadUploadTime extends BandwidthCalculator {
    public static void main(String[] args) {
        calcDownloadUploadTime(1,"1",1,"1");
        calcDownloadUploadTime(2,"1",1,"1");
        calcDownloadUploadTime(3,"1",1,"1");
        calcDownloadUploadTime(4,"1",1,"1");
        calcDownloadUploadTime(5,"1",1,"1");
        calcDownloadUploadTime(1,"1",1,"1");
        calcDownloadUploadTime(1,"1",2,"1");
        calcDownloadUploadTime(1,"1",3,"1");
        calcDownloadUploadTime(1,"1",4,"1");
        calcDownloadUploadTime(1,"1",5,"1");

    }

    public static void calcDownloadUploadTime (int unit1, String fileSize, int unit2, String bandwidth){
        double time = 0;
        double fileSizes = CheckInput.checkPositiveNumber(fileSize);
        double bandwidths = CheckInput.checkPositiveNumber(bandwidth);
        if (fileSizes == -1 || bandwidths == -1) {
            System.out.println(ConsoleColors.RED_BOLD + "\tPlease provide a positive value to convert." + ConsoleColors.RESET);
            time = -1;
        } else if (bandwidths == 0){
            time = -1;
            System.out.println("\tDownload or upload time needed is: " + ConsoleColors.GREEN_BOLD + "~INF days NAN second" + ConsoleColors.RESET);
        } else {
            switch (unit1){
                case 1:
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                case 2:
                    fileSizes = ConvertDataUnits.convertKilobytes2Bytes(fileSizes);
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                case 3:
                    fileSizes = ConvertDataUnits.convertMegabytes2Bytes(fileSizes);
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                case 4:
                    fileSizes = ConvertDataUnits.convertGigabytes2Bytes(fileSizes);
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                case 5:
                    fileSizes = ConvertDataUnits.convertTerabytes2Bytes(fileSizes);
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                default:
                    time = -1;
                    System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid filesize unit!" + ConsoleColors.RESET);
                    break;
            }
        }
        calcTime(time);
    }

    private static double getTime(int unit2, double time, double fileSizes, double bandwidths) {
        switch (unit2){
            case 1:
                time = ConvertDataUnits.convertBytes2Bits(fileSizes)
                        /bandwidths;
                break;
            case 2:
                time = ConvertDataUnits.convertBytes2Bits(fileSizes)
                        /ConvertDataUnits.convertKilobits2Bits(bandwidths);
                break;
            case 3:
                time = ConvertDataUnits.convertBytes2Bits(fileSizes)
                        /ConvertDataUnits.convertMegabits2Bits(bandwidths);
                break;
            case 4:
                time = ConvertDataUnits.convertBytes2Bits(fileSizes)
                        /ConvertDataUnits.convertGigabits2Bits(bandwidths);
                break;
            case 5:
                time = ConvertDataUnits.convertBytes2Bits(fileSizes)
                        /ConvertDataUnits.convertTerabits2Bits(bandwidths);
                break;
            default:
                time = -1;
                System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid bandwidth unit!" + ConsoleColors.RESET);
                break;
        }
        return time;
    }

    public static void calcTime(double sec){
        if (sec < 0){
            System.out.print("");
        } else {
            long day = (long) sec / 86400;
        double remainder = sec % 86400;
        long hour = (long) remainder / 3600;
        remainder %= 3600;
        long minute = (long) remainder / 60;
        remainder = remainder % 60;
        System.out.print("\tDownload or upload time needed is: " + ConsoleColors.GREEN_BOLD + "~" + ConsoleColors.RESET);
        if (day != 0){
            if (day == 1){
                System.out.print(ConsoleColors.GREEN_BOLD + day + ConsoleColors.RESET + " day ");
            } else {
                System.out.print(ConsoleColors.GREEN_BOLD + day + ConsoleColors.RESET + " days ");
            }
        }
        if (hour != 0){
            if (hour == 1){
                System.out.print(ConsoleColors.GREEN_BOLD + hour + ConsoleColors.RESET + " hour ");
            } else {
                System.out.print(ConsoleColors.GREEN_BOLD + hour + ConsoleColors.RESET + " hours ");
            }
        }
        if (minute != 0){
            if (minute == 1){
                System.out.print(ConsoleColors.GREEN_BOLD + minute + ConsoleColors.RESET + " minute ");
            } else {
                System.out.print(ConsoleColors.GREEN_BOLD + minute + ConsoleColors.RESET + " minutes ");
            }
        } if (remainder != 0) {
                if (remainder == 1) {
                    System.out.println(ConsoleColors.GREEN_BOLD + remainder + ConsoleColors.RESET + " second");
                } else {
                    System.out.println(ConsoleColors.GREEN_BOLD + remainder + ConsoleColors.RESET + " seconds");
                }
            }
        }
    }
    public static double calculateDownloadUploadTime(int unit1, String fileSize, int unit2, String bandwidth){
        double time = 0;
        double fileSizes = CheckInput.checkPositiveNumber(fileSize);
        double bandwidths = CheckInput.checkPositiveNumber(bandwidth);
        if (fileSizes == -1 || bandwidths == -1) {
            time = -1;
        } else if (bandwidths == 0){
            time = 0;
        } else {
            switch (unit1){
                case 1:
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                case 2:
                    fileSizes = ConvertDataUnits.convertKilobytes2Bytes(fileSizes);
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                case 3:
                    fileSizes = ConvertDataUnits.convertMegabytes2Bytes(fileSizes);
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                case 4:
                    fileSizes = ConvertDataUnits.convertGigabytes2Bytes(fileSizes);
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                case 5:
                    fileSizes = ConvertDataUnits.convertTerabytes2Bytes(fileSizes);
                    time = getTime(unit2, time, fileSizes, bandwidths);
                    break;
                default:
                    break;
            }
        }
        return time;
    }
    public static long calcDay(double time){
        return (long) time / 86400;
    }

    public static int calcHour(double time){
        return  (int) (time % 86400) / 3600;
    }

    public static int calcMinute(double time){
        return  (int) ((time % 86400) % 3600) / 60;
    }

    public static double calcSecond(double time){
        return ((time % 86400) % 3600) % 60;
    }
}
