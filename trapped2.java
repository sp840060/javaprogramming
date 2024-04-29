package ArrayAssignment;

public class trapped2 {
    public static int findTotalWater(int[]arr, int n) {
        int lmax [] = new int[n];
        
        int max=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
            max= Math.max(max, arr[i]);
            lmax[i]= max;
            
        }
        int rmax []= new int [n];
        max=0;
        for (int i = n-1; i >=0; i--) {
            max=Math.max(max, arr[i]);
            rmax[i]=max;
        }
        
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int lb = lmax[i]; // step one
            int rb = rmax[i];// step two

            int min = Math.min(lb, rb); // step three
            int currentWater = min-arr[i];// step four
            totalWater = totalWater + currentWater;// adding to final answer
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int arr[]= {3, 0, 2, 0, 4};
        int n=arr.length;
        System.out.println(findTotalWater(arr, n));
    }
}