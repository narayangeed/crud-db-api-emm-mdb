package com.ng.hrms.db.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ng.hrms.db.api.model.Employee;

@Repository
public interface ICRUDRepository extends MongoRepository<Employee, Integer>{

}
