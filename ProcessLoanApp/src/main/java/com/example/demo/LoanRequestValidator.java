package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LoanRequestValidator {

    @Scheduled(fixedRate = 5000)
    public void validateLoanRequest() {
        
        //fetch all pending loan requests  and calculate Risk Profile of the 
    }
}
