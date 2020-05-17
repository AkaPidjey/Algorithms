package SearchAndSort;

import static org.junit.Assert.*;

import SearchAndSort.Binarysearch;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class BinarysearchTest {
    @Test
    public void whenValue5() {
        int[] input = new int[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = i + 1;
        }
        int value = 5;
        int result = Binarysearch.binary_search(input, value);
        int expect = 4;
        assertEquals(result, expect);
    }

    @Test
    public void whenValue100() {
        int[] input = new int[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = i + 1;
        }
        int value = 100;
        int result = Binarysearch.binary_search(input, value);
        int expect = 99;
        assertEquals(result, expect);
    }

    @Test
    public void whenValue0() {
        int[] input = new int[100];
        for (int i = 0; i < input.length; i++) {
            input[i] = i + 1;
        }
        int value = 150;
        int result = Binarysearch.binary_search(input, value);
        int expect = 0;
        assertEquals(result, expect);
    }

}