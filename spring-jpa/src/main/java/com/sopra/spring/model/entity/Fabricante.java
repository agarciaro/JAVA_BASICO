package com.sopra.spring.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Fabricante {
	
	@Id
	@SequenceGenerator(sequenceName = "SEQ_FABRICANTE", initialValue = 1, allocationSize = 1, name = "fabricante-sequence-generator")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fabricante-sequence-generator")
	private Integer codigo;
	@Column(nullable = false, length = 100)
	private String nombre;
	
	@OneToMany(mappedBy = "fabricante")
	private List<Producto> productos;
	
}
