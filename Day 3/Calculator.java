import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Calculator using switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Enter the operator ie (+ - % * /): ");
        char operators = scanner.next().charAt(0);

        switch (operators) {
            case '+': System.out.println("Sum is " + (num1+num2));    
                break;
            
            case '-': System.out.println("Diff is " + (num1-num2));    
                break;
                
            case '*': System.out.println("Product is " + (num1*num2));    
                break;
                
            case '/': System.out.println("Qoutient is " + (num1/num2));    
                break;
                
            case '%': System.out.println("Remainder is " + (num1%num2));    
                break;    
        
            default: System.err.println("You have entered wrong operator!");
                break;
        }
    }
}
