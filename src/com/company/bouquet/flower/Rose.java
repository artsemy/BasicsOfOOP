package com.company.bouquet.flower;

public class Rose implements Flower {

    private String name;
    private int price;

    //constructor
    public Rose() {
        name = "Rose";
        price = 100;
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
        return "Rose{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
