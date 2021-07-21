package Calculator.Test;

import Calculator.Controller.BinaryCalculator;
import Calculator.Controller.ConsoleColors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryConversionTest extends JUnitRunTest {

    private final String input1 = "10101010";
    private final String input2 = "170";

    @Test
    void convertBin2Dec() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("170", test.convertBin2Dec(input1));
        System.out.println("\tConversion of Binary to Decimal Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);

    }

    @Test
    void convertDec2Bin() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("10101010", test.convertDec2Bin(input2));
        System.out.println("\tConversion of Decimal to Binary Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void convertBin2BigInt() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("170", test.convertBin2BigInt(input1));
        System.out.println("\tConversion of Binary to Big Integer Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void convertBigInt2Bin() {
        BinaryCalculator test = new BinaryCalculator();
        assertEquals("10101010", test.convertBigInt2Bin(input2));
        System.out.println("\tConversion of Big Integer to Binary Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }
}