package Bit_Manipulation;

public class Assignment_Question4 {
    public static void main(String[] args) {
         // convert uppercase characterr to lowecase

         for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));
         }
    }
}
