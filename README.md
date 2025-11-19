# todo-app-springboot
A simple Spring Boot Todo API with CRUD operations
Dependencies and other additional files generated using spring intializer. 
Consists of 4 layers:
Model Layer: Defines the Assignment entity representing a task in the database.
Repository Layer: AssignmentRepository interface handles database operations using Spring Data JPA.
Service Layer: AssignmentServiceImpl contains business logic for creating, updating, deleting, and retrieving assignments.
Controller Layer: AssignmentController exposes REST endpoints for CRUD operations.

Features: 
1) Can Create/update assignments or tasks.
2) Can Delete tasks
3) Can update tasks to completed or incomplete
4) Can retrieve tasks based on their completion

Connected to Mysql database and testing can be done with postman. 

Testing:
Use Postman or any API testing tool.
Base URL: http://localhost:8080/todoapp

Example JSON for POST/PUT:
{
    "assignment": "Study",
    "completed": false
}
