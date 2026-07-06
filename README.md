# Employee Management REST API

A Spring Boot REST API for managing employee records with CRUD operations.

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger OpenAPI
- Git & GitHub

## Features

- Add Employee
- Get All Employees
- Get Employee by ID
- Update Employee
- Delete Employee
- Search Employee by Email
- Search Employees by Department
- Input Validation
- Swagger API Documentation

## API Endpoints

| Method | Endpoint |
|---------|----------|
| POST | /employees |
| GET | /employees |
| GET | /employees/{id} |
| PUT | /employees/{id} |
| DELETE | /employees/{id} |
| GET | /employees/email/{email} |
| GET | /employees/department/{department} |

## Run the Project

1. Clone repository

```bash
git clone https://github.com/GouriShinde27/Employee-Management-REST-API.git
```

2. Create MySQL database

```
employee_db
```

3. Update

```
application.properties
```

with your MySQL username and password.

4. Run

```
EmployeeManagementApplication.java
```

Swagger UI:

```
http://localhost:8080/swagger-ui/index.html
```
