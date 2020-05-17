package SearchAndSort;

/**
 * Title: Bubble Sort
 * @Eng - Bubble sorting in ascending and descending order.
 * @Rus - Пузырьковая сортировка по возрастанию и по убыванию.
 * @author PJ
 * @since 04/05/2020
 * @version 1.0
 * @param int[] array - input array.
 * @return int[] array - output array.
 */

public class BubbleSort {

    public static int[] ascendingSort(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = a + 1; b <array.length; b++) {
                if (array[a] > array[b]) {
                    int tmp = array[b];
                    array[b] = array[a];
                    array[a] = tmp;
                }
            }
        }
        return array;
    }


    public static int[] descendingSort(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = a + 1; b <array.length; b++) {
                if (array[a] < array[b]) {
                    int tmp = array[b];
                    array[b] = array[a];
                    array[a] = tmp;
                }
            }
        }
        return array;
    }
}
