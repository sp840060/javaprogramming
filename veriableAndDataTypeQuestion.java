import java.util.Scanner;

public class veriableAndDataTypeQuestion {
    // In a programm input 3 number A, B and C. You have to output the average of three(3) number.
    // public static void main (String args []){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     int Average= (a+b+c)/3;
    //     System.out.println(Average);
    //     sc.close();
    // }
    // OR
}
class Sandeep{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input X:");
        int a =sc.nextInt();

        System.out.println("Input Y: ");
        int b = sc.nextInt();

        System.out.println("Input Z: ");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("The avg is :" + avg);
        sc.close();
    }
}
