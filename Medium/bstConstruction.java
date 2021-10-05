class Program {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST (int value) {
            this.value = value;
        }
    }

    // create BST insert method
    public BST insert (int value) {
        // if the input value is less than the initial value from the constructor
        if (value < this.value) {
            if (left == null) {
                BST newBst = new BST(int value);
                left = newBst;
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                BST newBst = new BST(int value);
                right = newBst;
            } else {
                right.insert(value);
            }
        }
    }

    // create a boolean contains method
    public boolean contains(int value) {

    }

    // create BST remove method
    public BST remove(int value, BST parent) {

    }

    // create a method to get the min value
    public int getMinVal() {

    }
}