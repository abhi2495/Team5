package com.example.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="users")
public class UserAccountBO {
        
        @Column(name ="userid")
        private long ID;    

        @Column(name ="first_name")
        private String firstName;
    
        @Column(name ="last_name")
    private String lastName;
    
        @Column(name ="email")
        private String email;
        
        @Column(name ="mobile")
        private String mobile;
        
        @Column(name ="dob")
        private Date dob;       
        
                
        public long getID() {
                return ID;
        }

        public void setID(long iD) {
                ID = iD;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public Date getDob() {
                return dob;
        }

        public void setDob(Date dob) {
                this.dob = dob;
        }

        public String getMobile() {
                return mobile;
        }

        public void setMobile(String mobile) {
                this.mobile = mobile;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        
}

