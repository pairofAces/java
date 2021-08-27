// Invert Binary Search Tree

// write a function that takes in a binary tree and inverts it
    // the function should swap every left node for its corresponding right node

import java.util.*;

class Program {
    public static void invertBinaryTree(BinaryTree tree) {
        ArrayDeque<BinaryTree> queue = new ArrayDeque<BinaryTree>;
        queue.addLast(tree);

        while (queue.size() > 0) {
            BinaryTree current = queue.pollFirst();
        }
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}