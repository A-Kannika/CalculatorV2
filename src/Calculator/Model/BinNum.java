package Calculator.Model;

public class BinNum extends Number{

    @Override
    public String checkInput() {
        String bin = "";
        var chars = getNumber().toCharArray();
        if (chars.length == 0) {
            return bin = "0";
        } else {
            int i = chars.length - 1;
            while (i >= 0) {
                if (!(chars[i] == '0' || chars[i] == '1')) {
                    bin = getInvalidValue();
                    break;
                } else {
                    bin = getNumber();
                }
                i--;
            }
        }
        return bin;
    }
}
