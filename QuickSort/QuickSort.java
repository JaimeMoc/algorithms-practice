// Jaime Moctezuma
// QuickSort Algorithm.

public class QuickSort{

    // Public method that starts the algorithm.
    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    // Recursive method of QuickSort
    private static void quickSort(int [] array, int low, int high){
        if (low < high ){
            // Get the pivot index after partitioning.
            int pivotIndex = partition(array, low, high);

            // Sort the elements before and after the pivot
            quickSort(array, low, pivotIndex -1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Method to rearrange the array based on the pivot
    private static int partition(int [] array, int low, int high){
        int pivot = array[high]; // We use the last element as
        int i = low - 1; // Index of the smallest element

        for (int j = low; j < high; j++){
            // If the current element is less that or equal to the pivot.
            if (array[j] <= pivot){
                i++;
                // Swap array[i] with array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Place the pivot in its correct position.
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1; // Return the position of the pivote
    }

    // Method to print the array
    public static void printArray(int [] array){
        for (int num: array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    // Main method to test QuickSort
    public static void main(String[]  args){
        int[] data = {8, 3, 1, 7, 10, 2, 6};

        System.out.println("Antes de ordenar / Before sorting: ");
        printArray(data);

        quickSort(data);

        System.out.println("Despues de ordenar / After sorting: ");
        printArray(data);
    }
}