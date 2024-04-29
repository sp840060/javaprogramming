package Strings;

public class Comparestring {
    public static void main(String[] args) {
        String str1= "Sandeep";
        String str2 ="Sandeep";
        String str3= new String("Sandeep");
        // if (str1==str2) {
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }
        // if (str1==str3 ) {
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }
        if (str1.equals(str3)) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
        
    }
}
