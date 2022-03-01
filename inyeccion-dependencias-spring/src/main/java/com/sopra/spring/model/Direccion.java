package com.sopra.spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("direccion")
@Scope("prototype")
public class Direccion {
	
	private String calle = "mi calle";
	private String numero = "30A";
	
}
