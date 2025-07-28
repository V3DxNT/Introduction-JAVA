//Program to Sum all Odd numbers upto the Number Inputted

import java.util.Scanner;

public class java29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number to oddCount Sum till: ");
        int num= input.nextInt();

        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(i%2==0) continue;
            else {
                sum += i;
            }
        }
        System.out.println("The Sum of all Odd Numbers is: "+sum);
    }
}
