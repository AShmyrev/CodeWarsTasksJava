package Solutions8kyu.CenturyFromYear;

/**
 * The first century spans from the year 1 up to and including the year 100, the second century -
 * - from the year 101 up to and including the year 200, etc.
 * Given a year, return the century it is in.
 * Examples
 * 1705 --> 18
 * 1900 --> 19
 * 1601 --> 17
 * 2000 --> 20
 * 2742 --> 28
 */
public class CenturyFromYear {
    public static int century(int number) {
        // your code goes here
        if (number < 0) {
            throw new RuntimeException("Incorrect Year");
        }
        return number % 100 == 0 ? number / 100 : number / 100 + 1;
    }
}
