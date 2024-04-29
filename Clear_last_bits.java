package Bit_Manipulation;

public class Clear_last_bits {
    public static int clearbit(int n, int i) {
        int bitMask= (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearbit(15, 2));
    }
}
