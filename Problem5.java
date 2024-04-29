package Array.Recursion;

public class Problem5 {
    // Print Nth fibonacci number

    public static int fabicNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fabicNumber(n-1);
        int fibnm2 = fabicNumber(n-2);
        int fibn = fibnm1 + fibnm2;        
        return fibn;
    }
     public static void main(String[] args) {
        int n = 10;
        System.out.println(fabicNumber(n));
     }
}
