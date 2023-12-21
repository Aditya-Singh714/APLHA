import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        // Inplicit conversion

        // int a = 25;
        // long b = a;
        // System.out.println(b);

        // long a = 25;
        // int b = a;
        // System.out.println(b);

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextFloat();
        // float nums = sc.nextInt();


        // Explicit conversion
        float a = 25.25f;
        int b = (int)a;
        System.out.println(b);

        float marks = 99.99f;
        int num = (int) marks;
        System.out.println(num);


        char ch = 'a';
        char ch2 = 'A';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);


        // Type Promotion in Expression
        char a1 = 'a';
        char b2 = 'b';
        
        System.out.println((int)(b2) + (int)(a1));

        int i = 10;
        float f = 25.12f;
        long l = 35;
        double d = 42.56;

        double  ans = i+f+l+d;
        System.out.println(ans);

        byte num1 = 5;
        byte num2 = (byte)( num1 * 2);
        System.out.println(num2);
    }
}
