//To check if a number is odd or even using bitwise operators

import java.util.Scanner;

public class java27 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num= input.nextInt();

        if((num&1)==0){
            System.out.println("The Number is Even");
        }else{
            System.out.println("The Number is Odd");
        }
    }
}
