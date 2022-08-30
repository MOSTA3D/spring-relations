package com.cegebest.demo.ui.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Data
@ToString
public class E1 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    @OneToOne(mappedBy = "e1", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private E2 e2;
}
