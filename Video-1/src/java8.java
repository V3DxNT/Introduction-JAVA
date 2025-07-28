import java.util.Scanner;

//Program to take two Numbers and show result of all arithematic operators
public class java8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int a= input.nextInt();
        System.out.print("Enter the Second Number :");
        int b= input.nextInt();

        System.out.println("The Addition of the Numbers is:"+ (a+b));
        System.out.println("The Subtraction of the Numbers is:"+ (a-b));
        System.out.println("The Multiplication of the Numbers is:"+ (a*b));
        System.out.println("The Division of the Numbers is:"+ (a/b));
        System.out.println("The Modulus of the Numbers is:"+ (a%b));

    }
}
