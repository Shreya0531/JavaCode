package geeksforgeeks.school.strings;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print(reverse("Shreya"));
    }

    static String reverse(String str){
        StringBuilder rev = new StringBuilder(str);
        return rev.reverse().toString();

        /*String name = " ";
        for (int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        } */
    }
}
