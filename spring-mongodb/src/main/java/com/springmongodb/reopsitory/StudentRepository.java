package com.springmongodb.reopsitory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongodb.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

	List <Student> findByName(String name);
}
