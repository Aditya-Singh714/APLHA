import java.util.Scanner;
import java.lang.Math;

public class Function {
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static int calculateSum(int a,int b) {
        int sum = a+b;
        return sum;
    }

    public static void swapTwoNumbers(int x, int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping: "+ "x=" + x +" and "+ "y=" + y);
    }

    public static int calculateProduct(int x, int y) {
        int product = x*y;
        return product;
    }

    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x ; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomailCoeffcient(int n, int r){
        int nFact = factorial(n);
        int rFact = factorial(r);
        int n_rFact = factorial(n-r);
        int result = nFact / (rFact * n_rFact);
        return result;
    }

    public static boolean isPrime(int x) {
        if(x == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n){
        for(int i = 2; i<= n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHelloWorld();

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = calculateSum(num1, num2);
        System.out.println("The sum of " + num1 +" and "+ num2 + " is : "+result);

        System.out.println();

        swapTwoNumbers(num1, num2);
        int result2 = calculateProduct(num1, num2);
        System.out.println("The product of " + num1 +" and "+ num2 + " is : "+result2);

        System.out.println();

        int factResult = factorial(num2);
        System.out.println("Factorial of "+num2+" is : "+factResult);

        System.out.println();

        int binCoeffResult = binomailCoeffcient(num1, num2);
        System.out.println("Binomial Coefficient of "+num1+","+num2+" is : "+binCoeffResult);

        // System.out.println(isPrime(7));
        primeInRange(10);
    }
}