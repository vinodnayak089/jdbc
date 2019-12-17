package com.mphasis.namedjdbc.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.namedjdbc.model.Student;
import com.mphasis.namedjdbc.repository.StudentRepository;

@RestController
public class StudentController 
{
	@Autowired
	StudentRepository studentRepository;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/students")
	public List<Student> findAll()
	{
		return studentRepository.findAll();
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/students/findById/{studentRoll}")
	
		public Object findById(@PathVariable("studentRoll") int studentRoll)
		{
			return studentRepository.findById(studentRoll);
		}
	

    @RequestMapping(method=RequestMethod.POST,value="/students/insert")
	public void insert(@RequestBody Student student)
	{
    	studentRepository.insert(student);
	}
    
    @RequestMapping(method=RequestMethod.PUT, value="/students/update/{studentRoll}")
    public void update(@RequestBody Student student,@PathVariable int studentRoll)
    {
    	studentRepository.update(student,studentRoll);
    	
    }
    
    @RequestMapping(method=RequestMethod.DELETE,value="/students/delete/{studentRoll}")
    public void delete(@PathVariable int studentRoll )
    {
    	studentRepository.delete(studentRoll);
    }
}
