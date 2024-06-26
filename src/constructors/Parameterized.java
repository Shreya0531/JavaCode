package constructors;

public class Parameterized {
    String name;
    int age;
    Parameterized(){}

    Parameterized(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Name: "+ name + "  and Age: " +age);
    }

    public static void main(String[] args) {
       new Parameterized();
       new Parameterized("Shreya",27);
    }
}
