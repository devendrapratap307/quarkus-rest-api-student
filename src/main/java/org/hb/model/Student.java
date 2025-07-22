package org.hb.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student_detail")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer age;
    private String course;
    private String name;
    private String email;
}
