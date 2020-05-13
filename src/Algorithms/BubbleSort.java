package Algorithms;

public class BubbleSort {
    /**
     * Title: Bubble Sort
     * @author PJ
     * @since 04/05/2020
     * @version 1.0
     * @param list - input array.
     * @param item - input desired value.
     * @return mid - number of the element in the array. Or 0 if there are no matches
     */

    public static void descendingSort(int[] array) {
    //    int[] result;
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = a + 1; b <array.length; b++) {
                if (array[a] < array[b]) {
                    int tmp = array[b];
                    array[b] = array[a];
                    array[a] = tmp;
                }
            }
        }
    //    for (int i = 0; i < array.length; i++) {


    }


    public static void ascendingSort(int[] array) {
        for (int a = 0; a < array.length - 1; a++) {
            for (int b = a + 1; b <array.length; b++) {
                if (array[a] > array[b]) {
                    int tmp = array[b];
                    array[b] = array[a];
                    array[a] = tmp;
                }
            }
        }
    }



}
