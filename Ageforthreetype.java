import java.util.Scanner;

public class Ageforthreetype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if (Age >= 18) {
            System.out.println("Allow for Vote");
        }
        else if (Age>=13 && Age<18) {
            System.out.println("You are TeenAger");
        }
        else{
            System.out.println("Learning Student");
        }
        sc.close();
    }
}
