package com.sopra.employee.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.sopra.employee.config.RestConfiguration;
import com.sopra.model.employee.Employee;
import com.sopra.model.report.Report;
import com.sopra.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class EmployeeService implements IEmployeeService {
	
//	@Autowired
//	private FreelanceRepository freelanceRepository;
//	@Autowired
//	private InternalRepository internalRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate reportRestTemplate;
	
	
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
		Employee e = employeeRepository.findById(id).get();
//		reportsByEmployeeId(id);
		return e;
	}

	@Override
	public Employee update(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	private void reportsByEmployeeId(Long employeeId){
		final String REPORT_URI = "http://localhost:8081/api/" + "employees/{id}/reports";
		Map<String, Long> params = new HashMap<>();
		params.put("id", employeeId);
		Report[] reports = reportRestTemplate.getForObject(REPORT_URI, Report[].class, params);
		for (Report report : reports) {
			log.info("Report: {}", report);
		}
	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>) employeeRepository.findAll();
	}
	
}
