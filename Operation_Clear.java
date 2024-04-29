package Bit_Manipulation;

public class Operation_Clear {
    public static int clear(int n, int i) {
        int bitMask= ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear(10, 1));
    }
}
