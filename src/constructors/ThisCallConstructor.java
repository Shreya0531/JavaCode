package constructors;

public class ThisCallConstructor {
    double price;
    String carBrand;
    int model;

    ThisCallConstructor()
    {
        System.out.println("no argument constructor called");
    }
    ThisCallConstructor(double price, String carBrand){
        System.out.println("2 argument constructor called");
    }

    ThisCallConstructor(int model){
        this(400.0,"Audi");
        System.out.println("1 argument constructor called");
    }
    public static void main(String[] args) {
        new ThisCallConstructor(2024);
        new ThisCallConstructor();
    }
}
