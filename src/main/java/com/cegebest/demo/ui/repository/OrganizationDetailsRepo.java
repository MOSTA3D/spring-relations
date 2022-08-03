package com.cegebest.demo.ui.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cegebest.demo.ui.entity.OrganizationDetails;

@Repository
public interface OrganizationDetailsRepo extends JpaRepository<OrganizationDetails, Long>{

}
