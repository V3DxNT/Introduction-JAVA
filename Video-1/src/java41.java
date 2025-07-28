// This program finds the number of occurrences of an element in an array

import java.util.Scanner;

public class java41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the element to find occurrences of: ");
        int target = input.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("The element " + target + " occurs " + count + " time(s) in the array.");
    }
}
