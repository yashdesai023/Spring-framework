# Student Management System (Spring ORM)

Welcome to the **Student Management System**, a CRUD-based application built using **Spring ORM, Hibernate, and MySQL**. This project showcases my expertise in **Spring Framework, Hibernate, ORM, and database management**, making it a valuable addition to my portfolio for recruiters.

---
## 📌 Project Overview
This is a **CRUD (Create, Read, Update, Delete) application** that allows users to manage student records. The project follows a layered architecture, ensuring maintainability and scalability.

### 🛠 Tech Stack
- **Spring Framework** (Spring ORM, Spring JDBC, Hibernate)
- **Hibernate** (ORM for database interactions)
- **MySQL** (Relational Database Management System)
- **Java** (Core programming language)

### ✨ Features
- **Add new students** with unique IDs, names, and city details.
- **Retrieve all students** from the database.
- **Get details of a single student** based on their ID.
- **Update student details** including name and city.
- **Delete a student** from the database.
- **User-friendly console interface** for interaction.

---
## 📂 Project Structure
The project is organized as follows:

```
Spring-framework/springorm/src/main/java/
│── dao/
│   ├── StudentDao.java        # Data Access Object for Student Entity
│
│── entities/
│   ├── Student.java           # Student Entity with JPA Annotations
│
│── factory/
│   ├── HibernateTemplateFactoryBean.java  # Hibernate Template Factory Bean
│
│── springorm/
│   ├── Test.java              # Main class to run the application
│   ├── config.xml             # Spring Configuration File
```

---
## 🚀 Getting Started

### 📌 Prerequisites
Ensure you have the following installed on your system:
- **Java (JDK 17 or higher)**
- **Maven** (For dependency management)
- **MySQL** (Database setup)

### 🛠 Installation Steps

1. **Clone the Repository**:
```bash
git clone https://github.com/yourusername/student-management-system.git
cd student-management-system
```

2. **Database Setup**:
   - Create a MySQL database named `springjdbc`.
   - Update the database credentials in `config.xml`:
```xml
<property name="url" value="jdbc:mysql://localhost:3306/springjdbc" />
<property name="username" value="root" />
<property name="password" value="your_password" />
```

3. **Build the Project**:
```bash
mvn clean install
```

4. **Run the Application**:
```bash
mvn exec:java -Dexec.mainClass="springorm.Test"
```

---
## 🔹 Usage

Once the application is running, use the console menu to interact with student records:

1️⃣ **Add a Student** - Enter student details when prompted.
2️⃣ **View All Students** - Displays a list of students in the database.
3️⃣ **Get Student Details** - Fetch a specific student's information by entering their ID.
4️⃣ **Update Student** - Modify an existing student's details.
5️⃣ **Delete Student** - Remove a student record permanently.
6️⃣ **Exit** - Close the application.

---
## 🏆 Skills Demonstrated
- **Java Development**: Implemented an object-oriented CRUD system.
- **Spring ORM & Hibernate**: Integrated Hibernate for ORM and transaction management.
- **MySQL Database Management**: Used SQL queries and relational data storage.

---
## 💡 Acknowledgements
- [Spring Documentation](https://spring.io/projects/spring-framework)
- [Hibernate Documentation](https://hibernate.org/)

---


