package com.sopra.model.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Card {
	@Id
	@SequenceGenerator(name = "card-sequence-generator", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_CARD")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "card-sequence-generator")
	private Long id;
	@Column(length = 6)
	private String number;
}
