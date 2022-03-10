package com.sopra.model.report;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

import com.sopra.model.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Report {
	@Id
	@SequenceGenerator(sequenceName = "SEQ_REPORT", name = "report-sequence-generator", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report-sequence-generator")
	private Long id;
	@Column(nullable = false, length = 255)
	private String title;
	@CreationTimestamp
	private Date generatedAt;
	
	@ManyToOne
	@JoinColumn(name = "generated_by")
	private Employee employee;
	
	@ManyToMany
	@JoinTable(
		name="REPORT_CHART_TYPE",
//		uniqueConstraints = {@UniqueConstraint(columnNames = {"report_id", "chart_type_id"})},
		joinColumns = @JoinColumn(name="report_id"),
		inverseJoinColumns = @JoinColumn(name="chart_type_id")
	)
	private Set<ChartType> chartTypes;
}
