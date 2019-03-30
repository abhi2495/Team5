package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.LoanRepository;
import com.example.demo.models.LoanRequest;

@RestController
public class LoanController {

	@Autowired
	private LoanRepository loanRepository;

	// Add New
	@PostMapping("/loans/add")
	public LoanRequest add(@RequestBody LoanRequest newLoan) {
		return loanRepository.save(newLoan);
	}
	
	@GetMapping("/loans/fetch")
	public List<LoanRequest> findAll() {
		return loanRepository.findAll();
	}

}
