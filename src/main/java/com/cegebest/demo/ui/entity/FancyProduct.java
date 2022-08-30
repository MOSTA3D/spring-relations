//package com.cegebest.demo.ui.entity;
//
//import javax.persistence.*;
//
//@Entity
//@PrimaryKeyJoinColumn(name = "id")
//public class FancyProduct extends Product{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String forMr;
//
//    public FancyProduct(String name, int price, String forMr) {
//        super(name, price);
//        this.forMr = forMr;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getForMr() {
//        return forMr;
//    }
//
//    public void setForMr(String forMr) {
//        this.forMr = forMr;
//    }
//}
