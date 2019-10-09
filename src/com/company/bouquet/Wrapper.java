package com.company.bouquet;

public class Wrapper {

    private String name;
    private int size;
    private int price;

    //constructor
    public Wrapper(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
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
        return name + ", size=" + size + ", price=" + price;
    }

}
