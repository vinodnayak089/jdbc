package com.mphasis.pjdbc.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.mphasis.pjdbc.model.Employee;
import com.mphasis.pjdbc.model.EmployeeRowMapper;
@Repository
public class EmployeeRepository {
	 @Autowired
	    JdbcTemplate jdbcTemplate;
	
	 public List < Employee > findAll() {
	        return jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
	    }

	    public   Employee  findById(long id) {
	        return jdbcTemplate.queryForObject("select * from employee where id=?", new Object[] {
	                id
	            },
	            new BeanPropertyRowMapper < Employee > (Employee.class));
	    }
	    

	    public int deleteById(long id) {
	        return jdbcTemplate.update("delete from employee where id=?", new Object[] {
	            id
	        });
	    }

	    public int insert(Employee employee) {
	        return jdbcTemplate.update("insert into employee (id, first_name, last_name, email_address) " + "values(?, ?, ?, ?)",
	            new Object[] {
	                employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmailAddress()
	            });
	    }

	    public int update(Employee employee) {
	        return jdbcTemplate.update("update employee" + " set first_name = ?, last_name = ?, email_address = ? " + " where id = ?",
	            new Object[] {
	                employee.getFirstName(), employee.getLastName(), employee.getEmailAddress(), employee.getId()
	            });
	    }
	

}
