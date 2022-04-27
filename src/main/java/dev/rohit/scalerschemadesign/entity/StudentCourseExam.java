package dev.rohit.scalerschemadesign.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourseExam{

  @EmbeddedId
  private StudentCourseExamKey id;

  @Column(name="marks")
  private Double marks;

  @JoinColumn(name="student_id")
  @MapsId("studentId")
  @ManyToOne
  private Student student;

  @JoinColumn(name="course_id")
  @MapsId("courseId")
  @ManyToOne
  private Course course;

  @JoinColumn(name="exam_id")
  @MapsId("examId")
  @ManyToOne
  private Exam exam;
}
