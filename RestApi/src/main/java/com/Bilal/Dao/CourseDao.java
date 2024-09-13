package com.Bilal.Dao;

	import org.springframework.data.jpa.repository.JpaRepository;
    import com.Bilal.Entity.Course;

	public interface CourseDao extends JpaRepository<Course, Long>{

	}

	