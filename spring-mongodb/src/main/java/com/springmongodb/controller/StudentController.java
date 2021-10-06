package com.springmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongodb.entity.Student;
import com.springmongodb.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student)
	{
		return studentService.createStudent(student);
	}

	@GetMapping("/getById/{id}")
	public Student getStudentById(@PathVariable String id)
	{
		return studentService.getStudentById(id);
		
	}
	@GetMapping("/all")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	@DeleteMapping("/delete/{id}")
	public String  deleteStudent(@PathVariable String id) {
		return studentService.deleteStudent(id);
	}
	@GetMapping("/studentsByName/{name}")
	public List<Student> studentByName(@PathVariable String name){
		return studentService.getStudentsByName(name);
		
	}
	
}
