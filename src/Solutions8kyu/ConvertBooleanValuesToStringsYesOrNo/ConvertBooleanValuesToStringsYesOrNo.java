package Solutions8kyu.ConvertBooleanValuesToStringsYesOrNo;

/**
 * Convert boolean values to strings 'Yes' or 'No'.
 *
 * Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
 */
public class ConvertBooleanValuesToStringsYesOrNo {
    public static String convertBooleanValuesToStringsYesOrNo(boolean b) {
        return b ? "Yes" : "No";
    }

    public static void testConvertBooleanValuesToStringsYesOrNo() {
        System.out.println(ConvertBooleanValuesToStringsYesOrNo.convertBooleanValuesToStringsYesOrNo(true));
        System.out.println(ConvertBooleanValuesToStringsYesOrNo.convertBooleanValuesToStringsYesOrNo(false));
    }
}
