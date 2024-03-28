package Solutions7kyu.HighestAndLowest;

import java.util.stream.Stream;

/**
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.
 * Examples
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 */
public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int[] ints = Stream.of(numbers.split(" "))
                .mapToInt(number -> Integer.parseInt(number))
                .toArray();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int number : ints) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        return max + " " + min;
    }
}
