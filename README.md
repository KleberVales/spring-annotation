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

---

## 📘 Conceitos aplicados

| Conceito             | Explicação breve                                    |
|----------------------|------------------------------------------------------|
| `@Component`         | Marca a classe como bean gerenciado pelo Spring     |
| `@Service`           | Especialização de `@Component` para lógica de negócio |
| `@Repository`        | Especialização de `@Component` para persistência     |
| `@PostConstruct`     | Executado logo após o bean ser instanciado          |
| `@PreDestroy`        | Executado antes do bean ser destruído               |
| Component Scanning   | Spring detecta automaticamente os beans nos pacotes |

---

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/spring-annotations.git
   cd spring-annotations

2. Execute o projeto:

```bash
./gradlew bootRun
```

   
