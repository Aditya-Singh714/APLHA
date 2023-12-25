import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        while (counter < 20) {
            System.out.println("Hello Java");
            counter++;
        }
        System.out.println("Printed Hello Java 20 times");

        System.out.println();

        // Print numbers from 1 to 10
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }

        System.out.println();

        // Print numbers from 1 to n
        System.out.print("Enter a number: ");
        int range = sc.nextInt();
        num = 1;
        while (num <= range) {
            System.out.print(num + " ");
            num++;
        }

        System.out.println();

        // Sum of first n natural numbers
        System.out.print("Enter the value of n: ");
        int sum_n = sc.nextInt();
        int sum = 0;
        num = 1;

        while (num <= sum_n) {
            sum += num;
            num++;
        }
        System.out.println("Sum is " + sum);

        System.out.println();

        // print reverse of a number
        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;
        }
        System.out.println();

        // Reverse the given number
        System.out.print("Enter an integer: ");
        int reversedNum = sc.nextInt();
        int rev = 0, remainder;
        while (reversedNum != 0) {
            remainder = reversedNum % 10;
            rev = rev * 10 + remainder;
            reversedNum /= 10;
        }
        System.out.println("Reversed Number :" + rev);

        System.out.println();
    }
}