package geeksforgeeks.school.strings;

public class CheckForBinary {
    static boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBinary("101"));
        System.out.println(isBinary("3456"));
    }
}