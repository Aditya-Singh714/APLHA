public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // Brute force code O(n^2)
        /*for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                // primary diaogonal sum: left top se right bottom tk
                if (i == j) {
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1) {
                    // secondary diagonal: left bottom se right top tk
                    sum += matrix[i][j];
                }
            }
        }*/


        // Optimise code
        for(int i = 0; i < matrix.length; i++) {
            // primary diagonal: left-top to right bottom
            sum += matrix[i][i];

            // secondary diagonal: right-top to left-bottom
            if(i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-i-1]; 
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3 ,4},
                          {5, 6, 7 ,8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
                

        System.out.print("Diagonal sum is : ");  
        System.out.print(diagonalSum(matrix));
    }
}
