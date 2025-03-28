import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input size for the first array
        System.out.print("Enter the size of the first sorted array: ");
        int n1 = scanner.nextInt();

        // Input elements for the first sorted array
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input size for the second array
        System.out.print("Enter the size of the second sorted array: ");
        int n2 = scanner.nextInt();

        // Input elements for the second sorted array
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Merge the two sorted arrays
        int[] mergedArray = mergeArrays(arr1, arr2);

        // Display the merged sorted array
        System.out.println("\nMerged Sorted Array:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to merge two sorted arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Create a new array to store the merged result
        int[] mergedArray = new int[n1 + n2];

        // Use two pointers to merge the arrays
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
