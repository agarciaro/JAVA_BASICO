package com.sopra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sopra.model.employee.Internal;

@Repository
public interface InternalRepository extends CrudRepository<Internal, Long> {

}
