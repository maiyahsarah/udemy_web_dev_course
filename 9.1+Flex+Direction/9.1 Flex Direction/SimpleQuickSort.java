public class SimpleQuickSort {
    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex - 1);  // Sort left part
            quickSort(arr, partitionIndex + 1, end); }}   // Sort right part
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;  // Index of smaller element
        for (int j = start; j < end; j++) {
            //If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;}}
        // Swap arr[i+1] and arr[end] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;}
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");}}}