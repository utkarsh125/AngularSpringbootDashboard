# Employee Dashboard Project

This project is a modular Spring Boot REST API built using `java:25` and `springboot:4.0.3`. The application provides backend services for an Employee Management System and is designed to integrate with a frontend client such as an _Angular Application_. It exposes RESTful endpoints for creating, retrieving, updating and deleting employee records while following a clean layered architecture.

## Project Overview

The application implements a structured and maintainable backend using a layered architecture pattern. It separates responsibilities into `controller`, `service`, `repository`, `model`, and `exception` layers. This ensures a clear separation of concerns, making the system easier to understand, test, and extend.

The backend uses Springboot auth-configuration and an embedded server to simplify deployment and development. It also integrates Spring Data JPA for database operations and uses an `h2` in-memory database for development and testing purposes.

## Architecture

The application follows a layered architecture where each layer has a specific responsibility. The `controller` layer handles HTTP requests and responses. The `service` layer contains the business logic of the application. The `repository` layer manages database access and interacts with the persistence layer through Spring Data JPA. The `model` layer defines the entity that is mapped to the database table. The `DTO` layer ensures that only controlled data is transferred between the backend and the client. The `exception` layer provides centralized error handling to return appropriate HTTP responses.

This architecture improves modularity, maintainability, and scalability while adhering to **SOLID Design Principles**.

## Technologies Used

The project is built using `java:25` and `springbooth:4.0.3`. Spring Web is used to build REST APIs. Spring Data JPA provides abstraction over database operations. H2 Database is used as an in-memory database for development. `lombok` is used to reduce boilerplate code such as getters, setters, and constructors. Maven is used for dependency management and build automation.

## Database Configuration

The application uses an H2 in-memory database configured through the `application.properties` file. The database is automatically created at runtime, and Hibernate generates the required tables based on the entity definitions. The H2 console is enabled and accessible via the browser for development and testing purposes.

Hibernate is configured to automatically update the schema when the application starts. SQL queries are logged to the console to make it easier to debug and understand database interactions.

## REST API Endpoints

The API exposes RESTful endpoints under the base path `/api/employees`. It supports retrieving all employees, retrieving a single employee by ID, creating a new employee, updating an existing employee, and deleting an employee. All responses are returned in JSON format.

The `controller` communicates with the `service` layer, which performs business logic and interacts with the repository layer to persist or retrieve data from the database.

## Exception Handling

The application implements a global exception handling mechanism using a centralized exception handler. When a requested resource is not found, a custom exception is thrown and translated into an appropriate HTTP 404 response. This ensures consistent and meaningful error responses across the API.

## Running the Application

The application can be started using the Maven wrapper included in the project. After building the project, running the Spring Boot application will start an embedded server on port 8080. Once started, the API endpoints are available at <http://localhost:8080/api/employees>.

The H2 database console is available at <http://localhost:8080/h2-console>. The configured JDBC URL for development is jdbc:h2:mem:employeedb.

## Integration with Angular

The backend is configured to allow cross-origin requests from <http://localhost:4200>, which is the default Angular development server port. This allows seamless integration with an Angular frontend application that consumes the REST API using HttpClient.

## Design Considerations

The use of DTOs prevents exposing internal entity structures directly to clients and allows flexibility in shaping API responses. The separation between service interface and implementation supports loose coupling and makes future extensions easier. The use of Spring Data JPA removes the need for manual SQL queries while still allowing customization if needed.

The modular structure ensures that each layer can evolve independently and supports best practices for enterprise-level backend development.

## How to run this?

The steps are pretty simple, just run both the servers.

For Angular:

```
cd AngularFrontend && ng serve
```

For Springboot Backend:

```
cd EmployeeProject && ./mvnw spring-boot:run
```

This project marks the completion of Angular Module under Java Training Module Training at Volkswagen.

