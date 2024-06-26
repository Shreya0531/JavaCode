package abstractClass;

abstract public class Vehicle {
    int no_of_seats;

    abstract void start();
   final void gears(){
        System.out.println("5 gears");
    }

    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.start();
    }
}

class Car extends Vehicle{
    void start(){
        System.out.println("starts with key");
    }
}
