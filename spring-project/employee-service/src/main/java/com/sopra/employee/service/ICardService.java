package com.sopra.employee.service;

import com.sopra.model.employee.Card;
import com.sopra.model.employee.Employee;

public interface ICardService {

	Card insert(Card card);
	Employee assignCard(Long idEmployee, Long idCard);

}