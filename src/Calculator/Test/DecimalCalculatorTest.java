package Calculator.Test;

import Calculator.Controller.ConsoleColors;
import Calculator.Controller.DecimalCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalCalculatorTest extends JUnitRunTest{

    private final String input1 = "35.25";
    private final String input2 = "-23.5";

    @Test
    void decAdd() {
        DecimalCalculator test = new DecimalCalculator();
        assertEquals("11.75", test.decAdd(input1, input2));
        System.out.println("\tDecimal Calculator -- Add Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void decSub() {
        DecimalCalculator test = new DecimalCalculator();
        assertEquals("58.75", test.decSub(input1, input2));
        System.out.println("\tDecimal Calculator -- Subtract Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void decMultiply() {
        DecimalCalculator test = new DecimalCalculator();
        assertEquals("-828.375", test.decMultiply(input1, input2));
        System.out.println("\tDecimal Calculator -- Multiply Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void decDivide() {
        DecimalCalculator test = new DecimalCalculator();
        assertEquals("-1.5", test.decDivide(input1, input2));
        System.out.println("\tDecimal Calculator -- Divide Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

//    @Test
//    void decDivRemainder() {
//        DecimalCalculator test = new DecimalCalculator();
//        assertEquals("18", test.decDivRemainder(input1, input2));
//        System.out.println("\tDecimal Calculator -- Divide Remainder Function -- "
//                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
//    }
}