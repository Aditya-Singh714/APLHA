public class Assignment {
    public static void main(String[] args) {
        // What will the output of the following outputs

        // Q1)
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);

        System.out.println();

        // Q2)
        int a = 200, b = 50, c = 100;
        if (a > b && b > c) {
        System.out.println("Hello");
        }
        if (c > b && c < a) {
        System.out.println("Java");
        }
        if ((b + 200) < x && (b + 150) < c) {
        System.out.println("Hello Java");
        }

        System.out.println();

        // Q3)
        int d, e, f;
        d = e = f = 2;
        d += e;
        e -= f;
        f /= (d + e);
        System.out.println(d + " " + e + " " + f);

        System.out.println();

        // Q4)
        int g = 9, h = 12;
        int a1 = 2, b1 = 4, c1 = 6;
        int exp = 4 / 3 * (g + 34) + 9 * (a1 + b1 * c1) + (3 + h * (2 + a1)) / (a1 + b1 * h);
        System.out.println(exp);

        System.out.println();

        // Q5)
        int x1 = 10, y1 = 5;
        int exp3 = (y1 * (x1 / y1 + x1 / y1));
        int exp4 = (y1 * x1 / y1 + y1 * x1 / y1);
        System.out.println(exp3);
        System.out.println(exp4);
    }
}
