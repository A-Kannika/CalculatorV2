package Calculator.Test;

import Calculator.Controller.BinaryCalculator;
import Calculator.Controller.ConsoleColors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCalculatorTest extends JUnitRunTest {

    private final String input1 = "10101010";
    private final String input2 = "11001100";

    @Test
    void binaryAdd() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("101110110", test.binaryAdd(input1, input2));
        System.out.println("\tBinary Calculator -- Add Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void binarySubtract() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("-100010", test.binarySubtract(input1, input2));
        System.out.println("\tBinary Calculator -- Subtract Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void binaryMultiply() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("1000011101111000", test.binaryMultiply(input1, input2));
        System.out.println("\tBinary Calculator -- Multiply Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void binaryDivide() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("0", test.binaryDivide(input1, input2));
        System.out.println("\tBinary Calculator -- Divide Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void binaryDivideRemainder() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("10101010", test.binaryDivideRemainder(input1, input2));
        System.out.println("\tBinary Calculator -- Divide Remainder Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }
}