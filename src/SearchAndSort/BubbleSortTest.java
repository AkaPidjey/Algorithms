package SearchAndSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void whenAscExample1() {
        int[] input = new int[] { 1, 10, -5, 0, 20, 100, 22, -10 };
        int[] result = BubbleSort.ascendingSort(input);
        int[] expect = { -10, -5, 0, 1, 10, 20, 22, 100 };
        assertArrayEquals(result, expect);

    }
    @Test
    public void whenAscExample2() {
        int[] input = new int[] { 50, 20, 0, -10, -50, 100 };
        int[] result = BubbleSort.ascendingSort(input);
        int[] expect = { -50, -10, 0, 20, 50, 100 };
        assertArrayEquals(result, expect);
    }
    @Test
    public void whenDescExample1() {
        int[] input = new int[]{1, 10, -5, 0, 20, 100, 22, -10};
        int[] result = BubbleSort.descendingSort(input);
        int[] expect = {100, 22, 20, 10, 1, 0, -5, -10};
        assertArrayEquals(result, expect);
    }

    @Test
    public void whenDescExample2() {
        int[] input = new int[] { 50, 20, 0, -10, -50, 100 };
        int[] result = BubbleSort.descendingSort(input);
        int[] expect = { 100, 50, 20, 0, -10, -50 };
        assertArrayEquals(result, expect);
    }

}