package constructors;

public class Overloading {
    String name;
    int age;
    double salary;

    Overloading(){}

    Overloading(String name){
        this.name = name;
    }

    Overloading(String name, int age){
        this.name = name;
        this.age = age;
    }

    Overloading(int age, String name){
        this.name = name;
        this.age = age;
    }

    Overloading(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this. salary = salary;
    }

    public static void main(String[] args) {
        new Overloading();
        new Overloading("Shreya",27);
        new Overloading(27,"Shreya");
        new Overloading("Shreya", 27, 3000);
    }
}
