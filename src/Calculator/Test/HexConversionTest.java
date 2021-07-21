package Calculator.Test;

import Calculator.Controller.ConsoleColors;
import Calculator.Controller.HexCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexConversionTest extends JUnitRunTest {

    private final String input1 = "DAD";
    private final String input2 = "3501";

    @Test
    void convertHex2Dec() {
        HexCalculator test = new HexCalculator();
        assertEquals("3501", test.convertHex2Dec(input1));
        System.out.println("\tConversion of Hexadecimal to Decimal Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void convertDec2Hex() {
        HexCalculator test = new HexCalculator();
        assertEquals("DAD", test.convertDec2Hex(input2));
        System.out.println("\tConversion of Decimal to Hexadecimal Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void convertBigInt2Hex() {
        HexCalculator test = new HexCalculator();
        assertEquals("DAD", test.convertBigInt2Hex(input2));
        System.out.println("\tConversion of Big Integer to Hexadecimal Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }

    @Test
    void convertHex2BigInt() {
        HexCalculator test = new HexCalculator();
        assertEquals("3501", test.convertHex2Dec(input1));
        System.out.println("\tConversion of Hexadecimal to Big Integer Function -- "
                + ConsoleColors.GREEN_BOLD + "\u2705 Pass" + ConsoleColors.RESET);
    }
}