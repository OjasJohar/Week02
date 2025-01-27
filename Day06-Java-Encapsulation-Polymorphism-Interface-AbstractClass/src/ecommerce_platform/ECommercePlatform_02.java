package ecommerce_platform;

public class ECommercePlatform_02 {
    public static void main(String[] args) {
        Electronics product1=new Electronics(101,"Ear phone",200,2,5);
        product1.displayProductDetails();

        Clothing product2=new Clothing(102,"Pant",1000,3,10);
        product2.displayProductDetails();

        Groceries product3=new Groceries(103,"Rice",120,2,4);
        product3.displayProductDetails();
    }
}
