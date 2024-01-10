package com.qb.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="donors")
public class Donor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private long contact;
	private long alternate_Contact;
	private String email;
	@DateTimeFormat(pattern = "MM.dd.yyyy hh:mm:ss")
	private Date dob;
	private String gender;
	private int weight;
	private String currentAddress;
	private String permenentAddress;
	private String permenentState;
	private String permenentCity;
	private long permenentPincode;
	private String currentState;
	private String currentCity;
	private long currentPincode;
	private String bloodGrp;
	
	@DateTimeFormat(pattern = "MM.dd.yyyy hh:mm:ss")
	private Date donationDate;
	private boolean consume;
	private boolean hiv;
	private String msg;
	
}
