public class nFibonacci {
    public static int getNthFib(int n) {
        // edge case if the input is 2
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            // use recursion to invoke the class method to the (input +- 1) values
            // and return the sum
            return getNthFib(n - 1) + getNthFib(n + 1);
        }
    }
}
