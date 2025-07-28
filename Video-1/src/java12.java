//To Calculate the Simple Interest

import java.util.Scanner;

public class java12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Principle Amount: ");
        float principle= input.nextFloat();

        System.out.print("Enter the Rate of Interest: ");
        float rate= input.nextFloat();

        System.out.print("Enter the Time: ");
        float time= input.nextFloat();

        System.out.println("The Simple Interest Calculated is: "+ ((principle * rate * time)/100));
    }
}
