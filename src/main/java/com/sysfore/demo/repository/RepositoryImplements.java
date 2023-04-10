package com.sysfore.demo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sysfore.demo.educationSitedto.StudentDetailsdto;

import jakarta.validation.Valid;

@Repository
public class RepositoryImplements implements RepositoryInterface {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public String addStudentDetail(@Valid StudentDetailsdto student) {
		String sql = "select student from student_details where student_usn ='" + student.getStudentUSN() + "';";

		StudentDetailsdto students = jdbctemplate.query(sql, new MyRowMappwer());
		if (students != null) {

			jdbctemplate.update(student);
			return "success";
		}
		return "student already exists";
	}
	
	
	
	
	
	
	

}

class MyRowMapper implements RowMapper<StudentDetailsdto>  {
	StudentDetailsdto student = new StudentDetailsdto();

	@Override
	public StudentDetailsdto mapRow(ResultSet rs, int rowNum) throws SQLException {
	student.setStudentUSN(rs.getString("student_usn"));
	student.setName(rs.getString("student_name"));
	student.setEmail(rs.getString("student_email"));
	student.setPhoneNo(rs.getString("student_phone"));
	student.setDob(rs.getDate("student_dob"));
	student.setFatherName(rs.getString("student_father_name"));
	student.setMotherName(rs.getString("student_mother_name"));
	student.setFatherName(rs.getString("student_perent_phone"));
	student.setPhoto(rs.getBytes("student_photo"));
	student.setMarksCard10th(rs.getBytes("student_10th_marks_card"));
	student.setMarksCard12th(rs.getBytes("student_12th_marks_card"));
	student.setIsActive(rs.getBoolean("is_active"));
	student.setIsDelete(rs.getBoolean("is_delete"));
	student.setCreatedBy(rs.getInt("created_by"));
	student.setCreatedByName(rs.getString("created_by_name"));
	student.setCreatedOn(rs.getDate("created_on"));
	student.setUpdatedBy(rs.getInt("updated_by"));
	student.setUpdatedByName(rs.getString("updated_by_name"));
	student.setUpdatedOn(rs.getDate("updated_on"));
		

	
	
	return student;
	}
}
