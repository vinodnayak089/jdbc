package com.mphasis.pjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper < Employee > {
	        @Override
	        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Employee employee = new Employee();
	            employee.setId(rs.getLong("id"));
	            employee.setFirstName(rs.getString("first_name"));
	            employee.setLastName(rs.getString("last_name"));
	            employee.setEmailAddress(rs.getString("email_address"));
	            return employee;
	        }
	    }
	 