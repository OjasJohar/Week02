package com.Multilevel_Inheritance.OnlineRetailOrderManagement;

class Order {

    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus() {
        System.out.println("\nYour order is placed successfully.");
        System.out.println("-----Order Details----");
        System.out.println("Order ID : " + orderId);
        System.out.println("Order Date : " + orderDate);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}