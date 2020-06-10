package SearchAndSort;

import SearchAndSort.QuickSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {

    private void assertArrayEquals(List<Integer> result, List<Integer> expect) {
    }

    @Test
    public void example1() {
        List<Integer> input = new ArrayList<>();
        input.add(20);
        input.add(10);
        input.add(40);
        input.add(30);
        input.add(60);
        input.add(50);
        List<Integer> expect = new ArrayList<>();
        expect.add(10);
        expect.add(20);
        expect.add(30);
        expect.add(40);
        expect.add(50);
        expect.add(60);
        List<Integer> result = QuickSort.quickSort(input);
        assertArrayEquals(result, expect);
    }

    @Test
    public void example2() {
        List<Integer> input = new ArrayList<>();
        input.add(-20);
        input.add(10);
        input.add(-40);
        input.add(30);
        input.add(-60);
        input.add(50);
        List<Integer> expect = new ArrayList<>();
        expect.add(-60);
        expect.add(-40);
        expect.add(-20);
        expect.add(10);
        expect.add(30);
        expect.add(50);
        List<Integer> result = QuickSort.quickSort(input);
        assertArrayEquals(result, expect);
    }


}

