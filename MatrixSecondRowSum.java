package Array;

public class MatrixSecondRowSum{
    public static void main(String[] args) {
        int [][] array={{1, 4, 9},{11, 4, 3},{2, 2, 3}};
        int sum=0;

        for (int j = 0; j < array.length; j++) {
            sum+= array[1][j];
        }
        System.out.println("Sum is :"+ sum);
    }
}