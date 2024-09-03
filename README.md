# 📝 ToDo App with Spring Boot, Keycloak, Docker, JPA, and MySQL

Welcome to the ToDo App repository! This project is a simple yet powerful demonstration of how to integrate Keycloak with a Spring Boot application, leveraging Docker for containerization and JPA with MySQL for data persistence. The app allows users to create, view, edit, and delete tasks, with secure authentication and authorization managed by Keycloak.

## 🚀 Features

- **Create Tasks**: Add new tasks to your to-do list.
- **View Tasks**: See all your tasks at a glance.
- **Edit Tasks**: Update your tasks as needed.
- **Delete Tasks**: Remove tasks that are no longer needed.
- **Authentication and Authorization**: Secure user authentication and role-based access control using Keycloak.

## 🛠️ Tech Stack

- **Spring Boot**: The backbone of the application, providing a robust and scalable framework.
- **Keycloak**: Used as the authentication and authorization provider, making it easy to secure your application.
- **Docker**: Containerization tool to simplify deployment and environment consistency.
- **JPA (Java Persistence API)**: For data persistence, allowing smooth interaction with the MySQL database.
- **MySQL**: The relational database used to store tasks.

## 📚 Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- Java 11 or later
- Docker and Docker Compose
- MySQL
- Keycloak (can be run as a Docker container)

### Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/vikasrajputin/todo-app-keycloak-springboot.git
   cd todo-app-keycloak-springboot
   ```

2. **Set Up Keycloak**

   - Download and run the Keycloak Docker image:
     ```bash
     docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin keycloak/keycloak -Dstart-dev
     ```
   - Access Keycloak at `http://localhost:8080` and create a realm, client, and user roles as needed.
   - Configure the Spring Boot application to point to your Keycloak instance in the `application.properties` or `application.yml` file.

3. **Run the Application with Docker Compose**

   - Start the application and MySQL database using Docker Compose:
     ```bash
     docker-compose up --build
     ```

4. **Access the Application**

   - The application will be available at `http://localhost:8081`.
   - Keycloak will manage authentication, so log in using the credentials set up in the Keycloak admin console.

## 📂 Project Structure

- **src/main/java**: Contains the Java source code, including controllers, services, and repositories.
- **src/main/resources**: Configuration files, including `application.yaml` and static resources.
- **docker-compose.yml**: Docker Compose file to set up the entire application stack.
- **README.md**: You’re reading it! This file provides an overview and instructions for the project.

## 🌟 How to Use

1. **Log In**: Use Keycloak credentials to log in.
2. **Create a Task**: Navigate to the task creation page and add a new task.
3. **View Tasks**: See all your tasks listed.
4. **Edit a Task**: Modify an existing task as required.
5. **Delete a Task**: Remove tasks that you no longer need.


## 📜 License

This project is licensed under the Apache 2.0 License. See the [LICENSE](LICENSE) file for details.

---
