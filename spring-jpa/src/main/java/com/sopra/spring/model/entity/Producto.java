package com.sopra.spring.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class Producto {
	
	@Id
	@SequenceGenerator(sequenceName = "SEQ_PRODUCTO", initialValue = 1, allocationSize = 1, name = "producto-sequence-generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto-sequence-generator")
	private Integer codigo;
	@Column(nullable = false, length = 100)
	private String nombre;
	@Column(nullable = false, length = 17, scale = 2)
	private Double precio;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codigo_fabricante", nullable = false)
//	@JoinTable(
//		name = "producto_fabricante",
//		joinColumns = {@JoinColumn(name="producto_codigo")},
//		inverseJoinColumns = {@JoinColumn(name="fabricante_codigo", unique = true, nullable = false)}
//	)
	private Fabricante fabricante;
}
