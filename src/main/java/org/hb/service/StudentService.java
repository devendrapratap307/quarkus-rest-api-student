package org.hb.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.hb.model.Student;
import org.hb.repository.StudentRepository;

import java.util.List;

@ApplicationScoped
@Transactional
public class StudentService {
    @Inject
    StudentRepository studentRepository;

    public List<Student> listAll() {
        return studentRepository.listAll();
    }

    public void add(Student student) {
        studentRepository.persist(student);
    }

    public void delete(Integer id) {
        studentRepository.deleteById(Long.valueOf(id));
    }

    public Student find(Integer id) {
        return studentRepository.findById(Long.valueOf(id));
    }
}
