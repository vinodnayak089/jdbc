package com.mphasis.djdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.djdbc.model.Employee;
import com.mphasis.djdbc.repository.EmployeeRepository;
@RestController


public class EmployeeController {
	
		
	@Autowired
    private EmployeeRepository employeeRepository;
	    
	 
	 @RequestMapping("/topics/findById/{id}")
		public Employee getTopicByid(@PathVariable long id) {
		return employeeRepository.findById(id);
		 }			
	    	
	    	
	@RequestMapping(method=RequestMethod.POST, value="/topics/add")
	public void addTopic(@RequestBody Employee employee) {
        employeeRepository.insert(employee);

	}	
	
	 @RequestMapping(method=RequestMethod.POST, value="/topics/update")
		public void updateEmp(@RequestBody Employee employee) {
		 employeeRepository.update(employee);
		 }		
	 
     
	 @RequestMapping(method=RequestMethod.DELETE, value="/topics/delete/{id}")
	 
		 public void delete(@PathVariable long id) {
		 employeeRepository.deleteById(id);
		 }
	 
	 
	 @RequestMapping(method=RequestMethod.GET, value="/topics")
	 public List<Employee> findAll()  {
		 return employeeRepository.findAll();
	 }
}