import java.util.*;

public class threeNumberSum {
    public static List<Integer[]> threeNumSum(int[] array, int targetSum) {
        // sort the input array
        Arrays.sort(array);
        List<Integer []> triplets = new ArrayList<Integer[]>();

        // traverse through the sorted array
        for (int i = 0; i < array.length - 2; i++) {
            // create left and right pointer variables
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                // create logic
            }
        }
    }
}
