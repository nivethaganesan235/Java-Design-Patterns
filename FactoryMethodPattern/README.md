# Factory Method Pattern - College Report System

## Overview

This project demonstrates the Factory Method Design Pattern using a console-based College Report System.

The system generates different types of student reports such as:

- Student Academic Report
- Attendance Report
- Placement Report

The Factory Method pattern is used to create report objects without tightly coupling the client code with concrete report classes.

## Design Pattern

Factory Method Pattern

## Features

- Generate different types of student reports
- User input-based student details
- Generate multiple reports without re-entering details
- Input validation for student ID, CGPA, and attendance
- Menu-driven console application

## Implementation

The project consists of:

- Report interface that defines report generation behavior
- Concrete report classes implementing different report types
- ReportFactory as the abstract creator
- Concrete factories responsible for creating specific reports
- Student class to store student information
- Main class acting as the client

## Technologies Used

- Java
- Object-Oriented Programming
- Factory Method Design Pattern

## How It Works

1. Student details are collected from the user.
2. The user selects the required report type.
3. The corresponding factory creates the required report object.
4. The generated report displays student information.

## Pattern Flow

Client → Factory → Concrete Factory → Report Object → Generate Report