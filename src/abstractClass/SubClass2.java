package abstractClass;

public class SubClass2 extends Parent{
    SubClass2(int age, String name) {
        super(age, name);
    }

    @Override
    public void message() {
        System.out.println("This is second subclass");
        System.out.println(age);
        System.out.println(name);
    }
}
