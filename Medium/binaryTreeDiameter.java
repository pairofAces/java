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
        TreeInfo leftTreeInfo = getTreeInfo(tree.left);
        TreeInfo rightTreeInfo = getTreeInfo(tree.right);

        int longestPathToTreeRoot = leftTreeInfo.height + rightTreeInfo.height;
        int maxDiameterSoFar = Math.max(leftTreeInfo.diameter, rightTreeInfo.diameter);
        int currentDiameter = Math.max(longestPathToTreeRoot, maxDiameterSoFar);
        int currentHeight = 1 + Math.max(leftTreeInfo.height, rightTreeInfo.height);

        return new TreeInfo(currentDiameter, currentHeight);

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

    static class TreeInfo {
        public int diameter;
        public int height;

        public TreeInfo(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }
}
