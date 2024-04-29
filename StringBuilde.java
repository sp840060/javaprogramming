package Strings;
import java.lang.StringBuilder;  // Add this import statement

public class StringBuilde {  // Class name changed to avoid conflict
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);  // Appending characters directly is correct
        }
        System.out.println(sb.length());
    }
}
