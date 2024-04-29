public class Question1 {
    // If one operand is long or double, whole expression promoted to long, float or double respectively

    public static void main (String args []){
        int a= 10;
        float b = 20.56f;
        long d = 40;
        double c = 30;
        double ans = a+b+d+c;
        System.out.println(ans);
    }
}
