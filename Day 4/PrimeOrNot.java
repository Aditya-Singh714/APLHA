import java.util.Scanner;
import java.lang.Math;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = sc.nextInt();

        if (inputNumber == 2) {
            System.out.println(inputNumber + " is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
                if (inputNumber % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println(inputNumber + " is prime");
            } else {
                System.out.println(inputNumber + " is not prime");
            }
        }

    }
}
