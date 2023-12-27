import java.lang.Math;

public class Assignment {
    public static void calculateAvg(int a, int b, int c) {
        double avg = (a + b + c)/3;
        System.out.println("Average of the three numbers is: " + avg);
    }

    public static boolean isEven(int x) {
        if(x%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPalindrome(int n) {
        int reverse, rem, original;
        original=n;

        reverse=0;
        while(original>0){
            rem= original%10;
            reverse=(reverse*10)+rem;
            original/=10;
        }
        if(reverse==n)
            System.out.println(n+" is palindrome");
        else
        System.out.println(n+" is not palindrome");
    }

    public static void mathClass(int x, int y) {
        System.out.println("Maximum number is : " + Math.max(x, y));
        System.out.println("Minimum number is : " + Math.min(x, y));
        System.out.println("Sqaure root of " + x + " is " + Math.sqrt(x));
        System.out.println(x + " power of " + y + " is " + Math.pow(x, y));
        System.out.println("Absolute value of "+ y +" is " + Math.abs(-y));

    }

    public static int sumOfDigits(int num) {
        int digitSum = 0;
        while (num != 0) {
            digitSum += num % 10;
            num /= 10;
        }
        return digitSum;
    }
    
    public static void main(String[] args) {
        // Q1) Write a Java method to compute the average of three numbers..
        calculateAvg(50, 60, 70);

        System.out.println();

        // Q2) Write a method named isEven that accepts an int argument
        // and returns a boolean value indicating whether or not the number is even.
        System.out.print("Is 48 even? ");
        System.out.println(isEven(48));

        System.out.println();

        // Q3) Write a Java program to check if a number is a palindrome in Java
        System.out.print("Checking if 121 is a palindrome... ");
        checkPalindrome(121);
        
        System.out.println();


        // Q4) Math class
        mathClass(25, 4);
        System.out.println();


        // Q5) Write a Java method to compute the sum of the digits in an integer.
        System.out.println("The sum of the digits in 9876 is: " + sumOfDigits(9876));

    }
}
