package online_food_delivery_system;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price=price;
        }else{
            this.price=0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0) {
            this.quantity = quantity;
        }else{
            this.quantity=0;
        }
    }

    abstract void calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("\n-----Food Item Details-----");
        System.out.println("Item name  :"+ getItemName());
        System.out.println("Price      :"+ getPrice());
        System.out.println("Quantity   :"+ getQuantity());
    }
}


