import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class breadthFirstSearch {
    // create the node class
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }
    }

    public List<String> breadthFirstSearch(List<String> array) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(this);
    }
}
