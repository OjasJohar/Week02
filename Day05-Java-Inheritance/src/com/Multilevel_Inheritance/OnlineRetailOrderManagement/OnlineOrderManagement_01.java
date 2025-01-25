package com.Multilevel_Inheritance.OnlineRetailOrderManagement;

public class OnlineOrderManagement_01 {
    public static void main(String[] args) {
        int orderId=132;
        String orderDate="12 june";
        Order order = new Order(132, "12 june");
        order.getOrderStatus();

        ShippedOrder shippedOrder=new ShippedOrder(orderId, orderDate, "1234543");
        shippedOrder.getOrderStatus();

        DeliveredOrder deliveredOrder=new DeliveredOrder(orderId, orderDate, "1234543", "27 june");
        deliveredOrder.getOrderStatus();
    }
}

