package Solutions8kyu.ConvertANumberToAString;

/**
 * Convert a Number to a String!
 *
 * We need a function that can transform a number (integer) into a string.
 * What ways of achieving this do you know?
 */
public class ConvertANumberToAString {
    public static String convertANumberToAString(int num) {
        return String.valueOf(num);
        // return Integer.toString(num);
    }

    public static void testConvertANumberToAString() {
        System.out.println(ConvertANumberToAString.convertANumberToAString(1));
        System.out.println(ConvertANumberToAString.convertANumberToAString(-1));
        System.out.println(ConvertANumberToAString.convertANumberToAString(0));
    }
}
