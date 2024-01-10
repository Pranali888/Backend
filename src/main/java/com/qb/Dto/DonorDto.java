package com.qb.Dto;

import java.util.Date;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DonorDto {
	private String fname;
	private String lname;
	private long contact;
	private long alternate_Contact;
	private String email;
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
	private Date donationDate;
	private boolean consume;
	private boolean hiv;
	private String msg;
}
