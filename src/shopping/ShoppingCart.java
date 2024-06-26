package shopping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ShoppingCart implements Shop {

    double total=0;

    public static void main(String[] args) {
        ArrayList<Product> productArrayList = new ArrayList<>();

        //Products to purchase
        productArrayList.add(new Product("Apple", 100));
        productArrayList.add(new Product("Newspaper", 10));
        productArrayList.add(new Product("Milk", 25));

        //display products
        //productArrayList.forEach(System.out::println);
        ShoppingCart shoppingCartObject = new ShoppingCart();

        shoppingCartObject.addToCart(productArrayList);


    }
    public void addToCart(ArrayList<Product> productArrayList) {
        //to show the items and its price
        productArrayList.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        Scanner inputFromUser = new Scanner(System.in);

        Iterator<Product> productIterator = productArrayList.iterator();

        ArrayList<ItemsInCart> itemList = new ArrayList<>();
        while (productIterator.hasNext()) {
            Product iterators = productIterator.next();
            System.out.println(iterators);
            System.out.printf("Enter Quantity for %s\n", iterators);
            System.out.print("Enter here: ");
            Integer quantity = inputFromUser.nextInt();
            Double price = iterators.getProductPrice();
            String productName = iterators.getProductName();
            itemList.add(new ItemsInCart(productName, quantity, price));
        }
        bill(itemList);
    }

    public void bill(ArrayList<ItemsInCart> itemList){

        Scanner inputPaymentMethod = new Scanner(System.in);

        System.out.println("\nItem selected are:");
        System.out.println("--------------------------------------------------------");
        itemList.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        Iterator<ItemsInCart> billIterator = itemList.iterator();
        System.out.println("Payment");
        System.out.println("Cash (press 1): ");
        System.out.println("e-Wallet (press 2): ");
        int optionInput = inputPaymentMethod.nextInt();

        switch(optionInput){
            case 1: totalBill(itemList);
                while (billIterator.hasNext()){
                    ItemsInCart itemsInCart = billIterator.next();
                    if(itemsInCart.getItemName().equalsIgnoreCase("Milk")){
                        if(itemsInCart.getQuantity()>=2){
                            System.out.println("--------------------------------------------------------");
                            System.out.println("Extra free milk");
                            System.out.printf("Total payable amount: %s",total);
                        }
                        else {
                            System.out.println("--------------------------------------------------------");
                            System.out.printf("Total payable amount: %s",total);
                        }
                    }

                }
                break;
            case 2 : totalBill(itemList);
                while (billIterator.hasNext()){
                    ItemsInCart itemsInCart = billIterator.next();
                    double discount = total * 5 / 100;
                    if(itemsInCart.getItemName().equalsIgnoreCase("Milk")){
                        if (itemsInCart.getQuantity() >= 2) {
                            System.out.println("--------------------------------------------------------");
                            System.out.println("Extra free milk");
                            System.out.printf("Received discount for using e-Wallet of Rs %s\n", discount);
                            System.out.printf("Total payable amount: %s",total-discount);
                        }
                        else {
                            System.out.println("--------------------------------------------------------");
                            System.out.printf("Received discount for using e-Wallet of Rs %s\n", discount);
                            System.out.printf("Total payable amount: %s",total-discount);
                        }
                    }
                }
                break;
        }

    }

    public double totalBill(ArrayList<ItemsInCart> itemList){
        double totalPerItem = 0;
        Iterator<ItemsInCart> itemsInCartIterator = itemList.iterator();
        System.out.println("Name\t\tQuantity\t\tPrice\t\tSum Total");
        System.out.println("--------------------------------------------------------");
        while (itemsInCartIterator.hasNext()){
            ItemsInCart itemsInCart = itemsInCartIterator.next();
            totalPerItem= itemsInCart.getItemPrice() * itemsInCart.getQuantity();

            System.out.println(
                    itemsInCart.getItemName()+"\t\t"+
                            itemsInCart.getQuantity()+"\t\t\t"+
                            itemsInCart.getItemPrice()+"\t\t\t"+
                            totalPerItem);
            total += totalPerItem;
            System.out.println("--------------------------------------------------------");

        }

        return total;

    }

}


