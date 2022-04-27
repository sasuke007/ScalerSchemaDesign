package dev.rohit.scalerschemadesign.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="courses")
public class Course{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name="duration")
  private Long duration;

  @Column(name="name")
  private String name;

  @Column(name="cost")
  private Long cost;

  @Column(name="description")
  private String description;

  @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "course")
  private Set<StudentCourse>  students;
}
