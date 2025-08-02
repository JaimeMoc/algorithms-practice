// Jaime Moctezuma.
// Algorithm MargeSort using Java

package org.example;

public class MergeSort {

    // Public method to invoke the algorithm
    public static void mergeSort(int [] array) {
        if (array.length > 1){
            int mid = array.length /2;

            // Split the array into two halves.
            int [] left = new int[mid];
            int [] right = new int[array.length - mid];

            // Copy elements into the subarrays
            System.arraycopy(array, 0, left, 0 ,mid);
            System.arraycopy(array, mid, right, 0, array.length - mid);

            // Recursive call to mergeSort on each half
            mergeSort(left);
            mergeSort(right);

            // Merge the already sorted arrays
            merge(array, left, right);
        }
    }
    // Method to merge two sorted arrays
    private static void merge(int[] result, int[] left, int [] right) {
        int i = 0; // Index for left
        int j = 0; // Index for right
        int k = 0; // Index for result

        // Compare elements and copy the smaller one
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy the remaining elements (if any)
        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    // Public Method to print the array
    public static void printArray(int[] array){
        for (int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test it
    public static void main(String[] args){
        int[] array = {48, 72, 21, 93, 56, 81, 30, 15};
        System.out.println("Array original: ");
        printArray(array);

        mergeSort(array);

        System.out.println("Array ordenado con Merge Sort:");
        printArray(array);
    }
}