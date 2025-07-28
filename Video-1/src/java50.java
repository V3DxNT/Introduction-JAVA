// This program calculates the sum of the two diagonals of a square matrix

import java.util.Scanner;

public class java50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                // Check if element is on primary diagonal (i == j)
//                // or on secondary diagonal (j == n - 1 - i)
//                if (i == j || j == n - 1 - i) {
//                    sum += matrix[i][j];
//                }
//            }
//        }

        int totalDiagonalSum = primaryDiagonalSum + secondaryDiagonalSum;

        System.out.println("Sum of primary diagonal elements: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal elements: " + secondaryDiagonalSum);
        System.out.println("Total sum of both diagonals: " + totalDiagonalSum);
    }
}
