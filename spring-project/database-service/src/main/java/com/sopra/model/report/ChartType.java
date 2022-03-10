package com.sopra.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ChartType {
	@Id
	@SequenceGenerator(sequenceName = "SEQ_CHART_TYPE", initialValue = 1, allocationSize = 1, name = "chart_type-sequence-generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chart_type-sequence-generator")
	private Long id;
	@Column(length = 50, nullable = false)
	private String type;
}
