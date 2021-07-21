package Calculator.Controller;

public interface NumericConversion {

}



//

//
//interface Dec2Bin{
//
//    default String convertDec2Bin(String input){
//        double dec = CheckInput.checkDecimal(input);
//        int decimalNumber = (int) Math.floor(dec);
//        String binaryNumber = "";
//        StringBuilder binary = new StringBuilder();
//        if (dec == Math.sqrt(-1)){
//            return "";
//        } else if (dec == 0.0){
//            binary.insert(0,"0");
//        } else if (decimalNumber > 0) {
//            while (decimalNumber > 0) {
//                if (decimalNumber % 2 == 0) {
//                    binary.insert(0, "0");
//                } else {
//                    binary.insert(0, "1");
//                }
//                decimalNumber /= 2;
//            }
//        } else {
//            while (decimalNumber < 0) {
//                if (decimalNumber % 2 == 0) {
//                    binary.insert(0, "0");
//                } else {
//                    binary.insert(0, "1");
//                }
//                decimalNumber /= 2;
//            }
//        }
//        binaryNumber = binaryNumber + binary;
//        return binaryNumber;
//    }
//
//}
//
//interface Hex2Dec{
//
//    default String calcConvertHex2Dec(String input) {
//        String hex = CheckInput.checkHex(input).toUpperCase();
//        String hexList = "0123456789ABCDEF";
//        String hexOri = hex;
//        int decSum = 0;
//        String decNum = "";
//        if (hex.equals("Z")){
//            decNum = "Z" ;
//        }else if (hex.startsWith("-")) {
//            hex = hex.substring(1);
//            for (int i = 0; i < hex.length(); i++) {
//                char c = hex.charAt(i);
//                int dec = hexList.indexOf(c);
//                decSum = 16 * decSum + dec;
//            }
//            decNum += decSum;
//        } else {
//            for (int i = 0; i < input.length(); i++) {
//                char c = hex.charAt(i);
//                int dec = hexList.indexOf(c);
//                decSum = 16 * decSum + dec;
//            }
//            decNum += decSum;
//        }
//        return decNum;
//    }
//
//}
//
//interface Dec2Hex{
//    default String calcConvertDec2Hex(String input){
//        double dec = CheckInput.checkDecimal(input);
//        int decimalNumber = (int) Math.floor(dec);
//        int decimal = decimalNumber;
//        String hexNum = "";
//
//        int remainder = 0;   //store the remainder and use as the index of the hexList
//
//        StringBuilder hexNumber = new StringBuilder();  // store the hexNumber
//        char[] hexList = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
//        if (dec == 0.0){
//            hexNum += 0;
//        } else if (decimal > 0) {
//            while (decimal > 0) {
//                remainder = (decimal % 16);
//                hexNumber.insert(0, hexList[remainder]);
//                decimal /= 16;
//            }
//            hexNum += hexNumber;
//        } else {
//            if (decimal < 0) {
//                int posDec = (int) Math.abs(decimal);
//                while (posDec > 0) {
//                    remainder = posDec % 16;
//                    hexNumber.insert(0, hexList[remainder]);
//                    posDec /= 16;
//                }
//                hexNum += "-" + hexNumber;
//            }
//        }
//        return hexNum;
//    }
//
//}
//
//interface Bin2BigInt{
//
//}
//
//interface BigInt2Bin{
//
//}
//
//interface Hex2BigInt{
//
//}
//
//interface BigInt2Hex{
//
//}
//
//interface Dec2BigInt{
//
//}
//
//interface BigInt2Dec{
//
//}
//
