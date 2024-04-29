package Array;

public class DigonalSumEven {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if ( i==j) {
        //             sum += matrix[i][j];
        //         }
        //         else if (i+j == matrix.length -1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        for (int i = 0; i < matrix.length; i++) {
            // primary Digonal
            sum += matrix[i][i];
            //Secondary Digonal
            if (i!= matrix.length-1-i) 
            sum +=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]= {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
    }
}
