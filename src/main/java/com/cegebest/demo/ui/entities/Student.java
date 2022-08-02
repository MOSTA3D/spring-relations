package com.cegebest.demo.ui.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

public class Student {
	@Id
	@SequenceGenerator(
		name = "subject_sequence",
		sequenceName = "subject_sequence",
		allocationSize = 1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "subject_sequence"
	)
	private Long id;
	

	@Column
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id", referencedColumnName = "id")
	private Subject subject;
}
