public class ArithmeticOperator {
    public static void main(String[] args) {
        int A = 20;
        int B = 10;

        // Binary operator
        System.out.println("Addition = "+ (A+B));
        System.out.println("Difference = "+ (A-B));
        System.out.println("Product = "+ (A*B));
        System.out.println("Division = "+ (A/B));
        System.out.println("Modulo(remainder) = "+ (A%B));

        // Unary operator
        int a = 10;
        // int b = ++a;
        int b = --a;
        System.out.println(a);
        System.out.println(b);

        int c = 6;
        // int d = c++;
        int d = c--;
        System.out.println(c);
        System.out.println(d);
        
    }
}