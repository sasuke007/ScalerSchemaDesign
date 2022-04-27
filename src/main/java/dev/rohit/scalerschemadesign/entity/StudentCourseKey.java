package dev.rohit.scalerschemadesign.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourseKey implements Serializable{

  @Column(name="student_id")
  private Long studentId;

  @Column(name="course_id")
  private Long courseId;


}
