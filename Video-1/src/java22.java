//Program to show Bitwise OR

import java.util.Scanner;

public class java22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int a= input.nextInt();

        System.out.print("Enter the Second Number: ");
        int b= input.nextInt();

        System.out.println("The Result of Bitwise OR is: "+(a|b));
    }
}
