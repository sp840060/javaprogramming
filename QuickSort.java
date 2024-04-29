package DivideAndConqure;

public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[], int si, int ei) {
        if (si>=ei) {
            return;
        }
        // last element
        int pidx = partation(arr, si, ei);
        quickSort(arr, si, pidx-1);// left
        quickSort(arr, pidx+1, ei);// right
    }
    public static int partation(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for else smaller than pivot

        for (int j=si; j<ei; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[i];
                arr[j]= arr[i];
                arr[i]  = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i]= temp;
        return i;
         
    }

    public static void main(String[] args){
        int arr[]= {6, 3, 9, 8, 5, -1};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
