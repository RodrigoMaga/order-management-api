# Order Management API

API REST para gerenciamento de pedidos, produtos e pagamentos, desenvolvida com Spring Boot e JPA.

## Principais conceitos aplicados

- Modelagem de domínio com JPA/Hibernate
- Relacionamentos OneToMany, ManyToMany e OneToOne
- Chave composta com `@EmbeddedId`
- Enum mapeado para o banco de dados
- Tratamento centralizado de exceções REST
- Arquitetura em camadas (Controller, Service, Repository)

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 / PostgreSQL
- Maven

## Domínio

- User
- Order
- OrderItem
- Product
- Category
- Payment

## Execução

```bash
mvn spring-boot:run
