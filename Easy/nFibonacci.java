import java.util.*;

// Complexity Analysis:
    // Time: O(2^n) time, where (n) is the value of the input

    // Space: O(n), since we're using recursion, the higher the input value,
    //        the longer the recursive call will be invoked
public class nFibonacci{
    public static int getNthFib(int n) {
        // edge case if the input is 2
        if (n == 2) {
            return 1;
        } else if (n == 1) {
            return 0;
        } else {
            // use recursion to invoke the class method to the (input +- 1) values
            // and return the sum
            return getNthFib(n - 1) + getNthFib(n - 2);
        }
    }
}

// Complexity
    // Time: O(n) time, where (n) is the size of the input

    // Space: O(n) space
class nFibonacci2 {
    public static int getNthFib(int n) {
        // create a hashmap to hold initial values
        Map<Integer, Integer> memoize = new HashMap<Integer, Integer>();

        // insert key-value pairs of (1,0) & (2,1) into the hashmap
        memoize.put(1, 0);
        memoize.put(2, 1);

        // return a recursive call to another class method of the same name,
        // but different parameters
        return getNthFib(n, memoize);
    }

    // create second class method with same name but use the integer (n) and
    // the hashmap as parameters
    public static int getNthFib(int n, Map<Integer, Integer> memoize) {
        // check if the hashmap contains the input (n) - key
        if (memoize.containsKey(n)) {
            return memoize.get(n);
        } else {
            memoize.put(n, getNthFib(n - 1, memoize) + getNthFib(n - 2, memoize));
            return memoize.get(n);
        }
    }
}

// Complexity
    // Time: O(n) time, where (n) is the size of the input integer

    // Space: O(1) constant space since no external data structures are
    //        being utilized

class nFibonacci3 {
    public static int getNthFib(int x) {
        // create an array of the first two numbers, which should be 0 and 1
        int [] lastTwo = {0, 1};

        // create a (counter) variable initialized at 3
        int counter = 3;

        // initiate while loop as long the the (counter) variable is less than
        // or equal to the input (x)
        while (counter <= x) {
            // create a variable to represent the sum of the elements in 
            // the (lastTwo) array initially created
            int nextFib = lastTwo[0] + lastTwo[1];

            // change the value of the first element in (lastTwo) to the second,
            // and change the second element to the value of (nextFib)
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;

            // increment the counter variable
            counter++;
        }

        // create a ternary expression to show the first/second element
        // in (lastTwo) depending on the condition if the input
        // integer is greater than 1 
        return x > 1 ? lastTwo[1] : lastTwo[0];
    }
}