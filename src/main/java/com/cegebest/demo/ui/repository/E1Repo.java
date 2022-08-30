package com.cegebest.demo.ui.repository;

import com.cegebest.demo.ui.entity.E1;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Repository
public interface E1Repo extends JpaRepository<E1, Long> {

}
