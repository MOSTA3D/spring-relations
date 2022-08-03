package com.cegebest.demo.ui.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Team {
	@Id
	@SequenceGenerator(
		name = "product_sequence",
		sequenceName = "product_sequence",
		allocationSize = 1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "product_sequence"
	)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private int count;
	

	@ManyToMany(mappedBy="teams")
	private List<Project> projects = new ArrayList<>();
	
	public void addProject(Project project) {
		projects.add(project);
	}
	
	
	
}
