package Shorting;

public class BubbleSortDescreasing {
    public static void Bubble_Sort(int arr[]) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1-i; j++){
                if (arr[j] < arr[i+j]) {
                    
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printA(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        Bubble_Sort(arr);
        printA(arr);
    }
    
}
