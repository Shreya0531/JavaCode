package strings;

public class Ex1 {
    public static void main(String[] args) {
        String s1="  hello   ";
        System.out.println(s1+"how are you");        // without trim()
        System.out.println(s1.trim()+"how are you");
        int a=100;
        double d = 10.4;
        String str = String.valueOf(a);
        System.out.println(str +2);

        String str1 = String.valueOf(d);
        System.out.println(str1 + "ghjk");

    }
}
