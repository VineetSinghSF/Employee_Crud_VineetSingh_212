Employee Management System (CRUD)

A simple Employee Management System built using Spring Boot that performs basic CRUD operations (Create, Read, Update, Delete) on employee data.
This project is designed for learning and demonstrating backend development using Java and Spring Boot.

🚀 Features

Add a new employee

View all employees

View employee by ID

Update employee details

Delete an employee

RESTful API design

Uses in-memory database for easy testing

🛠️ Tech Stack

Java 17

Spring Boot

Spring Data JPA

Hibernate

H2 Database

Maven

REST API

📂 Project Structure
employee-crud/
│
├── src/main/java/com/example/employee
│   ├── controller   → REST Controllers
│   ├── model        → Entity classes
│   ├── repository   → JPA Repositories
│   ├── service      → Business logic
│   └── EmployeeCrudApplication.java
│
├── src/main/resources
│   ├── application.properties
│
├── pom.xml
└── README.md

🔗 API Endpoints
Method	Endpoint	Description
POST	/employees	Add new employee
GET	/employees	Get all employees
GET	/employees/{id}	Get employee by ID
PUT	/employees/{id}	Update employee
DELETE	/employees/{id}	Delete employee
🧪 Database

H2 In-Memory Database

H2 Console:

http://localhost:8080/h2-console


JDBC URL:

jdbc:h2:mem:testdb

⚙️ How to Run the Project

Clone the repository

git clone https://github.com/your-username/employee-crud.git


Open the project in IntelliJ / Eclipse

Run:

mvn spring-boot:run


Server will start at:

http://localhost:8080

📌 Sample JSON (Employee)
{
  "name": "Vineet Singh",
  "department": "CSE",
  "salary": 45000
}

🎯 Learning Outcomes

Understanding Spring Boot project structure

REST API development

CRUD operations using JPA

Working with H2 database

Using Maven dependencies

👤 Author

Vineet Singh
B.Tech CSE (AIML) – First Year
Aspiring Software & Machine Learning Engineer

⭐ Acknowledgements

This project is built for learning purposes and practice in backend development using Spring Boot.
