//Program to Print Multiplication Table of a Number

import java.util.Scanner;

public class java28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number to Print Table: ");
        int num= input.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+ i + " = " + (num*i));
        }
    }
}
