//To Calculate the Area of the Triangle

import java.util.Scanner;

public class java11 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the base of the triangle:");
        int base=input.nextInt();
        System.out.print("Enter the height of the triangle:");
        int height=input.nextInt();
        double ar=0.5*base*height;
        System.out.print("The area of the req triangle is: "+ar);
    }
}
