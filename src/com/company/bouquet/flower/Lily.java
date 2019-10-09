package com.company.bouquet.flower;

public class Lily implements Flower{

    private String name;
    private int price;

    //constructor
    public Lily() {
        name = "Lily";
        price = 80;
    }

    //get method
    public String getName() {
        return name;
    }

    //set method
    public void setName(String name) {
        this.name = name;
    }

    //get method
    public int getPrice() {
        return price;
    }

    //set method
    public void setPrice(int price) {
        this.price = price;
    }

    //to string
    @Override
    public String toString() {
        return "Lily{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
