package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.LoanRequest;

@Repository
public interface LoanRequestRepository extends CrudRepository<LoanRequest, Long>{

}
