package avaj.data_strcuture;

import java.util.Scanner;

public class Java_Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Call function to count negative subarrays
        System.out.println(countNegativeSubarrays(arr));
    }

    public static int countNegativeSubarrays(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            int sumSubarray = 0; // Running sum for subarray starting at index i
            for (int j = i; j < n; j++) {
                sumSubarray += arr[j]; // Extend subarray and update sum
                if (sumSubarray < 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
