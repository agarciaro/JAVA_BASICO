package com.sopra.model.error;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse implements Serializable{

	private static final long serialVersionUID = 6392634324869449999L;
	
	private Integer code;
	private String message;
	private String trace;
}
