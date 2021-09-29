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
    
}
