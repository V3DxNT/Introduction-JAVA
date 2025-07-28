//Program that calculates the grades based on the marks above 90 A,
// B is above 75,
// C is above 60,
// D is above 30,
// F is below 30.


import java.util.Scanner;
public class java19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int marks = input.nextInt();

        if (marks > 90) {
            System.out.println("Grade: A");
        } else if (marks > 75) {
            System.out.println("Grade: B");
        } else if (marks > 60) {
            System.out.println("Grade: C");
        } else if (marks > 30) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}

