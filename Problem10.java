package Array.Recursion;

// Print x^n in O(logn)

public class Problem10 {
    public static int optmizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int halfpower = optmizedPower(x, n/2) * optmizedPower(x, n/2); time complexity O(n)
        int halfpower = optmizedPower(x, n/2);  // O(logn)
        int halfpowersq = halfpower * halfpower;
        // n is odd

        if (n % 2 != 0) {
            halfpower = x * halfpowersq;
        }
        return halfpower;
    }
    public static void main(String[] args) {
        System.out.println(optmizedPower(3, 3));
    }
    
}
