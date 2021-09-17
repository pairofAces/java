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



class nFibonacci3 {
    public static int getNthFib(int x) {
        int [] lastTwo = {0, 1};
        int counter = 3;

        while (counter <= x) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }

        return n > 1 ? lastTwo[1] : lastTwo[0];
    }
}