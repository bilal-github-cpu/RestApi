package com.Bilal.Service;


	import java.util.List;

import org.springframework.stereotype.Service;

import com.Bilal.Entity.Course;

    @Service
	public interface CourseService {
    	
    	
		public List<Course> getCourses();
		
		public Course getCourse(Long courseId);
		
		public Course addCourse(Course course);
		
		public Course updateCourse(Course course);
		
		public void deleteCourse(long parseLong);
		
		
		
	}

