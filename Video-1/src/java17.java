//To Check for the Greatest of the three Numbers

import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int num1= sc.nextInt();

        System.out.print("Enter the Second Number:");
        int num2= sc.nextInt();

        System.out.print("Enter the Third Number:");
        int num3= sc.nextInt();

        int greatest;

        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        System.out.println("The Greatest Number is:" + greatest);
    }
}
