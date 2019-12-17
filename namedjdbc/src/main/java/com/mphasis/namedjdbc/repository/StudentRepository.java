package com.mphasis.namedjdbc.repository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.mphasis.namedjdbc.model.Student;
import com.mphasis.namedjdbc.model.StudentRowMapper;

@Repository
public class StudentRepository {
   
	@Autowired
 	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	

	public List<Student> findAll() {
		
		//MapSqlParameterSource paramSource= new MapSqlParameterSource();
		//return this.namedParameterJdbcTemplate.query("select * from student", paramSource, new StudentRowMapper());
        return namedParameterJdbcTemplate.query("select * from student", new StudentRowMapper());
        
	}
	

	
	public void insert(Student student) {
		
	String SQL = "insert into student values( :studentRoll, :studentName, :studentClass, :studentAddress)";
	      Map namedParameters = new HashMap();   
	      namedParameters.put("studentRoll", Integer.valueOf(student.getStudentRoll()));   
	      namedParameters.put("studentName", student.getStudentName());
	      namedParameters.put("studentClass", Integer.valueOf(student.getStudentClass()));
	      namedParameters.put("studentAddress",student.getStudentAddress());
	      namedParameterJdbcTemplate.update(SQL, namedParameters);
	}

	public Object findById(int studentRoll) {
		MapSqlParameterSource paramSource=new MapSqlParameterSource("studentRoll",Integer.valueOf(studentRoll));
		return  namedParameterJdbcTemplate.queryForObject("select *from student where student_Roll= :studentRoll", paramSource,new StudentRowMapper())	;
	}



	



	public void update(Student student, int studentRoll) {
		
		Map temp=new HashMap();
    	temp.put("studentRoll",Integer.valueOf(student.getStudentRoll()));
        temp.put("studentName", student.getStudentName());
        temp.put("studentClass", Integer.valueOf(student.getStudentClass()));
        temp.put("studentAddress", student.getStudentAddress());
        
         namedParameterJdbcTemplate.update("update student set student_Name=:studentName,student_Class=:studentClass,student_Address=:studentAddress where student_Roll=:studentRoll", temp);
	}



	public void delete(int studentRoll) {
		MapSqlParameterSource paramSource=new MapSqlParameterSource("studentRoll",Integer.valueOf(studentRoll));
		namedParameterJdbcTemplate.update("delete student where student_Roll=:studentRoll", paramSource);
	}



	
}
