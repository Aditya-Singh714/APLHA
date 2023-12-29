public class LinearSearch {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 20, 18 };
        int key = 15;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                System.out.println("Number " + key + " is at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found");
        }
    }
}
