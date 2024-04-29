package Array.Recursion;

// Frind Pairing Problem
// Given n Friends each one remain Single or can be paired up with some other friend can be paired 
// only once. Find out the total number of ways in which friends number of ways in which friends can remain single all can be paired up.

public class Problem13 {
    public static int friendsPaired(int n) {
        if (n ==1 || n==2) {
            return n;
        }
        
        // // choice 
        // // Single 
        // int fmn1 = friendsPaired(n-1);

        // // Paired

        // int fnm2 = friendsPaired(n-2);
        // int pairways = fmn1 * fnm2;

        // // totalWays

        // int totalways = fmn1 + pairways;
        // return totalways;
        return friendsPaired(n-1) + (n-1)  *  friendsPaired(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPaired(3));
    }
}
