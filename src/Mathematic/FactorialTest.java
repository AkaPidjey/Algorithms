package Mathematic;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void whenExampleV1_3() {
        int input = 3;
        BigInteger result = Factorial.facV1(input);
        BigInteger example = BigInteger.valueOf(6);
        assertEquals(result, example);
    }
    @Test
    public void whenExampleV1_4() {
        int input = 4;
        BigInteger result = Factorial.facV1(input);
        BigInteger example = BigInteger.valueOf(24);
        assertEquals(result, example);
    }
    @Test
    public void whenExampleV1_5() {
        int input = 5;
        BigInteger result = Factorial.facV1(input);
        BigInteger example = BigInteger.valueOf(120);
        assertEquals(result, example);
    }

    @Test
    public void whenExampleV2_3() {
        int input = 3;
        BigInteger result = Factorial.facV2(input);
        BigInteger example = BigInteger.valueOf(6);
        assertEquals(result, example);
    }
    @Test
    public void whenExampleV2_4() {
        int input = 4;
        BigInteger result = Factorial.facV2(input);
        BigInteger example = BigInteger.valueOf(24);
        assertEquals(result, example);
    }
    @Test
    public void whenExampleV2_5() {
        int input = 5;
        BigInteger result = Factorial.facV2(input);
        BigInteger example = BigInteger.valueOf(120);
        assertEquals(result, example);
    }

}