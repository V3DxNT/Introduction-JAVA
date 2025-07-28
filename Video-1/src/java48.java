// This program searches for an element in a 2D array and prints its position(s)

import java.util.Scanner;

public class java48 {
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

        System.out.print("Enter the element to search for: ");
        int target = input.nextInt();

        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at row " + i + ", column " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
