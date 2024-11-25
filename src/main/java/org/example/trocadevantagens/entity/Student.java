package org.example.trocadevantagens.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true)
  Long id;

  @Column(nullable = false)
  String name;

  @Column(nullable = false)
  String email;

  @Column(nullable = false)
  String cpf;

  @Column(nullable = false)
  String rg;

  Long balance;

  String password;

  @ManyToOne
  @JoinColumn(name = "educationalInstitution_id", nullable = false)
  EducationalInstitution educationalInstitution;

  @ManyToOne
  @JoinColumn(name = "course_id", nullable = false)
  Course course;

  // constructors
  public Student() {
  }

  public Student(Long id, String name, String email, String cpf, String rg, Long balance, String password, EducationalInstitution educationalInstitution, Course course) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.cpf = cpf;
    this.rg = rg;
    this.balance = balance;
    this.password = password;
    this.educationalInstitution = educationalInstitution;
    this.course = course;
  }

  // getters and setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public EducationalInstitution getEducationalInstitution() {
    return educationalInstitution;
  }

  public void setEducationalInstitution(EducationalInstitution educationalInstitution) {
    this.educationalInstitution = educationalInstitution;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }
}