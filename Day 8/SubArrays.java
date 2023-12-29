public class SubArrays {
    public static void sub_arrays(int arr[]) {
        int totalSubArrays = 0;
        int n = arr.length;
        for (int i=0;i<n;i++) {
            int start = i;
            for(int j = i; j< n; j++) {
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k] + " ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }   
        System.out.println("Total sub arrays : " + totalSubArrays);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        sub_arrays(arr);
    }
}
