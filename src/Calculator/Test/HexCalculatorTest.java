package Calculator.Test;

import Calculator.Controller.ConsoleColors;
import Calculator.Controller.HexCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexCalculatorTest extends JUnitRunTest {

    private final String input1 = "8AB";
    private final String input2 = "B78";

    @Test
    void hexAdd() {
        HexCalculator test = new HexCalculator();
        assertEquals("1423", test.hexAdd(input1, input2));
        System.out.println("\tHexadecimal Calculator -- Add Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void hexSubtract() {
        HexCalculator test = new HexCalculator();
        assertEquals("-2CD", test.hexSubtract(input1, input2));
        System.out.println("\tHexadecimal Calculator -- Subtract Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void hexMultiply() {
        HexCalculator test = new HexCalculator();
        assertEquals("636928", test.hexMultiply(input1, input2));
        System.out.println("\tHexadecimal Calculator -- Multiply Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void hexDivide() {
        HexCalculator test = new HexCalculator();
        assertEquals("0", test.hexDivide(input1, input2));
        System.out.println("\tHexadecimal Calculator -- Divide Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void hexDivideRemainder() {
        HexCalculator test = new HexCalculator();
        assertEquals("8AB", test.hexDivideRemainder(input1, input2));
        System.out.println("\tHexadecimal Calculator -- Divide Remainder Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }
}