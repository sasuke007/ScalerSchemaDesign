package dev.rohit.scalerschemadesign.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourse{

  @EmbeddedId
  private StudentCourseKey id;

  @ManyToOne
  @JoinColumn(name="student_id")
  @MapsId("studentId")
  private Student student;

  @ManyToOne
  @JoinColumn(name="course_id")
  @MapsId("courseId")
  private Course course;

  @Column(name="status")
  private String status;

  @Column(name="rating")
  private Double rating;

}
