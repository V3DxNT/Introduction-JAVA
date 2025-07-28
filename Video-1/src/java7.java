import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int a= input.nextInt();
        System.out.print("Enter the Second Number :");
        int b= input.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The Result of Swap is: ");
        System.out.println("First Number is: "+a+" The Second Number is: "+b);
    }
}
