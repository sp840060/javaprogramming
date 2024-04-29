package Array.Recursion;

// Write a function of the last occurence of an elements in an arrays

public class Problem8 {
    public static int lastOccirence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccirence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
 }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccirence(arr, 5, 0));
        
    }
}
