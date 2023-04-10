package com.sysfore.demo.educationSitedto;

import java.sql.Date;

import lombok.Data;

@Data
public class Professordto {

	private String profId;
	private String profName;
	private String profDept;
	private String phoneNo;
	private String email;
	private Boolean isActive;
	private Boolean isDelete;
	private int createdBy;
	private String CreatedByName;
	private Date CreatedOn;
	private int updatedBy;
	private String updatedByName;
	private Date updatedOn;
	
}
