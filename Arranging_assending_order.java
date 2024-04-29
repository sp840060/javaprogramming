package Inbuild_Sort;
import java.util.Arrays;

public class Arranging_assending_order {
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int previous = i-1;
            
            //finding out the correct position to insert
            while (previous >= 0 && arr[previous] > curr) {
                arr[previous+1]= arr[previous];
                previous--;
            }
            // insertion sort
            arr[previous+1]= curr;
        }
    }
    public static void printA(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 2, 3, 1};
        Arrays.sort(arr, 0, 3);
        printA(arr);
    }
}
