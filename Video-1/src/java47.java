// This program merges two sorted arrays into one sorted array

import java.util.Scanner;

public class java47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of first sorted array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.print("Enter the size of second sorted array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged sorted array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
