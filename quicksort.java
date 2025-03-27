public class quicksort {
    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int count = 0;

        // Count elements smaller than or equal to pivot
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }

        // Pivot index is found by placing pivot in its correct position
        int pivotidx = start + count;
        swap(arr, start, pivotidx);

        // Now partitioning the array
        int i = start, j = end;
        while (i < pivotidx && j > pivotidx) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotidx && j > pivotidx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }

    public static void quicksort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        // Partition the array and get the pivot index
        int pi = partition(arr, start, end);

        // Recursively sort the subarrays
        quicksort(arr, start, pi - 1);
        quicksort(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 7, 3, 4};
        int n = arr.length;

        // Call quicksort on the entire array
        quicksort(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
