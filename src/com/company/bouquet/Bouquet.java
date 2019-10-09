package com.company.bouquet;

import com.company.bouquet.flower.Flower;

import java.util.Arrays;

public class Bouquet {

    private String name;
    private Flower[] flowers;
    private Wrapper wrapper;
    private int price;

    //constructor
    public Bouquet() {
        name = "bouquet";
        flowers = new Flower[0];
        wrapper = new Wrapper("tape", -1, 0);
        price = 0;
    }

    //get method
    public Wrapper getWrapper() {
        return wrapper;
    }

    //set wrapper
    public void setWrapper(String name, boolean premium) {
        int count = flowers.length;
        int k = premium ? 10 : 5;
        Wrapper wrapper = new Wrapper(name, count, count * k);
        this.wrapper = wrapper;
    }

    //get full price
    public int getPrice() {
        price += wrapper.getPrice();
        for (int i = 0; i < flowers.length; i++) {
            price += flowers[i].getPrice();
        }
        return price;
    }

    //set full price
    public void setPrice(int price) {
        this.price = price;
    }

    //add flower
    public void addFlower(Flower flower){
        flowers = Arrays.copyOf(flowers, flowers.length+1);
        flowers[flowers.length-1] = flower;
    }

    //print
    public void printInfo(){
        System.out.println("flowers:");
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
        System.out.println("wrapper:");
        System.out.println(wrapper);
        System.out.println("price:" + getPrice());
    }

}
