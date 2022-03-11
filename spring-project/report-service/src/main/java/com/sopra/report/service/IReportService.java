package com.sopra.report.service;

import java.util.List;

import com.sopra.model.report.Report;

public interface IReportService {

	Report insert(Report report);

	List<Report> findByEmployeeId(Long id);

}
