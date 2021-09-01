// Invert Binary Search Tree

// write a function that takes in a binary tree and inverts it
    // the function should swap every left node for its corresponding right node

import java.util.ArrayDeque;

// Complexity
    // Time: O(n) time, where (n) is the length of the tree
    // Space: O(n) space
class Program {
    public static void invertBinaryTree(BinaryTree tree) {
        ArrayDeque<BinaryTree> queue = new ArrayDeque<BinaryTree>;
        queue.addLast(tree);

        while (queue.size() > 0) {
            BinaryTree current = queue.pollFirst();

            // create helper function to swap the nodes
            swapLeftAndRight(current);

            // if statement to check if the nodes aren't null
            if (current.left != null) {
                // add the left node to the ending of the queue
                queue.addLast(current.left);
            }
            if (current.right != null){
                queue.addLast(current.right);
            }
        }
    }

    public static void swapLeftAndRight(BinaryTree tree) {
        BinaryTree left = tree.left;
        tree.left = tree.right;
        tree.right = tree.left;
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

// Solution 2

class Solution {
    public static void invertBinaryTree2(BinaryTree tree) {
        // edge case, what if the tree is null?
        if (tree == null) {
            // return empty statement
            return;
        }

        // create helper function to swap nodes
        swapLeftAndRight(tree) // this is the helper function

        // use recursion to invoke the invertBinaryTree2 function
        
    }

    // create the Binary Tree

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}