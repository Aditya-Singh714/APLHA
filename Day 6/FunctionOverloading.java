public class FunctionOverloading {
    // function to calc sum of 2 numbers
    public static int sum(int x, int y) {
        return  x + y;
    }

    // func to calc sum of 4 numbers
    public static int sum(int x, int y, int z, int a) {
        return x + y + z + a;
    }

    // function to calc to flaot sum
    public static float sumFloat(float x, float y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println("Sum is " + sum(12, 64));
        System.out.println("Sum is " + sum(12, 11, 2, 5));
        System.out.println("Flaot Sum is "+sumFloat(3.7f, 8.9f));
    }
}
