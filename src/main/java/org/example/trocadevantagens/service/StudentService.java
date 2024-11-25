package org.example.trocadevantagens.service;

import org.example.trocadevantagens.entity.Course;
import org.example.trocadevantagens.entity.EducationalInstitution;
import org.example.trocadevantagens.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  public Student getStudentById(Long id) {
    if (id.equals(1L)) {
      EducationalInstitution educationalInstitution = new EducationalInstitution(
          1L,
          "Pontifícia Universidade Católica de Minas Gerais - PUC Minas");

      Course course = new Course(1L, "Ciência da Computação");

      return new Student(
          1L,
          "Lucas Almeida",
          "aluno@exemplo.com",
          "12345678901",
          "MG1234567",
          1000L,
          "default",
          educationalInstitution,
          course);
    }
    return null;
  }
}

