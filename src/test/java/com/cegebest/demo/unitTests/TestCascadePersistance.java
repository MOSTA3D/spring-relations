package com.cegebest.demo.unitTests;

import com.cegebest.demo.ui.entity.E1;
import com.cegebest.demo.ui.entity.E2;
import com.cegebest.demo.ui.repository.E1Repo;
import com.cegebest.demo.ui.repository.E2Repo;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class TestCascadePersistance {

    @Autowired
    private E1Repo e1Repo;

    @Autowired
    private E2Repo e2Repo;

//    @Transactional
    public void deleteE2(){
//        e1Repo.findById(1L).get().setE2(null);
        System.out.println("********separator**********");
        e2Repo.deleteAll();
        System.out.println("********separator**********");
    }

    @BeforeEach
    public void setup(){
        E1 e1 = new E1();
        e1.setName("sheka");

        E2 e2 = new E2();
        e2.setName("beka");

        e2.setE1(e1);
        e1.setE2(e2);

        e1Repo.save(e1);
    }

    @Test
//    @Transactional
    public void testE2TableHaveZeroRows(){
        // deleting e2 rows
        this.deleteE2();
        List<E2> e2List = e2Repo.findAll();

        List<E1> e1List = e1Repo.findAll();

        // fails, expected = 1 ??!

        System.out.println("the number of e2 rows is " + e2List.size());
        System.out.println("the number of e1 rows is " + e1List.size());
        Assertions.assertEquals(e2List.size(), 0);
    }
}
