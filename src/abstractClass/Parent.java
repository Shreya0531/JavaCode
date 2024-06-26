package abstractClass;

public abstract class Parent {
    int age;
    String name;

    Parent(int age,String name )
    {
        this.age=age;
        this.name=name;
    }
    public abstract void message();

}
