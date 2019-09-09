package com.company.payment;

import java.util.Arrays;

public class Payment {

    private Order[] orders;
    private double fullPrice;

    public Payment() {
        orders = new Order[0];
        fullPrice = 0;
    }

    public Payment(Order[] orders, double fullPrice) {
        this.orders = orders;
        this.fullPrice = fullPrice;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public void addOrder(Order order){
        orders = Arrays.copyOf(orders, orders.length+1);
        orders[orders.length-1] = order;
        fullPrice += order.getPrice();
    }

    public void addOrder(int id, double price){
        Order order = new Order(price, id);
        addOrder(order);
    }

    public void deleteOrder(int id){
        Order[] res = Arrays.copyOf(orders, orders.length-1);
        int i = 0;
        for (Order o: orders){
            if(o.getId() != id){
                res[i++] = o;
            } else {
                System.out.println("deleted successfully");
                fullPrice -= o.getPrice();
            }
        }
        orders = res;
    }

    public void print(){
        for (Order o: orders) {
            System.out.println(o);
        }
    }

    public class Order {

        private double price;
        private int id;

        public Order() {
            price = 0;
            id = 0;
        }

        public Order(double price, int id) {
            this.price = price;
            this.id = id;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    ", price=" + price +
                    '}';
        }
    }
}
