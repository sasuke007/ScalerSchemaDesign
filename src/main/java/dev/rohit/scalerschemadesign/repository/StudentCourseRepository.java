package dev.rohit.scalerschemadesign.repository;

import dev.rohit.scalerschemadesign.entity.StudentCourse;
import dev.rohit.scalerschemadesign.entity.StudentCourseKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, StudentCourseKey>{
}
