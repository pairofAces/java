import java.util.*;

public class binaryTreeDiameter {
    public int binTreeDiameter(BinaryTree tree) {
        // create helper method
        return getTreeInfo(tree).diameter;
    }

    // create helper function here
    public TreeInfo getTreeInfo(BinaryTree tree) {
        // edge case if the tree is null
        if (tree == null) {
            return new TreeInfo(0, 0);
        }

        // recursively invoke the method to the left and right children
        TreeInfo lefttTreeInfo = getTreeInfo(tree.left);
        TreeInfo righttTreeInfo = getTreeInfo(tree.right);

        

    }
    
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
