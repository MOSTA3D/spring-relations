package com.cegebest.demo.ui.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cegebest.demo.ui.entity.Team;

@Repository
public interface TeamRepo extends JpaRepository<Team, Long>{
	
}
