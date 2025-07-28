import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first Number to add:");
        int a= input.nextInt();
        System.out.print("Enter the Second Number to add:");
        int b= input.nextInt();
        System.out.println("The Result of Addition is: "+(a+b));
    }
}
