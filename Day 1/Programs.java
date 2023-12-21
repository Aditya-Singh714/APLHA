import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
        // code to calculate sum of two numbers
        // int a = 10;
        // int b = 20;
        // int sum = a+b;
        // System.out.println(sum);

        // Taking input from user
        Scanner scanner = new Scanner(System.in);

        // String input = scanner.next();
        // System.out.println(input);

        String name  = scanner.nextLine();
        System.out.println("Name is: " +name);

        int age = scanner.nextInt();
        System.out.println("Age is: " +age);

        float price = scanner.nextFloat();
        System.out.println("Price is: " +price);


        // code to calculate sum by taking input from user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);

        // code to calculate product of two numbers
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int product = num3*num4;
        System.out.println("Product is: "+product);

        // code to calculate area of circle
        int rad = scanner.nextInt();
        double area = 3.14*rad*rad;
        System.out.println("Area is: "+area);
    }
}