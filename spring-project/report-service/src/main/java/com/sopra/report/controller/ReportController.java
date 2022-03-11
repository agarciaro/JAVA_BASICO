package com.sopra.report.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.model.report.Report;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
	
	private List<Report> reports = new ArrayList<>();
	
//	{
//		reports.add(new Report(1L, "report1"));
//		reports.add(new Report(2L, "report2"));
//	}
	
//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public List<Report> findAllReports(){
		return reports;
	}
	
}
