# 📌 Student Management REST API —  (Advanced)

A powerful Spring Boot REST API for managing students with **CRUD operations**, **filtering**, **search**, **marks-based queries**, and **count functionality**. Built using Spring Boot, JPA, and MySQL — perfect for real-world API learning. 🚀📚

---

## 🚀 Features

### ✔ Basic CRUD

* Add Student
* Get All Students
* Get Student by ID
* Update Student
* Delete Student

### ✔ Advanced APIs

* 🔍 Search students by partial name
* 🏙 Find students by city
* 📈 Students with marks greater than a value
* 📉 Students with marks less than a value
* 🔢 Count total students
* ⚡ JPA-powered filtering & querying

---

## 🛠 Tech Stack

* ☕ Java
* 🌱 Spring Boot
* 🗄 Spring Data JPA
* 🐬 MySQL
* 📡 REST API
* 🧪 Postman

---

## 📦 Spring Initializr Dependencies

### Required

* Spring Web
* Spring Data JPA
* MySQL Driver

### Optional (Recommended)

* Lombok
* Spring Boot DevTools

---

## 🔧 application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🧪 Postman Testing Examples

### ➤ Add Student (POST)

`http://localhost:8080/api/students`

```
{
  "name": "Manoj",
  "age": 21,
  "city": "Pune",
  "marks": 88.5
}
```

### ➤ Get All Students (GET)

`http://localhost:8080/api/students`

### ➤ Get Student by ID (GET)

`http://localhost:8080/api/students/1`

### ➤ Update Student (PUT)

`http://localhost:8080/api/students/1`

```
{
  "name": "Manoj Gavhane",
  "age": 22,
  "city": "Mumbai",
  "marks": 92
}
```

### ➤ Delete Student (DELETE)

`http://localhost:8080/api/students/1`

### ➤ Get Students by City

`http://localhost:8080/api/students/city/Pune`

### ➤ Search Students by Name (LIKE Search)

`http://localhost:8080/api/students/search/man`

### ➤ Students with Marks > Value

`http://localhost:8080/api/students/marks/greater/80`

### ➤ Students with Marks < Value

`http://localhost:8080/api/students/marks/less/50`

### ➤ Count Total Students

`http://localhost:8080/api/students/count`

---

## ⭐ Show Support

If this project helped you, consider giving it a ⭐ on GitHub!

---

## 👨‍💻 Author

**Manoj** – Java | Spring Boot Developer 🚀
