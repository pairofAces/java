// How to reverse and add a number until you get a palindrome
    // take the input number
        // if palindrome -> true
        // if not, add the reverse of the input, to the input

import java.util.Scanner;

class ReverseAddPalindrome {
    // create methods to handle the following:
        // (1) reverse the number
        // (2) check if the number is a palindrome
        // (3) then, reverse and add the number until the number is a palindrome

    // method to reverse the number
    static int reverseNumber(int num) {
        // create variable for to represent the reverse and the remainder
        int reverse = 0;
        int remainder = 0;

        // create while loop, for as long as the input isn't 0
        while (num != 0) {
            // remainder will hold the value of the last digit of the input
            remainder = num % 10;

            // reverse will be the value of itself multiplied by 10, then addedd with
            // the remainder
                // reverse is multipled by iteself so that the remainder value can be
                // put into the correct position of the desired output
            reverse = (reverse * 10) + remainder;

            // after the last digit of the input is put into the reverse variable,
            // remove the digit from the original input by divind by 10
            num = num / 10;
        }
        // return the value of reverse
        return reverse;
    }

    // method to check if the number is palindrome
    static boolean checkPalindrome(int num) {
        // use the (reverseNumber) class method to reverse the input and
        // hold it in a variable
        int reverse = reverseNumber(num);

        // use if/else logic to compare the reverse to the input number
        if (reverse == num) {
            return true;
        } else {
            return false;
        }
    }

    // reverse and add number until it's palindrome 
}