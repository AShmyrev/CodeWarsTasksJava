package Solutions7kyu.VowelCount;

/**
 * Vowel Count
 *
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 */
public class VowelCount {
    public static int vowelCount(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelsCount = 0;

        for (char charsStrCurrentElement : str.toCharArray()) {
            for (char currentVowel : vowels) {
                if (currentVowel == charsStrCurrentElement) {
                    ++vowelsCount;
                    break;
                }
            }
        }
        return vowelsCount;
    }

    /**
     * Clever solutions:
     * return str.replaceAll("(?i)[^aeiou]", "").length();
     *
     * int vowelsCount = 0;
     * for(char c : str.toCharArray())
     *   vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
     * return vowelsCount;
     */

    public static void testVowelCount() {
        System.out.println(VowelCount.vowelCount("asd"));
        System.out.println(VowelCount.vowelCount("qwe"));
        System.out.println(VowelCount.vowelCount("ogu"));
        System.out.println(VowelCount.vowelCount("qwertyuiop[]asdfghjkl;'\\zxcvbnm,./"));
    }
}
