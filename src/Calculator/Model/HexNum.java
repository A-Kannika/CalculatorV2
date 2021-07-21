package Calculator.Model;

public class HexNum extends Number {

    @Override
    public String checkInput() {
        String hex = "";
        String hexInput = getNumber().toUpperCase();
        if (hexInput.startsWith("-")){
            hexInput = hexInput.substring(1);
        }
        if (hexInput.equals("")) {
            hex = "0";
        } else {
            int i = hexInput.length() - 1;
            while (i >= 0) {
                char c = hexInput.charAt(i);
                if (!(c >= '0' && c <= '9' || c >= 'A' && c <= 'F')) {
                    hex = getInvalidValue();
                    break;
                } else {
                    hex = getNumber();
                }
                i--;
            }
        }
        return hex;
    }
}
