package Array.Recursion;

//Givena "2*n" board and tiles of size "2 * 1" cont the number of ways to tiles the given board the "2 * 1" tiles (A tiles can either be placed horizontally  and Vertically) 

public class Problem11 {

    public static int tilingProblem(int  n){
    // base case 
    if (n == 0 || n == 1) {
        return 1;
    }
        // Kaam
        // vertical

        int fmn1 =  tilingProblem(n - 1);

        // Horizontal

        int fmn2 = tilingProblem(n - 2);

        int toways = fmn1 + fmn2;
        return toways;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
    
}
