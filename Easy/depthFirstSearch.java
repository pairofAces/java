// Depth First Search

// Solution 1

import java.util.*;

class Program {
    static class Node {
        // initiate a variable to hold a string value
        String name;

        // create a list that will contain nodes
        List<Node> children = new ArrayList<Node>();

        public Node (String name) {
            this.name = name;
        }

        // create a class method that will search through an input array
        public List<String> depthFirstSearch(List<String> array) {
            // add the (name) into the input array
            array.add(this.name);

            
        }
    }
}