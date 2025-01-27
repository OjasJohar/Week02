package online_food_delivery_system;

public class NonVegItem extends FoodItem implements Discountable{
    private final double discount;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        discount=2;
    }

    @Override
    public double applyDiscount() {
        return (getPrice()*discount)/100;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount % for non veg food :" + discount + "%");
    }

    @Override
    void calculateTotalPrice() {
        System.out.println("Total Price  :" +(getPrice()-applyDiscount())*getQuantity());
    }
}

