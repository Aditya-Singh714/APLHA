import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
        // Print the largest of 2
        int a = 15;
        int b = 10;
        if (a > b) {
            System.out.println("The largest number is " + a);
        } else {
            System.out.println("The largest number is " + b);
        }

        System.out.println();

        // Print if a number is Odd or Even
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or odd : ");
        int c = sc.nextInt();
        if (c % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        System.out.println();

        // Income tax calculator
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        double tax;
        if (income < 500000) {
            tax = 0;
        } else if (income > 500000 && income < 1000000) {
            tax = income * 0.2;
        } else {
            tax = income * 0.3;
        }
        System.out.println("Your tax is : " + tax);

        System.out.println();

        // Print the largest of 3
        int d = 4, e = 6, f = 8;
        if (d > e && d > f) {
            System.out.println("The largest number is " + d);
        } else if (e > d && e > f) {
            System.out.println("The largest number is " + e);
        } else {
            System.out.println("The largest number is " + f);
        }

        System.out.println();

        // Check if a student is Pass or Fail
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("Student is " + result);
    }
}