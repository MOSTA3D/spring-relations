//package com.cegebest.demo.repositories;
//
//import com.cegebest.demo.ui.entity.FancyProduct;
//import com.cegebest.demo.ui.entity.Product;
//import com.cegebest.demo.ui.repository.ProductRepository;
//import org.assertj.core.util.Lists;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import java.util.List;
//
//@SpringBootTest
//public class ProductRepositoriesTests {
//
////    @InjectMocks
//    @Autowired
//    private ProductRepository productRepository;
//
//    @BeforeEach
//    public void setup(){
//        productRepository.deleteAll();
//        for(int i = 0; i < 5; i++){
//            System.out.println("this is loop number " + i);
//            productRepository.save(new Product("product name", (int)(Math.random() * 50)));
//        }
//    }
//
//    @Test
//    public void testReturningOnly2Records(){
//        Pageable pageable = PageRequest.of(1, 2);
////        Pageable anotherPageable = PageRequest.of()
//        List<Product> productsPageable = Lists.newArrayList(productRepository.findAll(pageable));
//        List<Product> productsAll = Lists.newArrayList(productRepository.findAll());
//
//        Assertions.assertEquals(productsPageable.size(), 2);
//        Assertions.assertEquals(productsAll.size(), 5);
//    }
//
//    @Test
//    public void testOrderOfProductsWithPrice(){
//        List<Product> productsAll = Lists.newArrayList(productRepository.findAll(Sort.by(Sort.Direction.DESC,"price")));
//        productsAll.forEach(product -> System.out.println("price is " + product.getPrice()));
//        Assertions.assertEquals(productsAll.get(0).getName(), "product name");
//    }
//
//    @Test
//    public void testJpql(){
//        List<Product> products = productRepository.getProductsBetween(20, 30);
//        products.forEach(e->System.out.println("the price of from 20 30 is : " + e.getPrice()));
//        System.out.println("length of lskdfjlk is " + products.size());
//    }
//
//    @Test
//    public void testInheritanceMapping(){
//        System.out.println(productRepository.save(new FancyProduct("luxury watch", 70234, "shekabolla")));
//    }
//}
