package com.Bilal.Service;


	
     import java.util.List;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.stereotype.Service;
     import com.Bilal.Dao.CourseDao;
     import com.Bilal.Entity.Course;

	@Service
	public class CourseServiceImpl implements CourseService {
        
		@Autowired
		private CourseDao courseDao;

		  
		      public CourseServiceImpl()
		         {
	
	         	  }
		
		@Override
		public List<Course> getCourses() {
			
		return courseDao.findAll();
		}

		//@SuppressWarnings("deprecation")
		@Override
		public Course getCourse(Long courseId)
		{
		
			return courseDao.getReferenceById(courseId);
		}

		@Override
		public Course addCourse(Course course)
		{
		     courseDao.save(course);
			 return course;
		}

		@Override
		public Course updateCourse(Course course)
		{
			courseDao.save(course);
			return course;
		}

		//@SuppressWarnings("deprecation")
		@Override
		public void deleteCourse(long parseLong) {
			
			Course entity=courseDao.getReferenceById(parseLong);
			courseDao.delete(entity);
		}


		
	}

