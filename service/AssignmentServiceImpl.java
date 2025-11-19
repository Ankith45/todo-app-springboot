package com.example.todo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.model.Assignment;
import com.example.todo.repo.AssignmentRepo;

@Service
public class AssignmentServiceImpl implements AssignmentService{

	
	@Autowired
	private AssignmentRepo assignmentRepo;
	
	public String deleteAssignment(int id)
	{
		 assignmentRepo.deleteById(id);
		 return "Deleted task";
	}
	
	
	
	public Assignment createAssignment(Assignment assignment)
	{
		return assignmentRepo.save(assignment);
	}
	

	@Override
	public List<Assignment> getAllAssignment() {

		return assignmentRepo.findAll();
	}

	
	public List<Assignment> getCompleted() {
	
		return assignmentRepo.findByCompletedTrue();
	}

	public List<Assignment> getIncomplete() {

		return assignmentRepo.findByCompletedFalse();
	}

	@Override
	public Assignment getByIdAssign(Integer id) {

		return assignmentRepo.findById(id).get();
	}
	public Assignment updateAssignment(Assignment assignment)
	{
		return assignmentRepo.save(assignment);
	}
}
