// This program calculates the sum and average of all elements in a 2D array

import java.util.Scanner;

public class java49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int sum = 0;
        int totalElements = rows * cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
        }

        double average = (totalElements > 0) ? (double) sum / totalElements : 0;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }
}
