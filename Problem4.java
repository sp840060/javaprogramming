package Array.Recursion;

public class Problem4 {
    // Print sum of first n natural number

    public static int SumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = SumNatural(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(SumNatural(n));
    }
}
