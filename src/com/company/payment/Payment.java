package com.company.payment;

import java.util.Arrays;

public class Payment {

    private Order[] orders;
    private double fullPrice;

    //constructor
    public Payment() {
        orders = new Order[0];
        fullPrice = 0;
    }

    //get method
    public double getFullPrice() {
        return fullPrice;
    }

    //set method
    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    //add order
    public void addOrder(Order order){
        orders = Arrays.copyOf(orders, orders.length+1);
        orders[orders.length-1] = order;
        fullPrice += order.getPrice();
    }

    //add order
    public void addOrder(int id, double price){
        Order order = new Order(price, id);
        addOrder(order);
    }

    //delete order
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

    //print all orders in payment
    public void print(){
        for (Order o: orders) {
            System.out.println(o);
        }
    }

    //inner class
    public class Order {

        private double price;
        private int id;

        //constructor
        public Order() {
            price = 0;
            id = 0;
        }

        //constructor
        public Order(double price, int id) {
            this.price = price;
            this.id = id;
        }

        //get method
        public double getPrice() {
            return price;
        }

        //set method
        public void setPrice(double price) {
            this.price = price;
        }

        //get method
        public int getId() {
            return id;
        }

        //set method
        public void setId(int id) {
            this.id = id;
        }

        //to string
        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    ", price=" + price +
                    '}';
        }
    }

}
