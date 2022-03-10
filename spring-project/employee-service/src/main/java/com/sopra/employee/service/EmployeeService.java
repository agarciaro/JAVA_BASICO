package com.sopra.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.model.employee.Employee;
import com.sopra.model.employee.Freelance;
import com.sopra.model.employee.Internal;
import com.sopra.repository.EmployeeRepository;
import com.sopra.repository.FreelanceRepository;
import com.sopra.repository.InternalRepository;

@Service
@Transactional
public class EmployeeService implements IEmployeeService {
	
//	@Autowired
//	private FreelanceRepository freelanceRepository;
//	@Autowired
//	private InternalRepository internalRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee insert(Employee employee) {
//		if(employee instanceof Freelance) {
//			return freelanceRepository.save((Freelance)employee);
//		}else if(employee instanceof Internal){
//			return internalRepository.save((Internal)employee);
//		}
//		throw new RuntimeException("Cannot insert Employee: Not valid Type");
		return employeeRepository.save(employee);
	}

	@Transactional(readOnly = true)
	@Override
	public Employee findById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee update(Employee employee) {
		return employeeRepository.save(employee);
	}
	
}
