package statics;

public class S3 {
    static int add(int a, int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(sub(20,10));

    }
}
