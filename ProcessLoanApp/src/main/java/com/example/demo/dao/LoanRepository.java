package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.LoanRequest;


public interface LoanRepository extends JpaRepository<LoanRequest, Long> {

}
