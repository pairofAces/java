class Solution {
    public boolean isPalindrome(int x) {
        // handle edge case, if the input number is less than 0
        // return false
        if (x < 0) return false;

        // create comparison variables
        int reversed = 0, remainder, original = num;

        // initiate while loop for as long as the input isn't 0
        while (x != 0) {
            // the remainder variable will hold the last digit of the input number
            remainder = x % 10;

            // the reversed variable will multiply itself by 10, then add the value
            // of the remainder, so that the remainder can be stored at the next
            // decimal place
            reversed = reversed * 10 + remainder;

            // after the last digit of the input is added to our new variable, reversed,
            // remove the last digit of the input number by dividing the input by 10
            x /= 10;
        }
        
    }
}