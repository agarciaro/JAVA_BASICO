package com.sopra.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.model.employee.Card;
import com.sopra.repository.CardRepository;

@Service
public class CardService implements ICardService {
	
	@Autowired
	private CardRepository cardRepository;
	
	@Override
	public Card insert(Card card) {
		return cardRepository.save(card);
	}
	
}
