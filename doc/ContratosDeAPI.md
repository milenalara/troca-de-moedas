# Contratos de API

## Student: GetAll

### Request
- URI: /student
- HTTP Verb: GET
- Body: None

### Response:
- HTTP Status:
  - 200 OK if the user is authorized and the Student was successfully retrieved
  - 401 UNAUTHORIZED if the user is unauthenticated or unauthorized
  - 404 NOT FOUND if the user is authenticated and authorized but the Student cannot be found
- Response Body Type: JSON
- Example Response Body:
```json
[
  {
    "id": 1,
    "name": "Lucas Almeida",
    "email": "aluno@exemplo.com",
    "cpf": "12345678901",
    "rg": "MG1234567",
    "balance": 1000,
    "password": "default",
    "educationalInstitution": {
      "id": 1,
      "name": "Pontifícia Universidade Católica de Minas Gerais - PUC Minas"
    },
    "course": {
      "id": 1,
      "name": "Ciência da Computação"
    }
  }
]
```

## Student: GetById

### Request
- URI: /student/{id}
- HTTP Verb: GET
- Body: None

### Response:
- HTTP Status:
  - 200 OK if the user is authorized and the Student was successfully retrieved
  - 401 UNAUTHORIZED if the user is unauthenticated or unauthorized
  - 404 NOT FOUND if the user is authenticated and authorized but the Student cannot be found
- Response Body Type: JSON
- Example Response Body:
```json
  {
    "id": 1,
    "name": "Lucas Almeida",
    "email": "aluno@exemplo.com",
    "cpf": "12345678901",
    "rg": "MG1234567",
    "balance": 1000,
    "password": "default",
    "educationalInstitution": {
      "id": 1,
      "name": "Pontifícia Universidade Católica de Minas Gerais - PUC Minas"
    },
    "course": {
      "id": 1,
      "name": "Ciência da Computação"
    }
  }
```