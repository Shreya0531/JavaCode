package shopping;

public class Product {
    //states
    private String productName;
    private double productPrice;


    //Constructor
    //no Args
    Product(){}

    //Args
    Product(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    //override to return values
    @Override
    public String toString() {
        return "Product Name: "+productName+ ", Product Price: "+productPrice;
    }
}
