package com.mphasis.namedjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper{
	
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student =new Student();

		student.setStudentRoll(rs.getInt("student_Roll"));
		student.setStudentName(rs.getString("student_Name"));
		student.setStudentClass(rs.getInt("student_Class"));
		student.setStudentAddress(rs.getString("student_Address"));
		return student;
	}
	
	

}
//class UserMapper implements RowMapper {
//
//	@Override
//	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//		User user = new User();
//		user.setId(rs.getInt("record_id"));
//		user.setName(rs.getString("name"));
//		user.setEmail(rs.getString("address"));
//		user.setEmail(rs.getString("email"));
//		return user;
//	}