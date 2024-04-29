import java.util.Scanner;

public class VoterAgelimitionCheck {

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if(Age >= 18) {
            System.out.println("Allow for vote: " + Age);
        }
            else{
                System.out.println("Not for Vote, you are child :" + Age);
            }
        sc.close();   
    }
}