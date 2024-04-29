package Bit_Manipulation;

public class Operation_updateIthBit {
    public static int clear(int n, int i) {
        int bitMask= ~(1<<i);
        return n & bitMask;
    }
    
    public static int upDate(int n, int i, int NewBit) {
        n= clear(n, i);
        int bitMask = NewBit<< i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(upDate(10, 2, 1));
    }
}
