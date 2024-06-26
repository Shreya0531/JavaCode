package shopping;

import java.util.ArrayList;

public interface Shop {
    public double totalBill(ArrayList<ItemsInCart> itemList);
    public void bill(ArrayList<ItemsInCart> itemList);
    public void addToCart(ArrayList<Product> productArrayList);
}

