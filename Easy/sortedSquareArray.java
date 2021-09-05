// Sorted Square Array

import java.util.*;

class Program {
    public int [] sortedSquareArray(int [] array) {
        // create an array of integers to be the same size of the input array
        int [] sortedSquares = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            // create a reference to the element at the (i)th index
            int value = array[i];

            // insert the square of the (value) into the (sortedSquares) array 
            // initially created
            sortedSquareArray[i] = value * value;
        }
        
    }
}