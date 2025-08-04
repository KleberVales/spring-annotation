# 📦 spring-annotations

Neste trabalho, foram abordados os conceitos de **configuração baseada em anotações**, **ciclo de vida dos beans**, e **component scanning automático** com o uso de `@Component`, `@Service`, `@Repository`, `@PostConstruct` e `@PreDestroy`.

---

## 🎯 Objetivos do projeto

- Entender como o Spring detecta beans automaticamente via component scanning
- Utilizar as anotações estereotipadas (`@Component`, `@Service`, `@Repository`)
- Testar o ciclo de vida de beans com `@PostConstruct` e `@PreDestroy`
- Organizar o código por responsabilidades: serviço, repositório e infraestrutura

---

## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Framework Core 6.2.x
- Spring Boot 3.5.x
- Gradle (Kotlin DSL)
- IntelliJ IDEA

---

## 📂 Estrutura do projeto

```
spring-annotations/
└── src/
└── main/
├── java/com.example.springannotations/
│ ├── SpringAnnotationsApplication.java
│ ├── service/
│ │ └── UserService.java
│ ├── repository/
│ │ └── UserRepository.java
│ └── lifecycle/
│ └── LifecycleBean.java
└── resources/
└── application.yml (opcional)
```
