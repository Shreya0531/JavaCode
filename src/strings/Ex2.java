package strings;

public class Ex2 {
    public static void main(String[] args) {
        String s1 = "java is a programming language";
        int lengthWith_a = s1.length();
        int lengthWithout_a = s1.replace("a","").length();
        int total_a=lengthWith_a-lengthWithout_a;
        System.out.println(total_a);
    }
}
