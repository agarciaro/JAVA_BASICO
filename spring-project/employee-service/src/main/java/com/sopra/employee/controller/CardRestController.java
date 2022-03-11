package com.sopra.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.employee.service.ICardService;
import com.sopra.employee.service.IEmployeeService;
import com.sopra.model.employee.Card;
import com.sopra.model.employee.Employee;
import com.sopra.model.employee.Freelance;
import com.sopra.model.employee.Internal;

@RestController
@RequestMapping("/api")
public class CardRestController {
	
	@Autowired
	private ICardService cardService;
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/cards")
	public List<Card> findAllCards(){
		return null;
	}
	
	@PostMapping("/cards")
	public Card insertCard(@Valid @RequestBody Card card) {
		return (Card) cardService.insert(card); 
	}
	
	@PutMapping("/employees/{idEmp}/cards/{idCrd}")
	public Employee assignCard(@PathVariable(name = "idEmp") Long idEmployee, @PathVariable(name = "idCrd") Long idCard) {
		return cardService.assignCard(idEmployee, idCard);
	}
	
}
