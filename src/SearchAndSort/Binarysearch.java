package SearchAndSort;

/**
 * Title: Binary search
 * @author PJ
 * @since 20/04/2020
 * @version 1.0
 * @param list - input array.
 * @param item - input desired value.
 * @return mid - number of the element in the array. Or 0 if there are no matches
 */

public class Binarysearch {

    public static int binary_search(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = low + high;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}
