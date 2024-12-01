# Student Management API

Welcome to the **Student Management API** built with **Spring Boot**, **MySQL**, and **DTOs**. This API provides CRUD operations (Create, Read, Update, Delete) for managing students, including their `name`, `email`, and `studentId`. It uses **RESTful web services** and allows the client to interact with the student records in a MySQL database.

---

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [API Endpoints](#api-endpoints)
  - [GET /students](#get-students)
  - [GET /students/{id}](#get-student-by-id)
  - [POST /students](#create-student)
  - [PUT /students/{id}](#update-student)
  - [DELETE /students/{id}](#delete-student)
- [Setup Instructions](#setup-instructions)
  - [Clone the Repository](#clone-the-repository)
  - [Configure the Database](#configure-the-database)
  - [Run the Application](#run-the-application)
- [License](#license)

---

## Project Overview

The **Student Management API** is a simple, yet powerful API that allows users to manage student records. The project is built using **Spring Boot** for the backend, with **MySQL** as the database. It exposes a set of RESTful endpoints to interact with student data, including the ability to create, retrieve, update, and delete student records.

---

## Features

- **Create** new student records with `name`, `email`, and `studentId`.
- **Read** a list of all students or retrieve a student by their unique `id`.
- **Update** an existing student's information.
- **Delete** student records from the system.
- Data is stored and retrieved from a **MySQL** database.
- Simple and intuitive **REST API** endpoints for easy integration.

---

## Technologies Used

- **Java 11**
- **Spring Boot 2.x**
- **Spring Data JPA** for database interaction
- **MySQL** for the database
- **Lombok** for boilerplate code reduction
- **Postman** for testing the API endpoints

---

## API Endpoints

### GET /students

Retrieve all students from the database.

- **URL**: `/students`
- **Method**: `GET`
- **Response**: List of all students.

#### Example:

```bash
GET http://localhost:8080/students
```

### GET /students/{id}

Retrieve a student by their unique `id`.

- **URL**: `/students/{id}`
- **Method**: `GET`
- **Response**: A single student's details.

#### Example:

```bash
GET http://localhost:8080/students/1
```

### POST /students

Create a new student record.

- **URL**: `/students`
- **Method**: `POST`
- **Request Body**: JSON object with the student's `name`, `email`, and `studentId`.

```json
{
  "name": "Alberto Junior",
  "email": "albertojunior@example.com",
  "studentId": "STU123456"
}
```

#### Example:

```bash
POST http://localhost:8080/students
```

### PUT /students/{id}

Update an existing student's information.

- **URL**: `/students/{id}`
- **Method**: `PUT`
- **Request Body**: JSON object with updated student details.

```json
{
  "name": "Alberto Junior Updated",
  "email": "albertojuniorupdated@example.com",
  "studentId": "STU123456"
}
```

#### Example:

```bash
PUT http://localhost:8080/students/1
```

### DELETE /students/{id}

Delete a student by their unique `id`.

- **URL**: `/students/{id}`
- **Method**: `DELETE`
- **Response**: Status code 204 (No Content) upon successful deletion.

#### Example:

```bash
DELETE http://localhost:8080/students/1
```

---

## Setup Instructions

Follow these steps to set up the project on your local machine.

### Clone the Repository

Start by cloning this repository to your local machine:

```bash
git clone git@github.com:alberto-debug/http-server-SpringBoot.git
cd http-server-SpringBoot
```

### Configure the Database

1. **Install MySQL** if you don’t have it installed already.
2. **Create a database** for the project:

```sql
CREATE DATABASE springdb;
```

3. Configure your MySQL connection settings in the `application.properties` file located in `src/main/resources`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/springdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run the Application

Once everything is set up, you can run the application with Maven:

```bash
./mvnw spring-boot:run
```

Alternatively, if you’re using IntelliJ IDEA or Eclipse, you can run the application directly from the IDE.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Happy Coding!** 🚀

---
