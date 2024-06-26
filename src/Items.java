public class Items
{
    private int id;
    private String name;
    private double price;
    private int quantity;


    public Items (int itemID, String itemName, double itemPrice, int itemQuantity)
    {
        id = itemID;
        name = itemName;
        price = itemPrice;
        quantity = itemQuantity;

    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

}