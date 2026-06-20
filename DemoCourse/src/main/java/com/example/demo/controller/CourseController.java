package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService cs;
	
	@GetMapping("display")
	public List<Course> displayCourses(){
		return cs.display();
	}
	
	@PostMapping("add")
	public void addCourse(Course c) {
		cs.add(c);
	}

}
