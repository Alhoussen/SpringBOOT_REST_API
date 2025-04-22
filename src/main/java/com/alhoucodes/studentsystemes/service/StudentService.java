package com.alhoucodes.studentsystemes.service;

import com.alhoucodes.studentsystemes.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
