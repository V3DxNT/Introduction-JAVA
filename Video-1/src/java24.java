//Program to show Bitwise Compliment (~)

import java.util.Scanner;

public class java24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int a= input.nextInt();

        System.out.println("The Result of Bitwise Compliment is: "+(~a));
    }
}
