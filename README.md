# Spring Security JWT API
![Java](https://img.shields.io/badge/Java-21-E67E22)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.11-85EA2D)
![Swagger](https://img.shields.io/badge/Swagger-3-27AE60)

---

### Descrição

API REST desenvolvida em Java e Spring Boot com autenticação stateless usando token JWT e autorização baseada em cargos.

---

### Tecnologias

- Java 21, Spring Boot 3.5
- Spring Security, JWT
- Spring Data JPA, Hibernate, H2
- Springdoc OpenAPI (Swagger)

---

### Funcionalidades

- Autenticação JWT.
- Autorização baseada em cargos.
- Busca de usuários cadastrados.
- Documentação completa via Swagger.

---

### Instalação
1. Pré-requisitos
<ul>

- Java 21

</ul>

2. Clone o repositório
<ul>

```bash
git clone https://github.com/geovanegsfarias/spring-security-jwt-api.git
cd spring-security-jwt-api
```

</ul>

3. Gere as chaves RSA
<ul>

```bash
openssl genrsa -out src/main/resources/app.key 2048
openssl rsa -in src/main/resources/app.key -pubout -out src/main/resources/app.pub
```

</ul>

4. Execute o projeto:
<ul>

```bash
./mvnw spring-boot:run
```
- A API está disponível em http://localhost:8080

- Documentação Swagger em http://localhost:8080/swagger-ui.html

</ul>

---

### Endpoints

#### **Autenticação**

- **POST /auth:** Autentica um usuário e retorna um token JWT.

#### **Usuários**

- **GET /user/all:** Retorna uma lista com os dados de todos os usuários cadastrados, requer cargo admin.
- **GET /user:** Retorna os dados do usuário autenticado, requer autenticação.

---