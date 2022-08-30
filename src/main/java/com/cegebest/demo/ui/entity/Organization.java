//package com.cegebest.demo.ui.entity;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table
//public class Organization {
//	@Id
//	@SequenceGenerator(
//		name = "product_sequence",
//		sequenceName = "product_sequence",
//		allocationSize = 1
//	)
//	@GeneratedValue(
//		strategy = GenerationType.SEQUENCE,
//		generator = "product_sequence"
//	)
//	private Long id;
//
//	@Column
//	private String name;
//
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "organization")
//	private OrganizationDetails orgDetails;
//
//	public Organization() {}
//
//	public Organization(String name) {
//		this.name = name;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public OrganizationDetails getOrgDetails() {
//		return orgDetails;
//	}
//
//	public void setOrgDetails(OrganizationDetails orgDetails) {
//		this.orgDetails = orgDetails;
//	}
//
//
//
//
//}
