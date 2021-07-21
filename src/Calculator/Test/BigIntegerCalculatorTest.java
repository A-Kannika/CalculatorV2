package Calculator.Test;

import Calculator.Controller.BigIntegerCalculator;
import Calculator.Controller.ConsoleColors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigIntegerCalculatorTest extends JUnitRunTest {

    private final String input1 = "1234";
    private final String input2 = "5678";

    @Test
    void bigIntAdd() {
        BigIntegerCalculator test = new BigIntegerCalculator();
        assertEquals("6912", test.bigIntAdd(input1,input2));
        System.out.println("\tBig Integer Calculator -- Add Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void bigIntSubtract() {
        BigIntegerCalculator test = new BigIntegerCalculator();
        assertEquals("-4444", test.bigIntSubtract(input1,input2));
        System.out.println("\tBig Integer Calculator -- Subtract Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void bigIntMultiply() {
        BigIntegerCalculator test = new BigIntegerCalculator();
        assertEquals("7006652", test.bigIntMultiply(input1,input2));
        System.out.println("\tBig Integer Calculator -- Multiply Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void bigIntDivide() {
        BigIntegerCalculator test = new BigIntegerCalculator();
        assertEquals("0", test.bigIntDivide(input1,input2));
        System.out.println("\tBig Integer Calculator -- Divide Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void bigIntDivRemainder() {
        BigIntegerCalculator test = new BigIntegerCalculator();
        assertEquals("1234", test.bigIntDivRemainder(input1,input2));
        System.out.println("\tBig Integer Calculator -- Divide Remainder Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }
}