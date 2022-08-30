//package com.cegebest.demo.ui.repository;
//
//import com.cegebest.demo.ui.entity.Product;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
//
//    @Query("FROM Product pr WHERE pr.price BETWEEN :min AND :max")
//    public List<Product> getProductsBetween(@Param("min") int min, @Param("max") int max);
//}
