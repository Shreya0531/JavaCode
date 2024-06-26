package statics;

public class S2 {
    static void test()
    {
        System.out.println("test()");
    }

    public static void main(String[] args) {
        test();
        S2.test();
        System.out.println(S3.add(20,40));
    }
}
