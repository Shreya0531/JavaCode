package abstractClass;

public class Driver1 {
    public static void main(String[] args)
    {
        SubClass1 sc1 = new SubClass1(12,"Banni");
        sc1.message();
        SubClass2 sc2 = new SubClass2(15,"Sweety");
        sc2.message();
    }
}
