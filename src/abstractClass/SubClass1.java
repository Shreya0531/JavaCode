package abstractClass;

public class SubClass1 extends Parent{
    SubClass1(int age, String name) {
        super(age, name);
    }

    @Override
    public void message() {
        System.out.println("This is first subclass");
        System.out.println(age);
        System.out.println(name);
    }
}
