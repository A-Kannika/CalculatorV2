package Calculator.Model;

public class BigIntNum extends Number {

    @Override
    public String checkInput() {
        String bigInt = getNumber();
        String bigInt1 = bigInt;
        if (bigInt1.startsWith("-")){
            bigInt1 = bigInt.substring(1);
        }
        int i = bigInt1.length() - 1;
        while (i >= 0) {
            char c = bigInt1.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                bigInt = getInvalidValue();
                break;
            } else {
                bigInt = getNumber();
            }
            i--;
        }
        return bigInt;
    }
}

