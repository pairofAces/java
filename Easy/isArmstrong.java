// create a program that will check to see if a number
// is an armstrong

// an armstrong is an n-digit number that is equal to
// the sum of the nth powers of its individual digits

class Program {
    public static void main(String[] args) {
        // initiate starting variables
            // int num is just an example for now
        int num = 371, originalNum, remainder, result = 0;

        // set originalNum equal to the input num
        originalNum = num;

        while (originalNum != 0) {
            // the remainder will be the last digit of the originalNum
            // at each iteration of the while loop
            remainder = originalNum % 10;

            // create a variable that represents the length of the input num
            int length = (int) (Math.log10(num) + 1);

            // the result will be incremented by the value of the remainder
            // to the power of the length of the input number
            result += Math.pow(remainder, length);

            // the originalNum will be divided by 10, to take the last digit 
            // out and concentrate on the remaining digits of the input number
            originalNum /= 10;
        }

    }
}