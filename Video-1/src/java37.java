// This program checks whether a number is an Armstrong number or not

import java.util.Scanner;

public class java37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int originalNum = num;
        int sum = 0;

        // Count digits using log10
        int digits = (num == 0) ? 1 : (int)Math.log10(num) + 1;

        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is Not an Armstrong Number.");
        }
    }
}
