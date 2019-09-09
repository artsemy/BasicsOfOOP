package com.company;

import com.company.files.Directory;
import com.company.files.TextFile;
import com.company.payment.Payment;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        func1();
        func2();
    }

    static void func1(){
        TextFile f1 = new TextFile();
        Directory d = new Directory("Novels");
        f1.create("novel1", d);
        System.out.println(f1.getName());
        System.out.println(f1.getDirectory());
        f1.rename("novel2");
        System.out.println(f1.getName());
        f1.printContent();
        f1.addContent("contentAdd");
        f1.printContent();
        f1.delete();
        System.out.println(f1.getName());
        System.out.println(f1.getDirectory());
        f1.printContent();
    }

    static void func2(){
        Random r = new Random();
        Payment payment = new Payment();
        Payment.Order order = payment.new Order();
        order.setId(1);
        order.setPrice(10);
        payment.addOrder(order);
        payment.print();
        System.out.println(payment.getFullPrice());
        for (int i = 0; i < 5; i++) {
            payment.addOrder(i+2, r.nextInt(101));
        }
        payment.print();
        System.out.println(payment.getFullPrice());
        payment.deleteOrder(4);
        payment.print();
        System.out.println(payment.getFullPrice());
    }

}
