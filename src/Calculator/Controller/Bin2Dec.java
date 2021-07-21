package Calculator.Controller;

public interface Bin2Dec extends NumericConversion {

    String convertBin2Dec(String input); //method signature, public


//    default String convertBin2Dec(String input){
//        String bin = ;
//        int sum = 0;
//        if (bin.equals("-1")){
//            return "-1";
//        } else {
//            long binaryNumber = Long.parseLong(bin);
//            for (int i = 0; i < bin.length(); i++) {
//                int base = (int) (binaryNumber % 10);
//                int pow = (int) Math.pow(2, i);
//                sum += base * pow;
//                binaryNumber /= 10;
//            }
//        }
//        return ""+ sum;
//    }
}

