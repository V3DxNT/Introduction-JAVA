//To Determine if the Number is Odd or Even

import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number to Check:");
        int num= sc.nextInt();

        if(num%2==0) System.out.println("The Number is Positive");

        else System.out.println("The Number is Negative");
    }

}


