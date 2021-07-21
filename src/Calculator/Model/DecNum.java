package Calculator.Model;

public class DecNum extends Number {

    @Override
    public String checkInput() {
        String dec = "";
        if(getNumber().equals("0")){
            dec = "0";
        } else {
            try{
                Long.parseLong(getNumber());
                return dec += Long.parseLong(getNumber());
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(getNumber());
                    return dec += Double.parseDouble(getNumber());
                } catch (NumberFormatException exception) {
                    return dec = Number.getInvalidValue();
                }
            }
        }
        return dec;
    }
}
