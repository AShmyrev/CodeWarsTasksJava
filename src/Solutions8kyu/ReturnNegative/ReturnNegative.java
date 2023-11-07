package Solutions8kyu.ReturnNegative;

/**
 * Return Negative
 *
 * In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
 */
public class ReturnNegative {
    public static int returnNegative(final int x) {
//        return -Math.abs(x);
        return (x < 0) ? x : -x;
    }

    public static void testReturnNegative() {
        System.out.println(ReturnNegative.returnNegative(1));
        System.out.println(ReturnNegative.returnNegative(-1));
        System.out.println(ReturnNegative.returnNegative(0));
        System.out.println(ReturnNegative.returnNegative(2));
        System.out.println(ReturnNegative.returnNegative(-2));
    }
}
