package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;



@RestController

public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	
	@RequestMapping("/topics")
	public List <Topic> getAllTopics(){
		return topicservice.getAllTopics();
	}
	
    @RequestMapping("/topics/{id}")
	public Optional<Topic> getTopicByid(@PathVariable("id") String id) {
		return topicservice.getTopic(id);
		}
		
	
@RequestMapping(method=RequestMethod.POST, value="/topics")
public void addTopic(@RequestBody Topic topic) {
	topicservice.addTopic(topic);
}	

@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")

	public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
		topicservice.updateTopic(id, topic);
		
	}


@RequestMapping(method=RequestMethod.DELETE, value="/topic/{id}")

	public void deleteTopic(@RequestBody Topic topic, @PathVariable Topic id)
	{
		topicservice.deleteTopic(id);
	}

@RequestMapping("/sortById")
public List<Topic> sortById()
{
	return topicservice.sortById();
	
}
}
