//To calculate the Product of two floating point numbers

import java.util.Scanner;

public class java9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first Number:");
        float a= input.nextFloat();
        System.out.print("Enter the Second Number :");
        float b= input.nextFloat();

        System.out.println("The Product of the two floating point Number is:" + (a*b) );
    }
}
