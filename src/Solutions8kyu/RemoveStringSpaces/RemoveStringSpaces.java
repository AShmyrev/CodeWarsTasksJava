package Solutions8kyu.RemoveStringSpaces;

public class RemoveStringSpaces {
    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
        /**
         * return x.replaceAll("\\s+","");
         * \s matches a space, tab, new line, carriage return, form feed or vertical tab.
         * + says one or more occurrences.
         */
    }
}
