public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (arr[mid] == key) { // found
                return mid;
            }

            if (arr[mid] < key) { // left
                start = mid + 1;
            } else { // right
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 11;

        System.out.println("Index for key is : " + binarySearch(arr, key));
    }
}
