package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseServiceimpl implements CourseService {

	
	@Autowired
	private CourseRepository cr;
	
	@Override
	public void add(Course c) {
		// TODO Auto-generated method stu
		cr.save(c);

	}

	@Override
	public List<Course> display() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

}
