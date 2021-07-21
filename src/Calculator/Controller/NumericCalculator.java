package Calculator.Controller;


public class NumericCalculator extends Calculator {

    public static long addValues(long d1, long d2) {
        return d1 + d2;
    }

    public static long subtractValues(long d1, long d2) {
        return d1 - d2;
    }

    public static long multiplyValues(long d1, long d2) {
        return d1 * d2;
    }

    public static long divideValues(long d1, long d2) {
        if (d2 == 0) {
            System.out.println("The second number is 0, divided by 0 is undefined");
            return (long) Math.sqrt(-1);
        } else {
            return d1 / d2;
        }
    }

    public static long divideRemainderValues(long d1, long d2) {
        if (d2 == 0) {
            return (long) Math.sqrt(-1);
        } else if (d1 % d2 == 0) {
            return 0;
        } else {
            return d1 % d2;
        }
    }
}
