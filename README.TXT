PROJECT TITLE: University Course Management System

PURPOSE OF PROJECT:
The University Course Management System is a Java-based project that manages information about students and courses at a university. It provides functionality to add students and courses, enroll students in courses, search for courses, and retrieve statistics for undergraduate (UG) and postgraduate (PG) students.

VERSION or DATE: 2022

HOW TO START THIS PROJECT:
To start this project, you can run the "Main" class, which serves as the entry point for the system. It contains a "run" method that initializes the system, adds sample students, courses, and demonstrates various functionalities. Running the "Main" class will display the output in the console, showing the results of different operations.

AUTHORS:
The project was developed by [Your Name Here].

USER INSTRUCTIONS:

Running the Project:

Compile and run the "Main" class to start the University Course Management System.
The program will automatically add sample students and courses to the database.
It will demonstrate the registration process and display statistics for UG and PG students.
Adding Students:

To add a new student, create an instance of the "UG" or "PG" class with the required details (id, name, age).
Use the "addStudent" method of the "Database" class to add the student to the database.
Adding Courses:

To add a new course, create an instance of the "Course" class with the required details (title, convener).
Use the "addCourse" method of the "Database" class to add the course to the database.
Student Registration:

To register a student for a course, use the "registration" method of the "Database" class.
Pass the student and course title as parameters to enroll the student in the course.
Finding Courses:

To find a course by its title, use the "findCourse" method of the "Database" class.
Pass the course title as a parameter to retrieve the course details.
Retrieving Student Statistics:

To get statistics for UG and PG students, use the "printStatsOfStudents" method of the "Database" class.
Pass the class type (UG.class or PG.class) to display the total number and average age of students.