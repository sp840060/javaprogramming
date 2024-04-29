package Array.Recursion;

public class Problem7 {
     // Write a function to find the first occurence of an element in array
     public static int firstoccerance(int arr[], int key, int i) {
          if (i == arr.length) {
               return -1;
          }
          if (arr[i]== key) {
               return i;  
          }

          return firstoccerance(arr, key, i+1);    
     }
     public static void main(String[] args) {
          int arr [] ={8, 3, 6, 9, 5, 10, 2, 5, 3 };
          System.out.println(firstoccerance(arr, 5, 0));

     }
}
