import java.util.*;
// // public class LgicalOperation {
// //     public static void main(String[] args) {
// //         int a =4;
// //         int b = 5;
// //         int c = a+b;
// //         System.out.println(c);
// //     }
// // }

// class logicalOperator{
//     public static int Add(int array[]) {
        
//     }
//     public static void main(String[] args) {
//         int array[] = { 20, 10}
//     }
// }
// class LgicalOperation{
//     public static void main(String args []){
//         int a = 5;
//         int b = 4;
//         int c = 0, s =0;
//         while(b != 0){
//         c = a & b;
//         s = a ^ b;
//         b= c <<1 ;
//         }
//         System.out.println(s);
//     }
// }
class LgicalOperation{
    public static int Add(int a, int b){
        while (b != 0) {

            int carry = a & b;

            a = a ^ b;

            b = carry << 1;
        }
        return a;
    }

public static void main(String args []){
    
        System.out.println(Add(15, 32));
    }
}