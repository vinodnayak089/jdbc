package com.mphasis.pjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.pjdbc.model.Employee;
import com.mphasis.pjdbc.repository.EmployeeRepository;
@RestController


public class EmployeeController {
	
		
	@Autowired
    private EmployeeRepository employeeRepository;
	    
	 
	 @RequestMapping("/topics/findById")
		public Employee getTopicByid() {
		return employeeRepository.findById(10L);
		 }			
	    	
	    	
	@RequestMapping(method=RequestMethod.POST, value="/topics/add")
	public void addTopic() {
        employeeRepository.insert(new Employee(109L, "rv", "StarkVinod1", "com"));

	}	
	
	 @RequestMapping(method=RequestMethod.POST, value="/topics/update")
		public void updateEmp(){
		 employeeRepository.update(new Employee(135L, "rv", "Starkinod1", "com"));
		 }		
	 
     
	 @RequestMapping(method=RequestMethod.DELETE, value="/topics/delete")
	 
		 public void delete() {
		 employeeRepository.deleteById(10L);
		 }
	 
	 
	 @RequestMapping(method=RequestMethod.GET, value="/topics")
	 public List<Employee> findAll()  {
		 return employeeRepository.findAll();
	 }
}