package Shorting;

public class InsertionSort {
    public static void InsertionSortA(int arr []) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int previous = i-1;

            // finding out the correct position to insert
            while (previous >=0 && arr[previous] > curr) {
                arr[previous+1] =arr[previous];
                previous--;
            }
            
            //insertion 
            arr[previous+1] = curr;
        }
    }
    public static void printA(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {5, 4, 1, 3, 2};
        InsertionSortA(arr);
        printA(arr);
    }
}
