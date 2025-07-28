//Program to find the Sum and Average of all elements in a Array

import java.util.Scanner;

public class java40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (n > 0) ? (double) sum / n : 0;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
