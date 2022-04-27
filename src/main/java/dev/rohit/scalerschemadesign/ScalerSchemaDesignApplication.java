package dev.rohit.scalerschemadesign;

import dev.rohit.scalerschemadesign.entity.Course;
import dev.rohit.scalerschemadesign.entity.Student;
import dev.rohit.scalerschemadesign.entity.StudentCourse;
import dev.rohit.scalerschemadesign.entity.StudentCourseKey;
import dev.rohit.scalerschemadesign.repository.CourseRepository;
import dev.rohit.scalerschemadesign.repository.StudentCourseRepository;
import dev.rohit.scalerschemadesign.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class ScalerSchemaDesignApplication implements CommandLineRunner{

  @Autowired
  private StudentRepository studentRepository;
  @Autowired
  private CourseRepository courseRepository;
  @Autowired
  private StudentCourseRepository studentCourseRepository;

  public static void main(String[] args){
    SpringApplication.run(ScalerSchemaDesignApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception{
    Course course = Course.builder().cost(100L).description("learning cpp").name("Learn C++").duration(6L).build();
    Student student =
        Student.builder().email("rohit.pandit@gmail.com").phoneNumber("8878942625").name("rohit")
            .build();
    StudentCourse studentCourse =
        StudentCourse.builder()
            .id(StudentCourseKey.builder().studentId(student.getId()).courseId(course.getId()).build()).student(student)
            .course(course).rating(5.6).status(
                "ENROLLED").build();
    courseRepository.save(course);
    studentRepository.save(student);
    studentCourseRepository.saveAndFlush(studentCourse);
    //studentRepository.deleteById(1L);
    courseRepository.deleteById(1L);
  }
}
