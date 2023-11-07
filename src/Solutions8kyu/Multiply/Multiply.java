package Solutions8kyu.Multiply;

/**
 * Multiply
 *
 * This code does not execute properly. Try to figure out why.
 * public class Multiply {
 *     public static Double multiply(Double a, Double b) {
 *         return a * b
 *     }
 * }
 */
public class Multiply {
    public static Double multiply(Double a, Double b) {
        return (a == null || b == null) ? null : a * b;
    }

    public static void testMultiply() {
        System.out.println(Multiply.multiply(3.0, 2.1));
        System.out.println(Multiply.multiply(-3.0, 2.1));
        System.out.println(Multiply.multiply(3.0, -2.1));
        System.out.println(Multiply.multiply(0.0, -2.1));
    }
}
