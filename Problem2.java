package Array.Recursion;

public class Problem2 {
    public static void PrintInc(int n) {
        if(n == 1){
            System.out.print (n+ " ");
            return;
        }
        PrintInc((n-1));
        System.out.print(n+ " ");
        
    }
    
    //Print the number from n to 1 (Increasing order)
    public static void main(String[] args) {
        int n = 10;
        PrintInc(n);

    }
    
}
