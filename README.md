## Spring Boot Web Application

This repository contains a simple Spring Boot web application that demonstrates the Model-View-Controller (MVC) architecture using JSP as the view technology. The application includes basic request handling, parameter passing, and view rendering using JSP.

### Table of Contents

- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Running the Application](#running-the-application)
- [Key Components](#key-components)
- [Controller](#controller)
- [JSP Views](#jsp-views)
- [Configuration](#configuration)

### Introduction

This application is built using the Spring Boot framework and follows the MVC design pattern. It uses JSP for the view layer and demonstrates various methods to handle user input and display data.

### Project Structure

The project structure is as follows:

```
SpringBootWeb
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── avinash
│   │   │           └── SpringBootWeb
│   │   │               ├── Servlet.java
│   │   │               └── SpringBootWebApplication.java
│   │   ├── resources
│   │   │   ├── static
│   │   │   │   └── (CSS files)
│   │   │   ├── templates
│   │   │   │   └── (HTML files)
│   │   │   └── application.properties
│   │   └── webapp
│   │       └── WEB-INF
│   │           └── views
│   │               ├── index.jsp
│   │               ├── submit.jsp
│   │               └── result.jsp
└── pom.xml
```

### Running the Application

To run the application, use the following command:

```bash
mvn spring-boot:run
```

Access the application at `http://localhost:8080`.

### Key Components

#### Controller

The `Servlet.java` file contains the main controller logic. It handles different types of requests and demonstrates how to pass data to JSP views using `HttpServletRequest`, `HttpSession`, `Model`, and `ModelAndView`.

#### JSP Views

JSP files are used to render the view layer of the application. These files are located in the `webapp/WEB-INF/views` directory.

### Configuration

#### `application.properties`

The `application.properties` file is used to configure view resolution:

```properties
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

### Example Controller

Here is a brief explanation of the main controller methods in `Servlet.java`:

- **home()**: Maps the root URL (`/`) to the `index.jsp` view.
- **submit()**: Handles form submissions and demonstrates different ways to access request parameters and pass data to the view.
- **result()**: Maps the `/result` URL to the `result.jsp` view.


### JSP Views

- **index.jsp**: Initial form for user input.
- **submit.jsp**: Displays the submitted user data.
- **result.jsp**: A result page for additional processing.

### Conclusion

This project demonstrates a simple Spring Boot web application using JSP for the view layer. It shows how to handle user input and pass data between different layers using Spring MVC components like `HttpServletRequest`, `HttpSession`, `Model`, and `ModelAndView`.

Feel free to explore and modify the code to understand the concepts better. For any questions or issues, please create an issue in this repository.
