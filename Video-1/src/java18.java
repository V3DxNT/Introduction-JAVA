//To Check if Leap Year or Not

import java.util.Scanner;

public class java18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Year to check:");
        int year= input.nextInt();

        if((year%4==0 && year%100!=0)|| year%400==0) System.out.println("Yes it is a Leap Year");
        else System.out.println("It is not a Leap Year");
    }
}
