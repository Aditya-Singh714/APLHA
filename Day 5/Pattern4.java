public class Pattern4 {
    public static void main(String[] args) {
        // print CHARACTER pattern
        int n = 6;
        char ch = 'A';

        for(int row = 1; row <=n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
