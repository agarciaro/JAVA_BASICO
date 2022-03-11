package com.sopra.model.employee;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sopra.model.report.Report;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorColumn(name="employee_type", 
discriminatorType = DiscriminatorType.STRING)
public class Employee {
	@Id
	@SequenceGenerator(sequenceName = "SEQ_EMPLOYEE", initialValue = 1, allocationSize = 1, name = "employee-sequence-generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee-sequence-generator")
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String name;
	@Column(nullable = false, length = 75)
	private String lastName;
	@Column(nullable = false, length = 75, unique = true)
	@Email
	private String email;
	@Past
	private Date birthdate;
	
	@OneToOne
	@JoinColumn(name = "card_id", nullable = true, unique = true)
	private Card card;
	
	@OneToMany(mappedBy = "employee")
	@JsonIgnore
	private List<Report> reports;
}

