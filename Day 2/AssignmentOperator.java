public class AssignmentOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 30;
        int d = 40;
        int e = 60;

        System.out.println("a = " + (a += 10));
        System.out.println("b = " + (b -= 20));
        System.out.println("c = " + (c *= 2));
        System.out.println("d = " + (d /= 2));
        System.out.println("e = " + (e %= 10));
    }
}
