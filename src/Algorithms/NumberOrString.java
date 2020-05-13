package Algorithms;

public class NumberOrString {
    /**
     * Title: NumberOrString
     * @Eng - The method determines whether a number or string is entered.
     * @Rus - Метод определяет введено число или строка.
     * @author PJ
     * @since 13/05/2020
     * @version 1.0
     * @param s - input string.
     * @return - If a number it returns true.
     */

    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
