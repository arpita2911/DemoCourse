package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Course;

public interface CourseService {
	
	void add(Course c);
	List<Course> display();

}
