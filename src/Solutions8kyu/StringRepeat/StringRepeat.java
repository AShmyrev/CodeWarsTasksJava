package Solutions8kyu.StringRepeat;

/**
 * Write a function that accepts an integer n and a string s as parameters,
 * and returns a string of s repeated exactly n times.
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if (repeat > 0) {
            for (int i = 0; i < repeat; i++) {
                stringBuilder.append(string);
            }
        }
        return stringBuilder.toString();
        /**
         * return string.repeat(repeat);
         */
    }
}
