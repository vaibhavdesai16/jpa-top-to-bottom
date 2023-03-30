package com.systemx.exjpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookName;
    @ManyToMany(mappedBy = "likedCourses")
    Set<Student> likes;
}
