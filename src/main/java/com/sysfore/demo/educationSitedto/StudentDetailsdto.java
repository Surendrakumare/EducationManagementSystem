package com.sysfore.demo.educationSitedto;

import java.sql.Date;

import lombok.Data;

@Data
public class StudentDetailsdto {

	private String studentUSN;
	private String name;
	private String email;
	private String phoneNo;
	private Date dob;
	private String dept;
	private String section;
	private int joiningYear;
	private String fatherName;
	private String motherName;
	private String fatherPhoneNo;
	private String bloodGroup;
	private String address;
	private byte[] photo;
	private byte[] marksCard10th;
	private byte[] marksCard12th;
	private Boolean isActive;
	private Boolean isDelete;
	private int createdBy;
	private String CreatedByName;
	private Date CreatedOn;
	private int updatedBy;
	private String updatedByName;
	private Date updatedOn;
	
}
