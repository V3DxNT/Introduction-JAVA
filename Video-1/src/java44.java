// This program returns a new array after deleting a specific element from the original array

import java.util.Scanner;
import java.util.Arrays;

public class java44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element to delete: ");
        int target = input.nextInt();

        int count = 0;
        // Count occurrences of target to find size of new array
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element not found in the array. No deletion performed.");
            System.out.println("New array: " + Arrays.toString(arr));
            return;
        }

        int[] newArr = new int[n - count];
        int index = 0;

        for (int num : arr) {
            if (num != target) {
                newArr[index++] = num;
            }
        }

        System.out.println("New array after deleting " + target + ": " + Arrays.toString(newArr));
    }
}
