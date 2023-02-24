# Students Reporting System 
Students Reporting System  spring boot application


![2287166](https://user-images.githubusercontent.com/105989482/221112361-f3769c31-1993-479e-ab49-b91f150c5d8e.jpg)


## About
This student management api build to manage the students records and Reports  in the database which make a hassle free management . 


## Features

- Student can be resistered
- User can see Average Percentage of whole class in recent semester
- User can Average marks of Students in a subject
- User Top 2 Consistent Students across all semesters (Maximum average marks)


## Technologies and Dependencies Used
- Java (Efficient language to handle backend operations)
- Spring Boot (used to build hassle free web applications and writing REST APIs.)
- Spring Data JPA (Used to reduce the time of writing hardcoded sql queries and instead allows to write much more readable and  scalable code )
- MySQL (used as a Java persistence store)
- JSP UI 
- Maven (used as a dependency management tool.)

## Backend Design 

###  Tables in database

![tables](https://user-images.githubusercontent.com/105989482/221114148-7305a62d-4f7a-46cd-aa17-192be206cbb3.png)


-Description of Student table

![student](https://user-images.githubusercontent.com/105989482/221114178-eb695cc3-8f33-48d3-8791-cd84f9b47602.png)


-Description of Semester table

![semester](https://user-images.githubusercontent.com/105989482/221114208-01764b38-c8b3-471c-8dc5-fe9fda646b64.png)




###  Packages and classes

#### classes in Controller package
- StudentCotrollerForJsp class

#### Classes in Exception package

- StudentException 
- ErrorDetails
- GlobalException

#### Classes in Repository package

- StudentRepo 

#### Classes and Interfaces in Service package

- StudentService(Interface)
- StudentServiceImpl(Class)

## Installation & Run
- Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database configuration.

```
    server.port=8080

    spring.datasource.url=jdbc:mysql://localhost:3306/studentdb;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```

## API Root Endpoint
- To add a student
```
PUT "http://localhost:8080/students"
```
-To see Average Percentage of whole class in recent semester
```
PUT "http://localhost:8080/get_avg_students_marks"
```

-To see Average marks of Students in a subject
```
PUT "http://localhost:8080/get_avg_marks"
```

-To see top 2 Consistent Students across all semesters (Maximum average marks)
```
PUT "http://localhost:8080/top2ConstitentStudents"
```
