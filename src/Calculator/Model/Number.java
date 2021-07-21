package Calculator.Model;

public abstract class Number {

    //Create the input error message
    private static final String INVALID_VALUE = "INVALID";
    private static final String BINARY_INVALID_VALUE_MESSAGE = "The number need to contain 0 and 1 only.";
    private static final String HEX_INVALID_VALUE_MESSAGE = "The number need to contain 0-9 and A-F only.";
    private static final String NUMERIC_INVALID_VALUE_MESSAGE = "The number need to be numeric.";

    private String number;

    //abstract method to check valid input
    public abstract String checkInput();

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    // return "INVALID" for invalid input
    public static String getInvalidValue() {
        return INVALID_VALUE;
    }

    public static String getBinaryInvalidValueMessage() {
        return BINARY_INVALID_VALUE_MESSAGE;
    }

    public static String getHexInvalidValueMessage() {
        return HEX_INVALID_VALUE_MESSAGE;
    }

    public static String getNumericInvalidValueMessage() {
        return NUMERIC_INVALID_VALUE_MESSAGE;
    }
}
