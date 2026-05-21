# Sistema de Infracciones de Tránsito
API REST desarrollada con Spring Boot para la gestión de infracciones de tránsito.

## Tecnologías utilizadas
- Java 21
- Spring Boot 4.0.6
- Spring Data JPA + Hibernate
- Hibernate Envers (auditoría)
- MySQL 8
- Lombok
- Thymeleaf
- HTML / CSS / JavaScript

## Arquitectura
El proyecto implementa el patrón de capas con clase Base genérica:
- `BaseRepository` interfaz genérica con JpaRepository
- `BaseService / BaseServiceImpl`lógica genérica de CRUD
- `BaseController / BaseControllerImpl` endpoints REST genéricos

## Entidades
- **TipodeInfraccion**: catálogo de tipos (Grave, Media, Leve)
- **Conductor**: datos del conductor infractor
- **Infraccion**: relación @ManyToOne con Conductor y @ManyToMany con TipodeInfraccion

## Requisitos para correr el proyecto
- Java 21
- MySQL 8 corriendo en localhost:3306
- IntelliJ IDEA

## Configuración
Editá `src/main/resources/application.properties`:

```properties
spring.datasource.username=root
spring.datasource.password=1234
```

## Correr el proyecto
1. Clonar el repositorio
2. Configurar el `application.properties` con tu password de MySQL
3. Dar Run en IntelliJ
4. Abrir `http://localhost:8080/` en el navegador

## Funcionalidades
CRUD completo de infracciones, conductores y tipos
Filtros por tipo (Grave / Media / Leve)
Búsqueda con @Query (JPQL y SQL nativo)
Paginación con Pageable
Auditoría automática con Hibernate Envers
Frontend HTML/CSS/JS integrado
Validación de fechas y campos obligatorios

## Diagrama a Codificar
<img width="1247" height="791" alt="DiagramaUML" src="https://github.com/user-attachments/assets/bbc65be3-9ecd-433e-a04d-e563ce849143" />
