package Solutions8kyu.RemoveFirstAndLastCharacter;

/**
 * Remove First and Last Character
 *
 * It's pretty straightforward. Your goal is to create a function that removes
 * the first and last characters of a string. You're given one parameter, the original string.
 * You don't have to worry with strings with less than two characters.
 */
public class RemoveFirstAndLastCharacter {
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void testRemoveFirstAndLastCharacter() {
        System.out.println(RemoveFirstAndLastCharacter.removeFirstAndLastCharacter("asd"));
        System.out.println(RemoveFirstAndLastCharacter.removeFirstAndLastCharacter("01234"));
        System.out.println(RemoveFirstAndLastCharacter.removeFirstAndLastCharacter("as"));
    }
}
