//Program to Find the Greatest Common Divisor (GCD) of a number

import java.util.Scanner;

public class java33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int gcd = 1;

        int min = (num1 < num2) ? num1 : num2;

        // Try all numbers from 1 to min to find the highest one that divides both
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("Greatest Common Divisor (GCD) is: " + gcd);
    }
}
