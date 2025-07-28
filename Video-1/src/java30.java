//To Calculate the Factorial of a Number

import java.util.Scanner;

public class java30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number for Factorial: ");
        int num= input.nextInt();

        if(num<0)
        {
            System.out.println("Factorial for Negative Number is not Possible: ");
        }
        else {
            factorial(num);
        }
    }
    static void factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of the Number is: "+fact);
    }
}
