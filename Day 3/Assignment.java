import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // Q1) Write a Java program to get a number from the user and print whether it
        // is
        // positive or negative.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The entered number is positive.");
        } else if (num < 0) {
            System.out.println("The entered number is negative.");
        } else {
            System.out.println("The entered number is zero.");
        }

        System.out.println();

        // Q2) You have a fever if your temperature is above 100 and otherwise prints
        // You don't have a fever.
        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();

        if (temp >= 100) {
            System.out.println("You have fever");
        } else {
            System.out.println("No Fever");
        }

        System.out.println();

        // Q3) Write a Java program to input week number(1-7) and print day of week name
        // using switch case
        System.out.print("Enter Week Number: ");
        int wkNum = sc.nextInt();
        switch (wkNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");

        }

        System.out.println();

        // Q4) What will be the value of x & y in the following
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;

        System.out.println(x + " " + y);

        System.out.println();


        // Q5)  Write a Java program that takes a year from the user and print whether that 
        // year is a leap year or not.
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==
        0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
