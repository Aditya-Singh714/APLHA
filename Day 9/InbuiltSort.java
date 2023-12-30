import java.util.Arrays;

public class InbuiltSort {
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={5, 23, 10, -7, 9};
        Arrays.sort(arr);
        System.out.println("Sorted array is:");
        printArr(arr);

        int arr1[] = {5,4,1,3,2};
        Arrays.sort(arr1, 0, 3);
        printArr(arr1);
    }
}
