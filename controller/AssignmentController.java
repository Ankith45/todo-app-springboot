package com.example.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.model.Assignment;
import com.example.todo.service.AssignmentServiceImpl;

@RestController
@RequestMapping("/todoapp")
public class AssignmentController {
	
	@Autowired
	AssignmentServiceImpl assignmentServiceImpl;	
	
	public AssignmentController(AssignmentServiceImpl assignmentServiceImpl) {
		super();
		this.assignmentServiceImpl = assignmentServiceImpl;
	}

	@GetMapping
	public List<Assignment> getAllAssignment()
	{
		return assignmentServiceImpl.getAllAssignment();
	}
	
	@GetMapping("/completed")
	public List<Assignment> getCompleted()
	{
		return assignmentServiceImpl.getCompleted();
	}
	
	@GetMapping("/incomplete")
	public List<Assignment> getIncomplete()
	{
		return assignmentServiceImpl.getIncomplete();
	}
	
	@PostMapping
	public Assignment createAssignment(@RequestBody Assignment assignment)
	{
		return assignmentServiceImpl.createAssignment(assignment);
	}
	
	@PutMapping("/{id}")
	public Assignment updateAssignment(@PathVariable("id") int id,@RequestParam Boolean completed)
	{
		Assignment assignment=assignmentServiceImpl.getByIdAssign(id);
		assignment.setCompleted(completed);
		return assignmentServiceImpl.updateAssignment(assignment);
	}
	
	@GetMapping("/{id}")
	public Assignment getById(@PathVariable("id") int id)
	{
		return assignmentServiceImpl.getByIdAssign(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") int id)
	{
		assignmentServiceImpl.deleteAssignment(id);
		return "deleted successfully";
	}
}
