package Solutions7kyu.DescendingOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your task is to make a function that can take any non-negative integer as an argument
 * and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 * Examples:
 * Input: 42145 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 123456789 Output: 987654321
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        List<Integer> digits = new ArrayList<>();
        int numCopy = num;
        while (numCopy != 0) {
            digits.add(numCopy % 10);
            numCopy /= 10;
        }
        Collections.sort(digits);
        Collections.reverse(digits);
        for (int i = 0; i < digits.size(); i++) {
            if (i == 0) {
                numCopy += digits.get(i);
            } else {
                numCopy = numCopy * 10 + digits.get(i);
            }
        }
        return numCopy;
    }
    /**
     * String[] array = String.valueOf(num).split("");
     * Arrays.sort(array, Collections.reverseOrder());
     * return Integer.valueOf(String.join("", array));
     * ------------------------------------------------
     * return Integer.parseInt(String.valueOf(num)
     *                               .chars()
     *                               .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
     *                               .sorted(Comparator.reverseOrder())
     *                               .collect(Collectors.joining()));
     */
}
