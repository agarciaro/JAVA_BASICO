package com.sopra.report.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.model.report.Report;
import com.sopra.report.service.IReportService;

@RestController
@RequestMapping("/api")
public class ReportRestController {
	
	@Autowired
	private IReportService reportService;
	
	@GetMapping("/reports")
	public List<Report> findAllReports(){
		return null;
	}
	
	@GetMapping("/employees/{id}/reports")
	public List<Report> findByEmployee(@PathVariable(name = "id") Long employeeId){
		return reportService.findByEmployeeId(employeeId);
	}
	
	@PostMapping("/reports")
	public Report insertReport(@Valid @RequestBody Report report) {
		return reportService.insert(report); 
	}
		
}
