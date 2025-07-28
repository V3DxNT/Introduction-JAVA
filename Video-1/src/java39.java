//Program to print Triangular Patterns

import java.util.Scanner;

public class java39 {

    public static void pattern1(int n) {
        // Lower-left triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        // Upper-left triangle
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        // Lower-right triangle
        for (int i = 1; i <= n; i++) {
            // print spaces first
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

        System.out.println("\nPattern 1: Lower-left Triangle");
        pattern1(n);

        System.out.println("\nPattern 2: Upper-left Triangle");
        pattern2(n);

        System.out.println("\nPattern 3: Lower-right Triangle");
        pattern3(n);
    }
}
