package com.company;

import com.company.bouquet.Bouquet;
import com.company.bouquet.flower.Lily;
import com.company.bouquet.flower.Lotus;
import com.company.bouquet.flower.Rose;
import com.company.calendar.Calendar;
import com.company.dragon.Dragon;
import com.company.files.Directory;
import com.company.files.TextFile;
import com.company.payment.Payment;

import java.util.Random;
import java.util.Scanner;

public class Check {

    void func1(){
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

    void func2(){
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

    void func3(){
        Calendar calendar = new Calendar();
        calendar.printAll();
        Calendar.Data data = calendar.new Data(2020, 11, 7, false);
        calendar.setData(data);
        calendar.printData();
        calendar.setTime(12, 12, 12);
        calendar.printTime();
        System.out.println("holiday " + calendar.getData().isHoliday());
        System.out.println("weekend " + calendar.getData().isWeekend());
    }

    void func4(){
        Dragon dragon = new Dragon();
        dragon.loadTreasure();
        dragon.sortByPrice();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit){
            System.out.println("print '0' to exit");
            System.out.println("print '1' to printAll");
            System.out.println("print '2' to printMax");
            System.out.println("print '3' to printBySum");
            int k = scanner.nextInt();
            switch (k){
                case 0:
                    exit = true;
                    System.out.println("bye-bye");
                    break;
                case 1:
                    dragon.printAll();
                    break;
                case 2:
                    dragon.printExpensive();
                    break;
                case 3:
                    System.out.println("print sum");
                    k = scanner.nextInt();
                    dragon.printBySum(k);
                    break;
                default:
                    scanner.next();
            }
        }
        scanner.close();
    }

    void func5(){
        Bouquet bouquet = new Bouquet();
        addFlowers(bouquet, 3, 2, 2);
        bouquet.setWrapper("gold", true);
        bouquet.printInfo();
    }


    void addFlowers(Bouquet bouquet, int i1, int i2, int i3){
        addRose(bouquet, i1);
        addLily(bouquet, i2);
        addLotus(bouquet, i3);
    }

    void addRose(Bouquet bouquet, int i1){
        for (int i = 0; i < i1; i++) {
            bouquet.addFlower(new Rose());
        }
    }

    void addLily(Bouquet bouquet, int i1){
        for (int i = 0; i < i1; i++) {
            bouquet.addFlower(new Lily());
        }
    }

    void addLotus(Bouquet bouquet, int i1){
        for (int i = 0; i < i1; i++) {
            bouquet.addFlower(new Lotus());
        }
    }
}
