package ecommerce_platform;

public class Clothing extends Product implements Taxable{
    private final double discount;
    private final double tax;

    public Clothing(int productId, String name, double price, double tax, double discount) {
        super(productId, name, price);
        this.tax = tax;
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {

        return (getPrice()*discount)/100;
    }

    @Override
    public double calculateTax() {
        return (getPrice()*tax)/100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on cloths    :" + tax);
    }

    public double displayFinaPrice(){
        double finalPrice= getPrice() + calculateTax() - calculateDiscount();
        return finalPrice;
    }

    public void displayProductDetails(){
        System.out.println("\n-------Product details-------");
        System.out.println("Product name   : " + getName());
        System.out.println("Product ID     : " + getProductId());
        System.out.println("price          : " + getPrice()+" Rs");
        System.out.println("Tax perc.      : " + tax + "%");
        System.out.println("Tax Amount     : " + calculateTax());
        System.out.println("discount perc. : " + discount + "%");
        System.out.println("discount Amount: " + calculateDiscount());
        System.out.println("Final Price    : " + displayFinaPrice());
    }
}

