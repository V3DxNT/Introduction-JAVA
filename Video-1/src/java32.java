//Program to Find the Least Common Multiple (LCM) of a number


import java.util.Scanner;
public class java32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take two numbers from the user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break; // lcm found
            }
            lcm++;
        }

        System.out.println("Least Common Multiple (LCM) is: " + lcm);
    }
}
