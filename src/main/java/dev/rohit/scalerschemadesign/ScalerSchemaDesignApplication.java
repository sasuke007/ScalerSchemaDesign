package dev.rohit.scalerschemadesign;

import dev.rohit.scalerschemadesign.entity.Course;
import dev.rohit.scalerschemadesign.entity.Student;
import dev.rohit.scalerschemadesign.repository.CourseRepository;
import dev.rohit.scalerschemadesign.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalerSchemaDesignApplication implements CommandLineRunner{

  @Autowired
  private StudentRepository studentRepository;
  private CourseRepository courseRepository;

  public static void main(String[] args){
    SpringApplication.run(ScalerSchemaDesignApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception{
    Course course = Course.builder().cost(100L).description("learning cpp").name("Learn C++").build();
    Student student =
        Student.builder().email("rohit.pandit@gmail.com").phoneNumber("8878942625").name("rohit").course(course)
            .build();
    //studentRepository.saveAndFlush(student);
    studentRepository.deleteById(1L);
  }
}
