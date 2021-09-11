// Subarray sort

import java.util.*;

class Program {
    public static int[] subarraySort(int[] array) {
        // create two variables to represent the max and min
        int minOutOfOrder = Integer.MAX_VALUE;
        int maxOutOfOrder = Integer.MIN_VALUE;

        // initiate for loop to traverse the input array
        for(int i = 0; i < array.length; i++) {
            // create a variable to represent the current element during
            // the traversal
            int num = array[i];

            // create an if statement that will use a helper method
                // helper method will compare the inputs and return a boolean
            if (isOutOfOrder(i, num, array)) {
                minOutOfOrder = Math.min(minOutOfOrder, num);
                maxOutOfOrder = Math.max(maxOutOfOrder, num);
            }

            if (minOutOfOrder == Integer.MAX_VALUE) {
                return new int[] {-1, -1};
            }
        }
    }
}