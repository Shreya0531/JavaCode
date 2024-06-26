package geeksforgeeks.school.strings;

// Given a string str, convert the first letter of each word in the string to uppercase.

public class UpperCaseConversion {
    public static void main(String[] args) {
        transform("i love programming");
    }
    public static void transform(String s) {

        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                System.out.println(word);
                word = ""; // Reset the word variable for the next word
            } else {
                word = word + ch;
            }
        }
        // Print the last word
        if (!word.isEmpty()) {
            System.out.println(word);
        }
    }
}
