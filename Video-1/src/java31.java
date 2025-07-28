//Program to Compute the Sum of Digits of a Number

import java.util.Scanner;

public class java31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
