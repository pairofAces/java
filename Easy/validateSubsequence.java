// Validate Subsequence

import java.util.*;

class Solution1 {
    public static boolean validateSubsequence(List<Integer> array, List<Integer> sequence) {
        // create two pointer variables to keep track of the indices in
        // the array and the sequence
        int arrayPointer = 0;
        int seqPointer = 0;
        // while the pointers are less than their repective arrays
        while (arrayPointer < array.size() && seqPointer < sequence.size()) {
            // if the the elements at the index positions of each pointer are equal
            // then increment the sequence pointer
            if (array.get(arrayPointer).equals(sequence.get(seqPointer))) {
                seqPointer++;
            }
        }
    }
}

