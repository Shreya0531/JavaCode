package strings;

public class ToCharArray {
    public static void main(String[] args) {
        String s1 = "java";
        char[] ch = s1.toCharArray();
        System.out.println(ch.length);
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i]);

        }
    }
}
