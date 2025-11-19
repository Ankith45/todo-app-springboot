package com.example.todo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.model.Assignment;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment,Integer> {

	List<Assignment> findByCompletedTrue();

	List<Assignment> findByCompletedFalse();

}
