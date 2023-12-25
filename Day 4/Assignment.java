import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        
        // Q1) How many times 'Hello' is printed? 
        for(int i=0; i<5; i++) { 
            System.out.println("Hello"); 
            i+=2; 
        }

        System.out.println();


        // Q2)  Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int evenSum = 0, oddSum = 0;
        int num = 123456;
        while (num > 0){
            int rem = num%10;
            if (rem % 2 == 0)
                evenSum += rem;
            else
                oddSum += rem;

            num/=10;    
        }
        System.out.print("Even Sum: " + evenSum);
        System.out.print("\nOdd Sum : " + oddSum);

        System.out.println();
            

        // Q3) Write a program to find the factorial of any number entered by the user. 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        long fact = 1;
        for (long i = 1; i <= n; ++i)
            fact *= i;

        System.out.printf("%d! = %d", n,fact);

        System.out.println();
        
        
        // Q4) Write a program to print the multiplication table of a number N, entered by the user.
        System.out.print("Enter a positive integer: ");
        int m = scanner.nextInt();
        System.out.println("Multiplication Table of "+m+"\n-------------------------");
        for (int j = 1; j <= 10 ; ++j){
            System.out.println(m+ " x " + j +" = "+ m*j );
        }
        
        System.out.println();


        // Q5) What is wrong in the following program?
        for(int i = 0; i <= 5; i++ ) { 
            System.out.println("i = " + i ); 
        }
        
        System.out.println("i after the loop = " + i );
    }
}
