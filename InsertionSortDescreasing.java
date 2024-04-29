package Shorting;

public class InsertionSortDescreasing {
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int Curr = arr[i];
            int prv=i-1;
            
            // finding out the correct position to insert
            while (prv >= 0 && arr[prv] < Curr) {
                prv--;
            }
            // Insertion
            arr[prv+1]= Curr;
        }
    }

    public static void PrintA(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr []= {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        InsertionSort(arr);
        PrintA(arr);
    }
}
