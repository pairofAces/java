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

            // increment the array pointer
            arrayPointer++;
        }

        // return the boolean result of checking if seqPointer
        // is equal to the size of the sequence
        return seqPointer == sequence.size();
    }
}

// using for loop
class Solution2 {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // create variable to represent the sequence index
        int seqIndex = 0;

        // initiate for loop
        for (var value : array) {
            // (edge case) if the sequence size is equal to seqIndex
            // then break the loop
            if (sequence.size() == seqIndex) {
                break;
            }

            // if the element at the index of seqIndex within the sequence is
            // equal to the value
                // increment the sequence index
            if (sequence.get(seqIndex).equals(value)) {
                seqIndex++;
            }
        }
        // return the boolean result
        // of the check to make sure that the seqIndex is equal
        // to the size of the sequence
        return seqIndex == sequence.size();
    }
}