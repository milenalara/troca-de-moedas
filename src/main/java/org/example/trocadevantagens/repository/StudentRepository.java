package org.example.trocadevantagens.repository;


import org.example.trocadevantagens.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

