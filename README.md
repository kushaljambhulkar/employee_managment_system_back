# Employee Management System

This project is a RESTful API built with Spring Boot for managing employees and their departments.

## Table of Contents

-   [Prerequisites](#prerequisites)
-   [Installation](#installation)
-   [Configuration](#configuration)
-   [Running the Application](#running-the-application)
-   [API Endpoints](#api-endpoints)
-   [Contributing](#contributing)
-   [License](#license)

## Prerequisites

Before you begin, ensure you have met the following requirements:

-   **Java Development Kit (JDK):**  Make sure you have JDK 17 or higher installed. You can check your Java version by running `java -version` in your terminal.
-   **Maven:** This project uses Maven for dependency management. Ensure you have Maven installed. You can check it by running `mvn -version` in your terminal.
-   **PostgreSQL:** This project uses PostgreSQL as the database. Ensure you have PostgreSQL installed and running on your local machine.
-   **Git:** You'll need Git to clone the repository.
-   **IDE (Optional):** An IDE like IntelliJ IDEA or Eclipse can be helpful, but it's not strictly required.

## Installation

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/yourrepository.git
    ```

    Replace `https://github.com/yourusername/yourrepository.git` with your project's Git repository URL.

2.  **Navigate to the project directory:**

    ```bash
    cd yourrepository
    ```

## Configuration

1.  **Database Setup:**
    -   Create a PostgreSQL database named `employee_db` (or any other name you prefer).
    -   Create a user with username `postgres` (or any name you prefer) and the password you'll specify in the `application.properties` file.
    -   Grant all privileges to the user on the `employee_db` database.

2.  **application.properties:**
    -   Open the `src/main/resources/application.properties` file.
    -   Modify the following properties to match your PostgreSQL setup:

    ```properties
    server.port=8080

    spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
    spring.datasource.username=postgres
    spring.datasource.password=your_db_password
    spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
    spring.jpa.database=POSTGRESQL
    spring.datasource.driver-class-name=org.postgresql.Driver
    spring.jpa.hibernate.ddl-auto = update
    ```

        -   `server.port`: The port on which the application will run (default is 8080).
        -   `spring.datasource.url`: The URL for your PostgreSQL database. If your database is running on a different port or host, adjust accordingly.
        -   `spring.datasource.username`: Your PostgreSQL database username.
        -   `spring.datasource.password`: Your PostgreSQL database password. **Make sure to replace `your_db_password` with the actual password.**
        -   `spring.jpa.hibernate.ddl-auto`:
            -   `update`: This is the recommended setting for development. It will update the database schema if the entities change.
            - `create`: used to create table
            - `none`: use if there is no change in schema
            - `create-drop`: used to create table when application start and delete when application stop.

3. **Frontend Setup**
    - If you have frontend for this project please follow the instruction of the that project and run that app in seprate port as this project running in 8080.
    - If you are using ReactJS in your frontend make sure that you can change your url in you axios call or any library in your project.
    - For Example : if your backend running in localhost:8080 and your frontend running in 3000.
    - then you need to change like this, `const url = "http://localhost:8080/api/employees/all"`

## Running the Application

1.  **Build the project:**

    ```bash
    mvn clean install
    ```

2.  **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

    Alternatively, if you're using an IDE, you can run the `DemoApplication` class directly.

3. **Testing the application**
    - After the application is running, you can use tools like Postman or curl to test the API endpoints.

## API Endpoints

Here are the available API endpoints:

-   **POST /api/employees:** Create a new employee.
-   **GET /api/employees/{id}:** Get an employee by ID.
-   **GET /api/employees/all:** Get all employees.
-   **PUT /api/employees/{id}:** Update an employee.
-   **DELETE /api/employees/{id}:** Delete an employee.

## Contributing

If you'd like to contribute to this project, please follow these steps:

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/your-feature`).
3.  Make your changes and commit them (`git commit -am 'Add some feature'`).
4.  Push to the branch (`git push origin feature/your-feature`).
5.  Create a new pull request.

