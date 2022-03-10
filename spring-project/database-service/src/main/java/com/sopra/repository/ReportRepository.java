package com.sopra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sopra.model.employee.Employee;
import com.sopra.model.report.Report;

@Repository
public interface ReportRepository extends CrudRepository<Report, Long> {
	
	public List<Report> findByEmployee(Employee employee);
	
	@Query("SELECT r FROM Report r WHERE r.employee.id = :id")
	public List<Report> findByEmployeeId(@Param("id") Long id);
	
	@Query(value = "SELECT * from report where generated_by = :id", nativeQuery = true)
	public List<Report> findByEmployeeIdSql(@Param("id") Long id);
}
