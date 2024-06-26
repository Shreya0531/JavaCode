package geeksforgeeks.school.strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Geeks For Geeks");
        for(int i=0; i<str1.length();i++) {
            char ch = str1.charAt(i);
            if (ch == ' ') {
                str1.deleteCharAt(i);
            }
        }
        System.out.println(str1);
    }
}
