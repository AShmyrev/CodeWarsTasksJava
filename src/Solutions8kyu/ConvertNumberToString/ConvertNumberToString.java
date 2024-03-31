package Solutions8kyu.ConvertNumberToString;

/**
 * Convert a Number to a String!
 *
 * We need a function that can transform a number (integer) into a string.
 * What ways of achieving this do you know?
 */
public class ConvertNumberToString {
    public static String convertANumberToAString(int num) {
        return String.valueOf(num);
        // return Integer.toString(num);
    }

    public static void testConvertANumberToAString() {
        System.out.println(ConvertNumberToString.convertANumberToAString(1));
        System.out.println(ConvertNumberToString.convertANumberToAString(-1));
        System.out.println(ConvertNumberToString.convertANumberToAString(0));
    }
}
