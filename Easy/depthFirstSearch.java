// Depth First Search

// Solution 1

import java.util.*;

// Complexity Analysis
    // Time: O(v + e) time, where (v) represents the number of
    //       vertices and (e) represents the number of edges.

    // Space: O(v) space, where (v) is the size of the List that was
    //        created
    

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

            // traverse through the children List, and go through each Node
            // currently in the list
            for(int i = 0; i < children.size(); i++) {
                // get the (i)th element in the children list,
                // then invoke the depthFirstSearch class method to search through
                // the child nodes of the (i)th node-element
                children.get(i).depthFirstSearch(array);
            }
            // return the array
            return array;
        }

        public Node addChild(String name) {
            // create a reference to a new node created with the
            // input (name)
            Node child = new Node(name);

            // add the child created above, into the (children)
            // List
            children.add(child);

            return this;
        }
    }
}