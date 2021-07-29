class Program {
    public void reverseWordInString(String str) {
        // split the words in the string into an array
        String [] words = str.split(" ");

        // create a variable to represent the final reversed string
        String reversed = "";

        // iterate over the words array
        for (int i = 0; i < words.length; i++) {
            // create variable to represent each word during the
            // traversal
            String word = words[i];
            // create second empty string variable to represent
            // the singular word that will be reversed
            String reversedWord = "";

            // initate nested for loop to iterate over the single word
            // and add it into the reversedWord variable
            for (int j = word.length() - 1; j >= 0; j--) {
                
            }

        }
    }
}