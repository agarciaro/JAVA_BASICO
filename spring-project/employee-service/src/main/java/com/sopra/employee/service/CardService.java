package com.sopra.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.model.employee.Card;
import com.sopra.model.employee.Employee;
import com.sopra.repository.CardRepository;
import com.sopra.repository.EmployeeRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CardService implements ICardService {
	
	@Autowired
	private CardRepository cardRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Card insert(Card card) {
		return cardRepository.save(card);
	}

	@Override
	public Employee assignCard(Long idEmployee, Long idCard) {
		Employee e = employeeRepository.findById(idEmployee).get();
		e.setCard(cardRepository.findById(idCard).get());
		employeeRepository.save(e);
		return e;
	}
	
}
