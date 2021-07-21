package Calculator.Controller;

import Calculator.Model.CheckInput;

import java.math.BigDecimal;

public class CalcWebsiteBandwidth  extends BandwidthCalculator {

    public static void main(String[] args) {
        calcWebsiteBandwidth(1,"100", 1, "10","2");
        calcWebsiteBandwidth(6,"1", 2, "1","3");
        calcWebsiteBandwidth(5,"1", 5, "1","1");
        calcWebsiteBandwidth(4,"1", 2, "1","3");
        calcWebsiteBandwidth(6, "5000" , 2, "500", "2");
        System.out.println(CalcWebsiteBandwidth.calcMBPS
                (1, "5000" , 1, "500", "2"));
    }

    public static double calcMBPS(int unit1, String pageView, int unit2,
                                  String averagePageSize, String redundancyFactor){
        double mbps = 0, pageSizeInMb, byteData, GBPerMonth ;
        double pageViews = CheckInput.checkPositiveNumber(pageView);
        double averagePageSizes = CheckInput.checkPositiveNumber(averagePageSize);
        if (pageViews == -1 || averagePageSizes == -1){
            mbps = -1;
        } else {
            switch (unit1){
                case 1: // per second
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Megabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: // per minute
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Megabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3: // per hour
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 * 100);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 * 100_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 4: // per day
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 * 10);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 * 10_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 5: // per week
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 6: // per month
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 7: // per year
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        return mbps;
    }

    public static double calcGBPM(int unit1, String pageView, int unit2,
                                  String averagePageSize, String redundancyFactor){
        double GBPerMonth = 0, pageSizeInGB, byteData, pageSizeInMb, mbps;
        double pageViews = CheckInput.checkPositiveNumber(pageView);
        double averagePageSizes = CheckInput.checkPositiveNumber(averagePageSize);
        if (pageViews == -1 || averagePageSizes == -1){
            GBPerMonth = -1;
        } else {
            switch (unit1){
                case 1: // per second
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Megabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: // per minute
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Megabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3: // per hour
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 * 100);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 * 100_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 4: // per day
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 * 10);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 * 10_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 5: // per week
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 6: // per month
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                case 7: // per year
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        return GBPerMonth;
    }

    public static double calcMBPSwRedundancyFactor(int unit1, String pageView, int unit2,
                                                   String averagePageSize, String redundancyFactor){
        double mbps, GBPerMonth, pageSizeInMb, pageSizeInGB, byteData, mbpsWFactor = 0, GBPerMonthWFactor ;
        mbps = calcMBPS(unit1, pageView, unit2, averagePageSize, redundancyFactor);
        double redundancyFactors = CheckInput.checkNumberAtLeast1(redundancyFactor);
        if (redundancyFactors == -1){
            System.out.println("Please provide a redundancy factor that is 1 or larger.");
            mbpsWFactor = 0;
        } else if (redundancyFactors == 1){
            mbpsWFactor = mbps;
        } else {
            mbpsWFactor = mbps * redundancyFactors;
        }
        return mbpsWFactor;
    }

    public static double calcGBPMwRedundancyFactor(int unit1, String pageView, int unit2,
                                                   String averagePageSize, String redundancyFactor){
        double mbps, GBPerMonth, pageSizeInMb, pageSizeInGB, byteData, mbpsWFactor, GBPerMonthWFactor = 0 ;
        GBPerMonth = calcGBPM(unit1, pageView, unit2, averagePageSize, redundancyFactor);
        double redundancyFactors = CheckInput.checkNumberAtLeast1(redundancyFactor);
        if ( redundancyFactors == -1){
            System.out.println("Please provide a redundancy factor that is 1 or larger.");
            GBPerMonthWFactor = 0;
        } else if ( redundancyFactors == 1){
            GBPerMonthWFactor = GBPerMonth;
        } else {
            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
        }
        return GBPerMonthWFactor;
    }

    public static void calcWebsiteBandwidth (int unit1, String pageView, int unit2,
                                             String averagePageSize, String redundancyFactor){
        double mbps, GBPerMonth, pageSizeInMb, pageSizeInGB, byteData, mbpsWFactor, GBPerMonthWFactor ;
        double pageViews = CheckInput.checkPositiveNumber(pageView);
        double averagePageSizes = CheckInput.checkPositiveNumber(averagePageSize);
        double redundancyFactors = CheckInput.checkNumberAtLeast1(redundancyFactor);
        if (pageViews == -1 || averagePageSizes == -1){
            System.out.println(ConsoleColors.RED_BOLD + "\tPlease provide a positive value to convert." + ConsoleColors.RESET);
        } else if ( redundancyFactors == -1){
            System.out.println(ConsoleColors.RED_BOLD + "\tPlease provide a redundancy factor that is 1 or larger." + ConsoleColors.RESET);
        } else if ( redundancyFactors == 1){
            switch (unit1){
                case 1: // per second
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Megabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 2: // per minute
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Megabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 3: // per hour
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 * 100);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 * 100_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 4: // per day
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 * 10);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 * 10_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 5: // per week
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 6: // per month
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 7: // per year
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid page views size unit!" + ConsoleColors.RESET);
                    break;
            }
        } else {
            switch (unit1){
                case 1: // per second
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Megabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.0026298 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 2: // per minute
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Megabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.00004383 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 3: // per hour
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 / 10L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 * 100);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (7.305 * 100_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 4: // per day
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 / 100L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 * 10);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (3.04375 * 10_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 5: // per week
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 / 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (4.3482142857143 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 6: // per month
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 / 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (1.0 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                case 7: // per year
                    switch (unit2){
                        case 1: //Bytes
                            byteData = averagePageSizes;
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 2: //Kilobytes
                            byteData = ConvertDataUnits.convertKilobytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 3: //Megabytes
                            byteData = ConvertDataUnits.convertMegabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 4: //Gigabytes
                            byteData = ConvertDataUnits.convertGigabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        case 5: //Terabytes
                            byteData = ConvertDataUnits.convertTerabytes2Bytes(averagePageSizes);
                            pageSizeInMb = ConvertDataUnits.convertBytes2Megabits(byteData);
                            pageSizeInGB = ConvertDataUnits.convertBytes2Gigabytes(byteData);
                            GBPerMonth = (pageViews * averagePageSizes) * (0.083333333333333 * 1_000_000_000_000L);
                            mbps = (GBPerMonth * 8000) / (0.0026298 * 1_000_000_000L);
                            GBPerMonthWFactor = GBPerMonth * redundancyFactors;
                            mbpsWFactor = mbps * redundancyFactors;
                            System.out.println("\tActual Bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbps + " Mbits/s " + ConsoleColors.RESET + "or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonth + " GB per month." + ConsoleColors.RESET
                                    + "\n\n\tWith redundancy factor of "
                                    + ConsoleColors.GREEN_BOLD + redundancyFactors + ConsoleColors.RESET + ", the bandwidth needed is "
                                    + ConsoleColors.GREEN_BOLD + mbpsWFactor + " Mbits/s" + ConsoleColors.RESET + " or "
                                    + ConsoleColors.GREEN_BOLD + GBPerMonthWFactor + " GB per month." + ConsoleColors.RESET);
                            break;
                        default:
                            System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid average page size unit!" + ConsoleColors.RESET);
                            break;
                    }
                    break;
                default:
                    System.out.println(ConsoleColors.RED_BOLD + "\tYou choose invalid page views size unit!" + ConsoleColors.RESET);
                    break;
            }
        }
    }
    // convert page view unit units to per second and per month:
    // One Julian astronomical year, has 365.25 days:
    public static double convertYear2Sec (double time){
        return new BigDecimal(Double.toString(time * 365.25 * 24 * 60 * 60)).doubleValue();
    }

    public static double convertYear2Month (double time){
        return new BigDecimal(Double.toString(time * 12)).doubleValue();
    }

    public static double convertMonth2Sec (double time){
        return new BigDecimal(Double.toString(time * 365.25 * 24 * 60 * 60 / 12)).doubleValue();
    }

    public static double convertWeek2Sec (double time){
        return new BigDecimal(Double.toString(time * 7 * 24 * 60 * 60)).doubleValue();
    }

    public static double convertWeek2Month (double time){
        return new BigDecimal(Double.toString(time / 4)).doubleValue();
    }

    public static double convertDay2Sec (double time){
        return new BigDecimal(Double.toString(time * 24 * 60 * 60)).doubleValue();
    }

    public static double convertDay2Month (double time){
        return new BigDecimal(Double.toString(time / 30.4375)).doubleValue();
    }

    public static double convertHour2Sec (double time){
        return new BigDecimal(Double.toString(time * 60 * 60)).doubleValue();
    }

    public static double convertHour2Month (double time){
        return new BigDecimal(Double.toString(time / (24 * 30.4375))).doubleValue();
    }

    public static double convertMin2Sec (double time){
        return new BigDecimal(Double.toString(time * 60)).doubleValue();
    }

    public static double convertMin2Month (double time){
        return new BigDecimal(Double.toString(time / (24 * 60 * 30.4375))).doubleValue();
    }

    public static double convertSec2Month (double time){
        return new BigDecimal(Double.toString(time / (24 * 60 * 60 * 30.4375))).doubleValue();
    }


}
