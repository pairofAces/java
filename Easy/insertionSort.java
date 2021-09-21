public class insertionSort {
    public static int [] insertSort(int[] array) {
        if(array.length == 0) {
            return new int[] {};
        }
        for (int i = 0; i < array.length; i++) {
            int j = 1;
            while (j > 0 && array[j] < array[j - 1]) {
                // aspirational code, helper method
                swap(j, j - 1, array);
                j -= 1;
            }
        }
        
        return array;
    }

    // create helper method below
    public static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
