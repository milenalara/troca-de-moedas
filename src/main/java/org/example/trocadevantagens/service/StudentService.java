package org.example.trocadevantagens.service;

import org.example.trocadevantagens.entity.Course;
import org.example.trocadevantagens.entity.EducationalInstitution;
import org.example.trocadevantagens.entity.Student;
import org.example.trocadevantagens.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;

  public Student getStudentById(Long id) {
      return studentRepository.findById(id)
          .orElseThrow(()-> new RuntimeException("Student not found"));
  }
}

