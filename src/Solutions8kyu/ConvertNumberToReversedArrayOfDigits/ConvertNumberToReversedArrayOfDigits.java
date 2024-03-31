package Solutions8kyu.ConvertNumberToReversedArrayOfDigits;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert number to reversed array of digits
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 * Example(Input => Output):
 * 35231 => [1,3,2,5,3]
 * 0 => [0]
 */
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        if (n == 0) {
            return new int[]{(int)n};
        }
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add((int)(n % 10));
            n = n / 10L;
        }
        return digits.stream().mapToInt(i -> i).toArray();
    }
    /**
     *  return new StringBuilder().append(n)
     *                            .reverse()
     *                            .chars()
     *                            .map(Character::getNumericValue)
     *                            .toArray();
     *  ------------------------------------------------------------------
     *  String s = String.valueOf(n);
     *  int length = s.length();
     *  int[] array = new int[length];
     *  for ( int i = 0; i < length; i++){
     *    array[i] = (int) (s.charAt(length - i - 1)) - 48;
     *  }
     *  return array;
     */
}
