package Solutions8kyu.AbbreviateTwoWordName;

/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 * The output should be two capital letters with a dot separating them.
 * It should look like this:
 * Sam Harris => S.H
 * patrick feeney => P.F
 */
public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
    }
    /**
     * return Arrays.stream(name.split(" "))
     *                  .map(String::toUpperCase)
     *                  .map(word -> word.substring(0, 1))
     *                  .collect(Collectors.joining("."));
     */
}
