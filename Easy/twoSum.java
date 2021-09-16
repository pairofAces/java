// Two Sum 

import java.util.*;

// Solution 1, brute force
    // Time: O(n^2) time, where (n) is the length of the array

    // Space: O(1), constant time, since no external data structures are being used
class twoNumberSum{
    public static int[] twoNumbSum(int[] array, int targetSum) {
        // initiate the first for loop to traverse the array
        for (int i = 0; i < array.length - 1; i++) {
            // create a pointer to the first number
            int firstNum = array[i];
            
            // initiate nested for loop with a second pointer
            for(int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetSum) {
                    return new int[] {firstNum, secondNum};
                }
            }
        }
        // if there were no integers that summed to the targetSum
        // return 0
        return new int[0];
    }
}

// Solution 2 - optimized
// Still using the import java.util.*; statement from above

class twoNumberSum2{
    public static int[] twoNumSum(int[] array, int targetSum) {
        // create a new set to act as a hash set that will store the
        // numbers we've tried out
        Set<Integer> nums = new HashSet<>();

        // use a for loop, traverse through the array
        for (int num: array) {
            // create variable to represent the potential match
            int potentialMatch = targetSum - num;

            // initiate if loop to check if the hashset created earlier
            // contains the potentialMatch
            if (nums.contains(potentialMatch)) {
                // if it is contained in the hashset
                // return an array of the current number and the 
                // potentialMatch
                return new int[] {potentialMatch, num};
            } else {
                // else add the current number to the hashset for
                // future reference
                nums.add(num);
            }
        }
        // if the loop is done, and the numbers weren't found
        // return a 0
        return new int[0];
    }
}

class twoNumberSum3 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // initially sort the array
        Arrays.sort(array);

        // create two pointer variables
            // one starting at the beginning of the sorted array
            // the other starting at the end
        int left = 0;
        int right = array.length - 1;

        // generate while loop
            // while the left pointer is less than the value of the right pointer
        while (left < right) {
            // create a variable to represent the current sum of the
            // elements at the (left) and (right) indices
            int currentSum = array[left] + array[right];

            // initiate if statement to check if the currentSum is
            // equal to the targetSum
            if (currentSum == targetSum) {
                // return a new array of the elements at the
                // (left) and (right) indices
                return new int[] {array[left], array[right]};
            } else if (currentSum < targetSum) {
                // if the currentSum is less than the target,
                // the left pointer needs to be incremented
                // and increase the value of currentSum so it can be
                // closer to the target
                left++;
            } else if (currentSum > targetSum) {
                // if the currentSum is larger is than the target,
                // the right pointer needs to be decremented so that the
                // value of currentSum is closer to the value of the target
                right--;
            }
        }
        // if the two integers are not found, return 0
        return new int[0];
    }
}
