package com.Multilevel_Inheritance.OnlineRetailOrderManagement;

class DeliveredOrder extends ShippedOrder {
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        setDeliveryDate(deliveryDate);
    }

    protected String deliveryDate;

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("\nYour order is Delivered successfully.");
        System.out.println("-----Order Details----");
        System.out.println("Order ID        :" + orderId);
        System.out.println("Order Date      :" + orderDate);
        System.out.println("Tracking Number :" + trackingNumber);
        System.out.println("deliver date    :" + deliveryDate);
    }
}
