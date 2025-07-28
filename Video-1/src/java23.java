//Program to show Bitwise XOR

import java.util.Scanner;

public class java23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int a= input.nextInt();

        System.out.print("Enter the Second Number: ");
        int b= input.nextInt();

        System.out.println("The Result of Bitwise XOR is: "+(a^b));
    }
}
