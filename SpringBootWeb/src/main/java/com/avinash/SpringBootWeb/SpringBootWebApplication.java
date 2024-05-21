package com.avinash.SpringBootWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//MVC
//Model View Controller

//Model
//The Model represents the data and business logic of the application. It is responsible for:
//Retrieving data from the database.
//Inserting and updating data in the database.
//Performing business logic operations on the data.
//In Java, the model can be represented by JavaBeans, POJOs (Plain Old Java Objects), or entities in an ORM (Object-Relational Mapping) framework like Hibernate.

//View
//The View represents the presentation layer.
// It displays the data to the user and sends user commands to the Controller.
// The view is concerned with how the data is presented to the user.
// In Java web applications, JSP (JavaServer Pages), Thymeleaf, or any other templating engine can be used to create the view.

//Controller
//The Controller acts as an intermediary between the Model and the View.
// It receives input from the user via the View, processes it (using the Model), and returns the output display to the View.
// The controller is responsible for:
//Handling user input.
//Calling the appropriate methods in the model.
//Choosing the view to display.

//in this project we use JSP
//JSP stands for Java Server Pages
//it is just like html, but there is java code in between
//we need to keep the jsp file in the WebApp folder in the Resources folder

//our application runs in the tomcat server
//but tomcat is able to run only java servlets
//but we work on jsp files, so automatically the jsp files are converted into the servlets by jasper
//so we need to add dependency in the pom file
//the jsp files are converted into servlets by jasper

//let's create a jsp file in the WebApp folder
//it acts as view technology

//let's create a Controller  class
@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootWebApplication.class, args);

	}

}

//first of all visit all the files later come to this matter
//actually in controller, we will define url mapping above methods
//in those methods we will return the jsp file names in string format with extension ex : "submit.jsp"
//jsp is not only a view technology we are having many other view technologies like, techleaf ect
//so in middle if we change our view technology, then we need to change the filenames extensions
//so to avoid that, we need to fix prefix and suffix in the application.properties file
//prefix refers to the folder name where the view technology files are present
//suffix refers to the extension of view technology
//common name we use the folder name is views inside WebApp folder, so prefix will be /views/
//for jsp the suffix will be ".jsp"
//the css files should be move to static folder
