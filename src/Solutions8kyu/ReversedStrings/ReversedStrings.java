package Solutions8kyu.ReversedStrings;

/**
 * Reversed Strings
 *
 * Complete the solution so that it reverses the string passed into it.
 */
public class ReversedStrings {
    public static String reversedStrings(String str) {
        if (str == null) return null;
        else if (str.isEmpty()) return str;
        char[] charsStr = str.toCharArray();
        for (int i = 0; i < charsStr.length / 2; i++) {
            char tmp = charsStr[i];
            charsStr[i] = charsStr[charsStr.length - 1 - i];
            charsStr[charsStr.length - 1 - i] = tmp;
        }
        return new String(charsStr);
    }

    /**
     * Best practice:
     *     return new StringBuilder(str).reverse().toString();
     * This approach is Unicode-safe too: StringBuilder#reverse preverse surrogate pairs for strings that contain
     * Unicode supplementary characters (like emoji and rare characters).
     * Solutions that rely on #charAt will generally have issues here.
     *
     * or thread safe solution:
     * return new StringBuffer(str).reverse().toString();
     */

    public static void testReversedStrings() {
        System.out.println(ReversedStrings.reversedStrings("asd"));
        System.out.println(ReversedStrings.reversedStrings("qwe"));
        System.out.println(ReversedStrings.reversedStrings("asd qwe"));
        System.out.println(ReversedStrings.reversedStrings("asd qwe "));
        System.out.println(ReversedStrings.reversedStrings(" asd qwe "));
    }
}
