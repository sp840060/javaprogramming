import java.util.Scanner;

public class multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multi = a*b;
        System.out.println(multi);
        sc.close();
    }
}
