package com.example.demo.config.datasource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DbConfig {
    @Autowired
    Environment env;

    @Primary
    @Bean(name = "dataSource")
    public DataSource lookupDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("database.config.driverClassName"));
        dataSource.setUrl(env.getProperty("database.config.url"));
        dataSource.setUsername(env.getProperty("database.config.username"));
        dataSource.setPassword(env.getProperty("database.config.password"));

        return dataSource;
    }
}
