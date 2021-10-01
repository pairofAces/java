import jdk.internal.org.jline.terminal.impl.CursorSupport;


// Complexity Analysis
    // Time: O(n) time, where (n) is the length of the array

    // Space: O(1) constant space, since no external data structures are
    // being utilized
    
public class singleCycleCheck {
    public static boolean hasSingleCycle(int[] array) {
        int numElementsVisited = 0;
        int currentIdx = 0;

        while (numElementsVisited < array.length) {
            if(numElementsVisited > 0 && currentIdx == 0) {
                return false;
            }
            numElementsVisited++;
            
            //invoke helper function and reference the return value
            //set to the (currentIdx) 
            currentIdx = getNextIdx(currentIdx, array);
        }

        // return statement (since the method is 
        // supposed to return a boolean value)
        return currentIdx == 0;
    }

    // create helper function
    public static getNextIdx(int currentIdx, int[] array) {
        // create reference point for element at the index of (currentIdx)
        int jump = array[currentIdx];

        // create a variable to store the remainder value of the 
        // sum of (currentIdx) and (jump) modulo the length of 
        // the array
        int next = (currentIdx + jump) % array.length;

        // ternary operator to check if the value of (next) is greater than
        // or equal to 0
        return next >= 0 ? next : next + array.length;
    }
}
