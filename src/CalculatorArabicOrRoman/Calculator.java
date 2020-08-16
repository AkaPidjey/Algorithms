package CalculatorArabicOrRoman;
import java.util.Scanner;

/**
 * Title - CalculatorArabicOrRoman.
 * @Rus - Калькулятор. Арабские и римские числа.
 * @author PJ
 * @since 15/08/2020
 * @version 1.0
 * @task
 * 1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами:
 * a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)! Решения, в которых каждое число
 * и арифмитеческая операция передаются с новой строки считаются неверными.
 * 2. Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
 * 3. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.
 * На выходе числа не ограничиваются по величине и могут быть любыми.
 * 4. Калькулятор умеет работать только с целыми числами.
 * 5. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно,
 * при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
 * 6. При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
 * 7. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций,
 * приложение выбрасывает исключение и завершает свою работу.
 * Sample Input:
 * 1 + 2
 * Sample Output:
 * 3
 * Sample Input:
 * VI / III
 * Sample Output:
 * II
 */

public class Calculator {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Введите данные:");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            Scanner s = new Scanner(str);
            boolean flag1 = s.hasNextInt();
            boolean flag2 = s.hasNext();
            try {
                if (flag1 == true) {
                    String itog = CalculationArabicOrRoman.arabic(str);
                    System.out.println("Ответ: " + itog);
                    System.out.println(" ");
                } else if (flag1 == false && flag2 == true) {
                    String str1 = s.next();
                    String str2 = s.next();
                    String str3 = s.next();
                    String itog = CalculationArabicOrRoman.roman(str1, str2, str3);
                    System.out.println("Ответ: " + itog);
                } else {
                    System.out.println("Выход из калькулятора");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Введены некорректные данные");
                break;
            }
        }
    }
}
