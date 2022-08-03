package com.cegebest.demo.ui.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cegebest.demo.ui.entity.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, Long>{
	
}
