package com.sysfore.demo.educationSitedto;

import java.sql.Date;

import lombok.Data;
@Data
public class Revaluationdto {
	private int revaluationId;
	private String studentUsn;
	private int semId;
	private int examId;
	private boolean subject1;
	private boolean subject2;
	private boolean subject3;
	private boolean subject4;
private boolean subject5;
private boolean subject6;
private boolean isActive;
private boolean isDelete;
private int createdBy;
private String createdByName;
private Date createOn;
private  int updatedBy;
private String updatedByName;
private Date updateOn;


}
