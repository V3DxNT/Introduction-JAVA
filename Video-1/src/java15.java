//To determine if a Number is Positive Negative or Zero

import java.util.Scanner;

public class java15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number to Check:");
        int num= sc.nextInt();

        if(num==0){
            System.out.println("The Number is Zero");
        }
        else if(num>0) System.out.println("The Number is Positive");

        else System.out.println("The Number is Negative");
    }
}
