package com.example.demo.service;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Topic;
import com.example.demo.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicrepository;

	public List<Topic> getAllTopics() {
        List <Topic> topics=new ArrayList<Topic>();
        topicrepository.findAll()
        .forEach(topics::add);
		return topics;
	}

	public Optional<Topic> getTopic(String id) {
		return topicrepository.findById(id);
	}

	public Topic addTopic(Topic topic) {

		return topicrepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		
		 topicrepository.save(topic);
	}

	public void deleteTopic(Topic id) {
         topicrepository.delete(id);		
	}

	
	public List<Topic> sortById() {
		 List <Topic> topics=new ArrayList<Topic>();
	        topicrepository.findAllByOrderByIdAsc()
	        .forEach(topics::add);
			return topics;
		
	}
	

}
