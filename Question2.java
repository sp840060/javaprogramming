import java.util.Scanner;

public class Question2 {

    // In a Program input the side of a square. You have output the area of the square
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side*side;
        System.out.println(area);
        sc.close();
    }
}
