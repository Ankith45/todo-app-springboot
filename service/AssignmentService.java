package com.example.todo.service;

import java.util.List;

import com.example.todo.model.Assignment;

public interface AssignmentService {
	
	
	public List<Assignment> getAllAssignment();
	
	public Assignment getByIdAssign(Integer id);
	
	
}
