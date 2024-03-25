package Solutions8kyu.CountingSheep;

/**
 * Consider an array/list of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array (true means present).
 * Don't forget to check for bad values like null/undefined
 */
public class CountingSheep {
    public int countSheep(Boolean[] arrayOfSheep) {
        int count = 0;
        for (Boolean sheep : arrayOfSheep) {
            if (null != sheep && sheep) {
                count++;
            }
        }
        return count;
    }
    /** return Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x == true).toArray().length; */
}
