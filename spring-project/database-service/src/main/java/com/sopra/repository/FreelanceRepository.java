package com.sopra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sopra.model.employee.Freelance;

@Repository
public interface FreelanceRepository extends CrudRepository<Freelance, Long> {

}
