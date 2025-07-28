// This program prints the Fibonacci series up to the inputted number

import java.util.Scanner;

public class java36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = input.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci series up to " + limit + ": ");

        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
