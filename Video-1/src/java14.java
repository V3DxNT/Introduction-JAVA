//To Convert Farenheit to Celcius

import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Temperature in Farenheit: ");
        double Faren= input.nextDouble();

        double Celcius= (Faren-32)* 5/9;

        System.out.println("The Temperature in Celcius is: "+Celcius);
    }
}
