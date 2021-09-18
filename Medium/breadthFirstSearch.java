import java.util.ArrayList;

public class breadthFirstSearch {
    // create the node class
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }
    }
}
