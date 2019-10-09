package com.company.dragon;

import java.util.Random;

public class Treasure {

    private String name;
    private int price;

    //constructor
    public Treasure() {
        name = "noName";
        price = 0;
    }

    //constructor
    public Treasure(int i){
        Random r = new Random();
        String[] mass = {"PC", "TV", "electric kettle", "electric stove",
                "fridge",  "game console", "laptop", "microwave", "oven",
                "smartphone"};
        name = mass[i%10] + " " + String.format ("%02d", i);
        price = r.nextInt(101) + 100;
    }

    //constructor
    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
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
        return "name='" + name + '\'' + ", price=" + price;
    }

}
