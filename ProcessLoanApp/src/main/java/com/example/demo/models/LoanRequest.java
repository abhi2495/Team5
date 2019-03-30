package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_request")
public class LoanRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_id")
	private Long loanId;
	
	@Column(name = "userid")
	private Long userid;
	
	@Column(name = "pan_no")
	private String panNo;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "marital_status")
	private String maritalStatus;
	
	@Column(name = "employment_type")
	private String employmentType;
	
	@Column(name = "annual_income")
	private Long annaulIncome;
	
	@Column(name = "loan_amount")
	private Long loanAmount;
	
	@Column(name = "city")
	private String city;
	
	@Column(name="status")
	private String status;
	
	@Column(name="loan_duration")
	private String loanDuration;
	
	@Column(name="interest_rate")
	private Float interestRate;
	
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public Long getAnnaulIncome() {
		return annaulIncome;
	}
	public void setAnnaulIncome(Long annaulIncome) {
		this.annaulIncome = annaulIncome;
	}
	public Long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(String loanDuration) {
		this.loanDuration = loanDuration;
	}
	public Float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}
	
	

}
