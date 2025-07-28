// This program is to check if the number is a Palindrome or not

import java.util.Scanner;

public class java38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int originalNumber=num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(originalNumber == reverse)
        {
            System.out.println("The Number is a Palindrome");
        }
        else{
            System.out.println("The Number is not a Palindrome");
        }
    }
}
