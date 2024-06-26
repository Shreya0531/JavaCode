package constructors;
// Main
public class SuperCall {
    public static void main(String[] args) {
        new Car();
        new Car(1500);
    }
}

//Super class
class Vehicle {
    int type;

    Vehicle(){
        System.out.println("Called super class no argument constructor");
    }

    Vehicle(int type){
        this.type = type;
        System.out.println("Called 1 argument constructor of super class");
    }
}

//Sub class
class Car extends Vehicle {
    int price;
    String brand;
    Car(){
        super();
    }

    Car(int price)
    {
        super(1200);
    }
}
