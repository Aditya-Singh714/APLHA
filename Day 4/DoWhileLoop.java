import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        do {
            System.err.println("Hello Java");
            counter++;
        } while (counter <= 100);

        System.out.println();

        // enter the number until user enter multiple of 10
        do{
            System.out.print("Enter a number: ");
            int inputNumber = sc.nextInt();
            if(inputNumber % 10 == 0){
                break;
            }
            System.out.println(inputNumber);
        }while(true);

        System.out.println();

        // Display all numbers except multiples of 10
        do {
            System.out.print("Enter a number: ");
            int inputNumber = sc.nextInt();
            if(inputNumber % 10 == 0){
                continue;
            }
            System.out.println(inputNumber);
        } while (true);

    }
}
