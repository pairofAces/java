import java.util.*;

public class binaryTreeDiameter {
    public int binTreeDiameter(BinaryTree tree) {
        // create helper method
        return getTreeInfo(tree).diameter;
    }

    // create helper function here
    
    // create binary tree class
    static class binaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }


    }
}
