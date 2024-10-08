package com.Bilal.Controller;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.Bilal.Entity.Course;
import com.Bilal.Service.CourseService;

	@RestController
	public class MyController {

		@Autowired
		private CourseService courseServices;

		// get all courses
		@GetMapping("/courses")
		public List<Course> getCourses() {
			return this.courseServices.getCourses();
		}
   
		// get one course
		@GetMapping("/courses/{courseId}")
		public Course getCourse(@PathVariable String courseId) {
			return this.courseServices.getCourse(Long.parseLong(courseId));
		}
        
		// add the course
		@PostMapping("/courses")
		public  Course addcourse(@RequestBody Course course)
		{
			return this.courseServices.addCourse(course);
		}
		//update the course
		@PutMapping("/courses")
		public Course updateCourse(@RequestBody Course course) {
			return this.courseServices.updateCourse(course);
		}
		
		// Delete the courses
		@DeleteMapping("/courses/{courseId}")
		public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
			try {
				this.courseServices.deleteCourse(Long.parseLong(courseId));
				return new ResponseEntity<>(HttpStatus.OK);
			} catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}
	

