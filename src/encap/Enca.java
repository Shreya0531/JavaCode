package encap;

public class Enca {
    String model;

   private int price;
    String carChasis;

    public int getPrice(){
        return price;
    }
    public void setPrice(int newPrice){
        price=newPrice;
    }

    Enca() {
    }

    Enca(String model, int price, String carChasis) {
        this.model = model;
        this.price = price;
        this.carChasis = carChasis;
    }

    public void drive() {
        System.out.println("vroomm vroom");
    }

    public void display() {
        System.out.println(model);
        System.out.println(price);
        System.out.println(carChasis);
    }
}
