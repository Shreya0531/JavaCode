package constructors;

public class C1 {
   C1()
   {
       System.out.println("C1()");
       System.out.println(new C1(60));
   }
   C1(int a)
   {
       this();
       System.out.println("C1(int a)");
   }
    {
        System.out.println("IIB-1");
    }

    public static void main(String[] args) {
        System.out.println("Main begin");
        new C1(40);
    }
}
