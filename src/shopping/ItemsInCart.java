package shopping;

public class ItemsInCart {
        private String itemName;
        private Integer quantity;
        private Double itemPrice;

        ItemsInCart(String itemName, Integer quantity, Double itemPrice){
            this.itemName = itemName;
            this.quantity = quantity;
            this.itemPrice = itemPrice;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Double getItemPrice() {
            return itemPrice;
        }

        public void setItemPrice(Double itemPrice) {
            this.itemPrice = itemPrice;
        }

        @Override
        public String toString() {
            return "Product Name: " +itemName+ " ,Quantity: " +quantity+ ", Product Price: "+itemPrice;
        }
}
