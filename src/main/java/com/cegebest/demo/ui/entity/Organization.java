package com.cegebest.demo.ui.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Organization {
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Org_details_id", referencedColumnName = "id")
	private OrganizationDetails orgDetials; 
}
