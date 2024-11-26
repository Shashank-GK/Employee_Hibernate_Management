
# EmployeeHibernateManagement

## Introduction
**EmployeeHibernateManagement** is a Java-based project that demonstrates how to perform CRUD (Create, Read, Update, Delete) operations on an employee database using Hibernate ORM framework. It serves as a learning resource for understanding Hibernate with MySQL and Java.

## Project Idea
The primary goal of this project is to provide a practical example of:
- Connecting a Java application with a MySQL database using Hibernate.
- Performing database operations such as inserting, reading, updating, and deleting employee records.
- Following a clean and modular structure for scalable applications.

## Features
- Add a new employee to the database.
- Delete an employee record using their ID.
- Placeholder for additional features: Find Employee by ID and Update Employee Details.

## Project Structure
```
EmployeeHibernate/
├── src/main/java/
│   ├── com.jsp.jdbc.EmployeeHibernate/
│   │   ├── App.java                  # Entry point for the application.
│   │   ├── Employee.java             # POJO class representing the Employee entity.
│   │   ├── EmployeeDAO.java          # Contains methods for CRUD operations.
│   ├── Hibernate.cfg.xml             # Hibernate configuration file for database connection.
├── src/test/java/                    # Placeholder for unit test cases (future implementation).
├── pom.xml                           # Maven configuration file.
```

### Functionality of Key Files
- **App.java**:
  - Handles user input through a menu-driven interface.
  - Invokes appropriate CRUD operations based on user choice.

- **Employee.java**:
  - Maps to the Employee table in the database using Hibernate annotations.
  - Contains fields like `empId`, `empName`, `empEmail`, etc.

- **EmployeeDAO.java**:
  - Provides the implementation of CRUD operations:
    - `addEmployee()`: Adds a new employee record to the database by taking user inputs like ID, name, email, designation, salary, and age.
    - `fetchDetailsEmployee()`: Fetches the details of an employee record from the database using their ID.
    - `updateEmployee()`: Updates the details of an employee record by ID, allowing changes to fields like name, email, designation, salary, and age.
    - `deletEmployee()`: Deletes an employee record from the database using their ID.

- **Hibernate.cfg.xml**:
  - Configuration file for Hibernate, specifying database connection details.

## Usage
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/EmployeeHibernateManagement.git
   ```
2. Import the project into your IDE (e.g., Eclipse or IntelliJ).
3. Ensure you have a MySQL database set up and update the database credentials in `Hibernate.cfg.xml`.
4. Run the `App.java` file to start the application.
5. Follow the prompts to perform CRUD operations.

## Prerequisites
- Java 8 or higher
- MySQL Database
- Maven
- IDE like Eclipse or IntelliJ IDEA

## Future Enhancements
- Include unit test cases for all methods.
