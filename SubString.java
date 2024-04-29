package Strings;

public class SubString {
    public static String subStringA(String str, int si, int ei){
        String substr= "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //Substing
        String str= "HelloWorld";
        System.out.println(str.substring(0, 4));
        System.out.println(subStringA(str, 0, 4));// same line
    }
}
