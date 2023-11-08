package Solutions8kyu.OppositeNumber;

/**
 * Opposite number
 *
 * Very simple, given an integer or a floating-point number, find its opposite.
 */
public class OppositeNumber {
    public static int oppositeNumber(int number) {
        return -number;
    }

    public static void testOppositeNumber(int number) {
        System.out.println(OppositeNumber.oppositeNumber(1));
        System.out.println(OppositeNumber.oppositeNumber(-1));
        System.out.println(OppositeNumber.oppositeNumber(0));
    }
}
