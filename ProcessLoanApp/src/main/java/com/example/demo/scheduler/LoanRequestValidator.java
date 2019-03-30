package com.example.demo.scheduler;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class LoanRequestValidator {
    
    @Autowired
    DataSource dataSource;
    
    private static final Log LOG = LogFactory.getLog(LoanRequestValidator.class);

    @Scheduled(fixedRate = 5000)
    public void validateLoanRequest() throws SQLException {
        
        //fetch all pending loan requests  and calculate Risk Profile of the 
        
        
        try (Connection connection = dataSource.getConnection()) {
            LOG.info("catalog:" + connection.getCatalog());
        }
        
    }
}
