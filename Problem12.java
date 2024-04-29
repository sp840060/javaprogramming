package Array.Recursion;

public class Problem12 {
    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[26]; // Initialize a boolean array to keep track of characters
        StringBuilder newStr = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            int idx = currChar - 'a';
            if (!seen[idx]) {
                // If character is not seen before, add it to the new string
                newStr.append(currChar);
                seen[idx] = true;
            }
        }

        // Convert the list of characters back to a string
        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        String result = removeDuplicates(str);
        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + result);
    }
}
