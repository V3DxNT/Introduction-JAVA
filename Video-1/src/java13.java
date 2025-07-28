//To calculate Compound Interest

import java.util.Scanner;

public class java13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Principle Amount: ");
        float principle= input.nextFloat();

        System.out.print("Enter the Rate of Interest: ");
        float rate= input.nextFloat();

        System.out.print("Enter the Time: ");
        float time= input.nextFloat();

        double amount = principle * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principle;

        System.out.println("The Compound Interest is: "+compoundInterest);
    }
}
