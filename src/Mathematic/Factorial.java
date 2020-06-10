package Mathematic;

import java.math.BigInteger;

/**
 * Title: Factorial
 * @Eng - The method calculates the factorial of a number.
 * @Rus - Метод вычисляет факториал числа.
 * @author PJ
 * @since 18/05/2020
 * @version 1.0
 * @param x - input int.
 */

public class Factorial {
    public static BigInteger facV1(int x) {
        BigInteger result = BigInteger.valueOf(1);
            for (int a = 1; a <= x; a++) {
                result = result.multiply(BigInteger.valueOf(a));
            }
        return result;
    }

    public static BigInteger facV2(int x) {
        if (x == 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(x).multiply( facV2(x - 1));
        }
    }
}
