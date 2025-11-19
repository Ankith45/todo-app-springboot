package com.example.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assignment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String assignment;
	private boolean completed;
	
	public Assignment() {}
	public Assignment(String assignment, boolean status) {
		
		this.assignment = assignment;
		this.completed = status;
	}
	@Override
	public String toString() {
		return "Assignment [id=" + id + ", assignment=" + assignment + ", status=" + completed + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	public boolean getCompleted() {
		return completed;
	}
	public void setCompleted(boolean status) {
		this.completed = status;
	}
	
	

}
