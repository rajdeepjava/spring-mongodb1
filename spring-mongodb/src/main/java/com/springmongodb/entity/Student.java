package com.springmongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	
  @Id
  private String id;
  private String name;
  private int number;
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
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public Student(String id, String name, int number) {
	super();
	this.id = id;
	this.name = name;
	this.number = number;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", number=" + number + "]";
}

}
