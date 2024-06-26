package practice;

public class Swap {
    public static void main(String[] args) {
       usingTemp();
        System.out.println("-----------------");
        withoutTemp();

    }

    public static void usingTemp(){
        int a = 10;
        int b= 20;
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void withoutTemp(){
        int a=30;
        int b=10;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);

    }
}
