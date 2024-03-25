package Solutions8kyu.RemoveStringSpaces;

public class RemoveStringSpaces {
    public static String noSpace(final String x) {
        return x.replace(" ", "");
        /**
         * return x.replaceAll("\\s+","");
         * current one uses regexp, the other doesn't, so it's more efficient
         * \s matches a space, tab, new line, carriage return, form feed or vertical tab.
         * + says one or more occurrences.
         */
    }
}
