public class ReverseArray {
    public static void reverse_array(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap elements at start and end of array
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4};

        reverse_array(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}
