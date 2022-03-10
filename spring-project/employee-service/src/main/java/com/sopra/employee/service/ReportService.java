package com.sopra.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.model.employee.Employee;
import com.sopra.model.report.Report;
import com.sopra.repository.EmployeeRepository;
import com.sopra.repository.ReportRepository;

@Service
public class ReportService implements IReportService {
	
	@Autowired
	private ReportRepository reportRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Report insert(Report report) {
		return reportRepository.save(report);
	}
	
	@Override
	public List<Report> findByEmployeeId(Long id) {
//		Employee e = employeeRepository.findById(id).get();
//		return reportRepository.findByEmployee(e);
		
//		return reportRepository.findByEmployeeId(id);
		
		return reportRepository.findByEmployeeIdSql(id);
	}

	
}
