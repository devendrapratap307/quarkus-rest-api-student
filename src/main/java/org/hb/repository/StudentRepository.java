package org.hb.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.hb.model.Student;

@ApplicationScoped
public class StudentRepository implements PanacheRepository<Student> {
    // Inherited methods: persist, findById, listAll, deleteById, etc.
}

