# Employee Management System 🧑‍💼

A simple **Employee Management System** built using **Spring Boot**, **Spring MVC**, **Thymeleaf**, and **MySQL**.  
This project demonstrates full **CRUD operations** (Create, Read, Update, Delete) on Employee data with a clean MVC architecture.

---

## ✨ Features

- Add new employees
- View all employees in a list
- Update employee details
- Delete employees
- Integration with MySQL using Spring Data JPA
- Thymeleaf-based views for UI
- Hot reload support with Spring DevTools

---

## 🧰 Tech Stack

**Backend:**
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA

**Frontend:**
- Thymeleaf
- HTML5, CSS3


**Database:**
- MySQL

**Other Dependencies:**
- Spring Web
- Lombok
- Spring Boot DevTools
- MySQL Driver
- Thymeleaf

---

## 📁 Project Structure (High Level)

```text
src/
 └── main/
     ├── java/
     │   └── com.example.employeemanagement/
     │       ├── controller/    # Spring MVC Controllers
     │       ├── entity/        # JPA Entities (e.g., Employee)
     │       ├── repository/    # Spring Data JPA Repositories
     │       └── service/       # Service Layer (Business Logic)
     └── resources/
         ├── templates/         # Thymeleaf HTML templates
         ├── static/            # CSS, JS, images
         └── application.properties

