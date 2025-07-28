//To Calculate the Perimeter of the Rectangle

import java.util.Scanner;
public class java10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the First Side:");
        int a= input.nextInt();
        System.out.print("Enter the Second Side :");
        int b= input.nextInt();
        System.out.print("Enter the Third Side :");
        int c= input.nextInt();
        System.out.print("Enter the Fourth Side :");
        int d= input.nextInt();

        System.out.println("The Perimeter of the Rectange is: "+(a+b+c+d));
    }
}
