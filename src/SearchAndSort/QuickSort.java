package SearchAndSort;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: QuickSort
 * @Eng - QuickSort.
 * @Rus - Метод быстрой сортировки.
 * @author PJ
 * @since 10/05/2020
 * @version 1.0
 * @param int[] array - input array.
 * @return int[] array - output array.
 */

public class QuickSort {

    public static List<Integer> quickSort(List<Integer> list) {
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        if (list.size() < 2) {
            return list;
        } else {
            int temp = list.get(0);
            for (int a = 0; a < list.size(); a++) {
                if (list.get(a) <= temp) {
                    less.add(a);
                } else {
                    greater.add(a);
                }
            }
            list.clear();
            quickSort(less);
            quickSort(greater);
            list.addAll(less);
            list.add(temp);
            list.addAll(greater);
            return list;
        }

    }
}
