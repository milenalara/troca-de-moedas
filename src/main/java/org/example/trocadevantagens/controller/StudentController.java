package org.example.trocadevantagens.controller;

import org.example.trocadevantagens.entity.Student;
import org.example.trocadevantagens.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
  @Autowired
  private StudentService studentService;

  @GetMapping("/{id}")
  public ResponseEntity<Student> findById(@PathVariable Long id) {
    Student student = studentService.getStudentById(id);
    if (student == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(student);
  }
}

