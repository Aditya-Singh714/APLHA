public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for (int turn = 0; turn < n-1; turn++) {
            swapped = false;
            for(int j = 0; j < n-1-turn; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[i]
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false) {
                break;
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 4, 5};
        bubbleSort(arr);
        printArr(arr);
    }
}