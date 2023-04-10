package com.sysfore.demo.educationSitedto;

import java.sql.Date;

import lombok.Data;

@Data
public class examRegistrationdto {

	private int examId;
	private String studentUSN;
	private int semId;
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	private int subject5;
	private int subject6;
	private String percentage;
	private Boolean isActive;
	private Boolean isDelete;
	private int createdBy;
	private String CreatedByName;
	private Date CreatedOn;
	private int updatedBy;
	private String updatedByName;
	private Date updatedOn;
}
