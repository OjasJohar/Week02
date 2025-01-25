package com.Multilevel_Inheritance.OnlineRetailOrderManagement;

class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        setTrackingNumber(trackingNumber);
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("\nYour order is shipped successfully.");
        System.out.println("-----Order Details----");
        System.out.println("Order ID        :" + orderId);
        System.out.println("Order Date      :" + orderDate);
        System.out.println("Tracking Number :" + trackingNumber);
    }
}
