# 🩺 API de Cadastro de Médicos

Este projeto é uma API REST simples desenvolvida com Java e Spring Boot, com o objetivo de praticar os conceitos de CRUD, JPA/Hibernate e integração com banco de dados PostgreSQL.
A aplicação permite cadastrar, listar, buscar, atualizar e deletar médicos.


# 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Hibernate
- Maven

# 📂 Estrutura do Projeto
```
com.medicos.api
 ├── ApiApplication.java
 ├── controller
 │    └── MedicoController.java
 ├── service
 │    └── MedicoService.java
 ├── repository
 │    └── MedicoRepository.java
 └── model
      └── Medico.java

```

# 🧠 Conceitos Aplicados

- Arquitetura em camadas (Controller, Service, Repository)
- REST API
- JPA e Hibernate
- Injeção de dependência
- Mapeamento objeto-relacional (ORM)

#🗄️ Banco de Dados

📌 PostgreSQL

Crie o banco de dados:
```
CREATE DATABASE medicos_db;

```
# ⚙️ Configuração (application.properties)
```
spring.datasource.url=jdbc:postgresql://localhost:5432/medicos_db
spring.datasource.username=postgres
spring.datasource.password=SUASENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```
# ▶️ Como Executar o Projeto

Opção 1 — Pela IDE (IntelliJ / Eclipse)

Abra o projeto
Execute a classe:


```
ApiApplication.java
```
Opção 2 — Pelo terminal
mvn spring-boot:run

A aplicação será iniciada em:

```
http://localhost:8080
```
# 👩‍💻 Thayza Silva

Projeto desenvolvido para fins de estudo em Java e Spring Boot.
