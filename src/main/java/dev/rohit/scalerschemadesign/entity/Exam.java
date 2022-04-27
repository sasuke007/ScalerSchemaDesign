package dev.rohit.scalerschemadesign.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exams")
public class Exam{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "total_marks")
  private String totalMarks;

  @JoinTable(name = "exam_course", joinColumns = {
      @JoinColumn(name = "exam_id", referencedColumnName = "id")
  },
      inverseJoinColumns = {
          @JoinColumn(name = "course_id", referencedColumnName = "id")
      })
  @ManyToMany(cascade = CascadeType.REMOVE)
  private Set<Course> courses;

  @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "exam")
  private Set<StudentCourseExam> studentCourseExams;
}
