//Program to show Bitwise Left Shift Operator by one position

import java.util.Scanner;

public class java25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int a= input.nextInt();

        System.out.println("The Result of Bitwise Left Shift Operator is: "+(a<<1));
    }
}
