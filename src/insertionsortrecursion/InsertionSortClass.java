package insertionsortrecursion;

public class InsertionSortClass {

    //recursive method to sort an array using insertion sort
    public static void insertionSortMethod(int[] array) {
        insertionSortMethod(array, array.length);
    }

    private static void insertionSortMethod(int[] array, int i) {
        // base condition
        if (i <= 1) {
            return;
        }

        //sort first i-1 elementts
        insertionSortMethod(array, i - 1);

        //insert last element at its correct position in sorted array
        int key = array[i - 1];
        int j = i - 2;

        //move the elements of array[0...i-1] , that are greater than the key, to one position ahead of their current position.
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j = j - 1;
        }
        array[j + 1] = key;
    }
}
