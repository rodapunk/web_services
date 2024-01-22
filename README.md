# Web service project
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/rodapunk/web_service/blob/main/LICENSE) 

# About the project
This project aimed to build the backend of a web service using the Spring Boot framework with Java language. The implementation followed a domain model and a logical layer structure, including resources (rest controllers) that represent the application interface with the backend, as well as services and repositories. Additionally, a test database was configured and populated using H2, a memory-based database suitable for Java testing scenarios. The development encompassed the creation of CRUD operations (Create, Retrieve, Update, and Delete) and the implementation of exception handling.

For the application execution, the Apache Tomcat web container was adopted, and Maven was used for dependency management. Request tests were conducted through Postman, providing a comprehensive assessment of the system's functionality.

It is worth noting that considerations regarding the production environment, such as the possibility of migrating to a relational database (e.g., PostgreSQL) and using the Heroku platform for application deployment, are perspectives for future implementations and were not carried out during the execution of this project. These options are suggested to enhance scalability and availability in a production environment.

# Domain model
![Domain model](https://github.com/rodapunk/assets/blob/main/web_services/modelo_conceitual.png)

# Technologies Used
- Java
- Spring Boot
- Apache Tomcat
- JPA / Hibernate
- Maven
- H2
- Postman

# Possible Technologies for the Production Environment
- PostgreSQL
- Heroku

# Author
Estevan Christ Machry
