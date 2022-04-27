package dev.rohit.scalerschemadesign.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;


  @Column(name = "name")
  private String name;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "phone_number")
  private String phoneNumber;

  @CreationTimestamp
  private LocalDateTime createdOn;

  @LastModifiedDate
  private LocalDateTime modifiedOn;

  @LastModifiedBy
  private String modifiedBy;

  @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
  private Set<StudentCourse> courses;

  @OneToMany(mappedBy = "student")
  private Set<StudentCourseExam> studentCourseExam;

}
