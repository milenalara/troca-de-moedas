package org.example.trocadevantagens;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.example.trocadevantagens.entity.Course;
import org.example.trocadevantagens.entity.EducationalInstitution;
import org.example.trocadevantagens.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TrocaDeVantagensApplicationTests {
  @Autowired
  TestRestTemplate restTemplate;

  @Test
  void shouldReturnAStudentWhenDataIsSaved() {
    EducationalInstitution educationalInstitution = new EducationalInstitution(
        1L,
        "Pontifícia Universidade Católica de Minas Gerais - PUC Minas");

    Course course = new Course(1L, "Ciência da Computação");

    Student student = new Student(
        1L,
        "Lucas Almeida",
        "aluno@exemplo.com",
        "12345678901",
        "MG1234567",
        1000L,
        "default",
        educationalInstitution,
        course);

    ResponseEntity<String> response = restTemplate.getForEntity("/student/1", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

    DocumentContext documentContext = JsonPath.parse(response.getBody());
    Number id = documentContext.read("$.id");

    assertThat(id).isEqualTo(1);

  }
}


