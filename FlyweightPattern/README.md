# Flyweight Pattern - College Management System

## Overview

This project demonstrates the Flyweight Design Pattern using a console-based College Management System.

The system stores student details while sharing common department information such as department name, HOD, and building. Instead of creating duplicate department objects for every student, a single shared department object is reused, reducing memory usage.

## Design Pattern

Flyweight Pattern

## Features

- Add multiple students
- Shared department objects using the Flyweight Pattern
- Automatic reuse of existing department objects
- Case-insensitive department input
- Input validation for student ID and department
- Display all student details
- Display department cache
- Show total shared department objects
- Display student count for each department
- Menu-driven console application

## Implementation

The project consists of:

- Department interface representing the Flyweight
- CollegeDepartment as the concrete Flyweight
- DepartmentFactory responsible for creating and reusing shared department objects
- Student class representing the context with unique student information
- Main class acting as the client

## Technologies Used

- Java
- Object-Oriented Programming
- Flyweight Design Pattern
- Collections Framework (HashMap, ArrayList)

## How It Works

1. The user adds student details.
2. The DepartmentFactory checks whether a department object already exists.
3. If the department exists, the existing object is reused.
4. Otherwise, a new department object is created and stored in the factory.
5. Multiple students can share the same department object, minimizing memory usage.
6. The application can display all students and the current department cache.

## Pattern Flow

Client → DepartmentFactory → Shared Department Object → Student