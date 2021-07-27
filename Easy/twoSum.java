// Two Sum 

import java.util;

// Solution 1, brute force
class Program{
    public static int[] twoNumberSum(int[] array, int targetSum) {
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