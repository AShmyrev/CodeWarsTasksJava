package Solutions8kyu.SumOfPositive;

/**
 * SumOfPositive
 *
 * You get an array of numbers, return the sum of all of the positives ones.
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * Note: if there is nothing to sum, the sum is default to 0.
 */
public class SumOfPositive {
    public static int sumOfPositive(int[] arr){
        if (arr.length == 0) return 0;
        int sum = 0;
        for(int i : arr)
            if (i > 0) sum += i;
        return sum;
    }

    public static void testSumOfPositive() {
        int[] testArray1 = {1, 0, -1, 2, -2};
        System.out.println(SumOfPositive.sumOfPositive(testArray1));
    }
}
