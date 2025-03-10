# Judicial Publications Search Using PostgreSQL Full-Text Capabilities - Full Stack Application

![publications-angular-with-java](./Project-login.png)


## Overview
This project is a Java 17 + Angular 16 application designed for searching court publications and managing judicial case data. It includes a login screen with options for creating a new account and resetting passwords, as well as an authentication system with session expiration to enhance security.

On the backend, the application uses Spring Boot 3.3.4 with Spring Data JPA for database access, leveraging PostgreSQL Full-Text Search to enable efficient text-based searches within legal publications. Security is managed with Spring Security and JWT for authentication and authorization, ensuring controlled access to the RESTful API. The API is containerized using Docker, ensuring easy deployment and scalability.

On the frontend, the interface is developed with Angular 16, utilizing Angular Material for a modern and responsive user experience. The application is built with TypeScript, HTML5, and CSS3, ensuring performance and accessibility. Version control is handled with GitHub, utilizing CI/CD pipelines for continuous integration and delivery.

## Functional Overview
The application provides the following key functionalities:

**User Authentication & Access Management**
- Secure login with JWT-based authentication and session expiration
- User registration for new accounts
- Password recovery and change options

**Legal Publications Search**
- Advanced Full-Text Search in PostgreSQL to locate judicial publications efficiently
- Filtering and sorting options to refine search results

**Judicial Case Data Management**
- View and retrieve details about legal cases and court decisions
- Structured storage and access to case-related information

**RESTful API**
- Secure and scalable Spring Boot-based backend for data management
- Exposes endpoints for authentication, user management, and case data retrieval
- Containerized with Docker for easy deployment

**Modern Frontend Interface**
- Built with Angular 16 + Angular Material for an intuitive and responsive UI
- Optimized for usability and accessibility with TypeScript, HTML5, and CSS3

## Technologies Used

**Back-end**
1. **Java (version 17)**
2. **Maven**
3. **Spring Ecosystem**:
   - **Spring Boot**
   - **Spring Web**
   - **Spring Data JPA**
   - **Spring Security**
4. **JWT**
5. **Github CI/CD**
6. **Lombok**
7. **PostgreSQL**
8. **Full Text Search with Postgres**
9. **Docker**

**Front-end**
1. **Angular (version 16)**
2. **TypeScript**
3. **HTML5**
4. **CSS3**

## Prototype test version

<a href="https://publicationsapi-frontend-v0.onrender.com/login" target="_blank">Click here to access the test version</a>