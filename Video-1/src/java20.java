//Program to classify based on age of the person

import java.util.Scanner;

public class java20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = input.nextInt();

        if (age > 60) {
            System.out.println("Senior Citizen");
        } else if (age < 60 && age>20) {
            System.out.println("Adult");
        } else if(age <20 && age>13){
            System.out.println("Teen");
        }
        else {
            System.out.println("Child");
        }
    }
}
