package com.example.demo.model;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Topic {
	@Id
	private String id; 
	private String name;
	private String discription;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", discription=" + discription + "]";
	} 


}
