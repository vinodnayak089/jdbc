package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String>{
	
	



	public Iterable<Topic> findAllByOrderByIdAsc();


	
}
