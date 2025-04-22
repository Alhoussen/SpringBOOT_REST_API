package com.alhoucodes.studentsystemes.repository;

import com.alhoucodes.studentsystemes.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
