package dev.rohit.scalerschemadesign.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Data
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourseExamKey implements Serializable{

  private static final long serialVersionUID = 6199495514217308222L;
  @Column(name="student_id")
  private Long studentId;

  @Column(name="course_id")
  private Long courseId;

  @Column(name="exam_id")
  private Long examId;
}
