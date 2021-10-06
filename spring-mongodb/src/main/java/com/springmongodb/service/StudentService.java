package com.springmongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.entity.Student;
import com.springmongodb.reopsitory.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	public Student getStudentById(String id)
	{
		return studentRepository.findById(id).get();
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	public Student updateStudent(Student student)
	{
		return studentRepository.save(student);
	}
	public String deleteStudent(String id)
	{
		studentRepository.deleteById(id);
		return "student has deleted";
	}
	public List<Student> getStudentsByName(String name) {
		
		return studentRepository.findByName(name);
	}
}
