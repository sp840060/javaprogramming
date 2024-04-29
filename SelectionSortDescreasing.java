package Shorting;

public class SelectionSortDescreasing {
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int Curr =i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[Curr] < arr[j]) {
                    Curr=j;
                }
            }
            int temp = arr[Curr];
            arr[Curr]= arr[i];
            arr[i]= temp;
        }
    }
    public static void PrintA(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        SelectionSort(arr);
        PrintA(arr);
    }
}
