//package com.cegebest.demo.ui.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table
//@Inheritance(strategy = InheritanceType.JOINED)
//public class Product {
//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    private int price;
//
//    public Product(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//    public Product(){}
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//}
