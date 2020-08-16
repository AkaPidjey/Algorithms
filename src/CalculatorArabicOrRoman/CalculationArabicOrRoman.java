package CalculatorArabicOrRoman;

import java.util.Scanner;

public class CalculationArabicOrRoman {
    public static String arabic(String str) throws Exception {
        String value = null;
        Scanner s = new Scanner(str);
        int a = s.nextInt();
        String operation = s.next();
        int b = s.nextInt();

        if(a > 0 && a < 11 && b > 0 && b < 11) {
            int temp = 0;
            switch(operation) {
                case "+":
                    temp = a + b;
                    break;
                case "-":
                    temp = a - b;
                    break;
                case "*":
                    temp = a * b;
                    break;
                case "/":
                    temp = a / b;
                    break;
                default:
                    throw new Exception();
            }
            value = Integer.toString(temp);
        }
        else {
             throw new Exception();
        }
        return value;
    }

    public static String roman(String str1, String str2, String str3) throws Exception {
        String value = null;
        RomanNumerals num1  = RomanNumerals.valueOf(str1);
        RomanNumerals num2  = RomanNumerals.valueOf(str3);
        int a = num1.ordinal();
        int b = num2.ordinal();

        String arabNum = Integer.toString(++a) + " " + str2 + " " + Integer.toString(++b);
        String romanNum = CalculationArabicOrRoman.arabic(arabNum);

        Scanner s = new Scanner(romanNum);
        int index = s.nextInt();

        RomanNumerals[] array = RomanNumerals.values();
        RomanNumerals num = array[--index];

        value = num.toString();
        return value;
    }
}
