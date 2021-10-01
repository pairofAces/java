import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Complexity Analysis
    // Time: O(v + e) time, where (v) is the numbe of vertices and
    //       (e) is the number of edges

    // Space: O(v) space, where (v) is the length of the (children) List
    
public class breadthFirstSearch {
    // create the node class
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }
        
        public List<String> breadthFirstSearch(List<String> array) {
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(this);
    
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                array.add(current.name);
                queue.addAll(current.children);
            }
    
            return array;
        }
    
        // class method to add a node child
        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
