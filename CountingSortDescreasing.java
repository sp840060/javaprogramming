package Shorting;

public class CountingSortDescreasing {
    public static void CountingSortB(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = largest; i >= 0; i--) { // Iterate in descending order
            while (count[i] > 0) { // Correct condition for sorting
                arr[j] = i; // Place the actual element, not the index
                j++;
                count[i]--;
            }
        }
    }

    public static void PrintA(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        CountingSortB(arr);
        PrintA(arr);
    }
}
