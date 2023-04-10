package com.sysfore.demo.educationSitedto;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;

@Data
public class Resultdto {
@Id
	private int resultId;
	private String studentUSN;
	private int semId;
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	
}
