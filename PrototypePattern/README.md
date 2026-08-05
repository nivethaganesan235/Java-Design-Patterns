# Prototype Pattern - College Admission Form Generator

## Overview

This project demonstrates the Prototype Design Pattern using a console-based College Admission Form Generator.

The system stores predefined admission form templates for different departments. Instead of creating new admission forms from scratch, the application clones an existing prototype template and allows users to enter student-specific information. This reduces object creation effort while preserving common details across admission forms.

## Design Pattern

Prototype Pattern

## Features

- Menu-driven console application
- Predefined admission form templates
- Clone existing form templates
- Generate unique admission forms
- Auto-generated Form IDs
- Template ID for each prototype
- Student name validation
- Roll number validation
- Department validation
- Display available prototype templates
- Store generated admission forms
- Display all generated admission forms

## Implementation

The project consists of:

- Prototype interface defining the clone operation
- AdmissionForm class acting as the concrete prototype
- FormRegistry class storing and managing prototype templates
- Main class providing user interaction

## Technologies Used

- Java
- Object-Oriented Programming
- Prototype Design Pattern
- Collections Framework (HashMap, ArrayList)

## How It Works

1. The Form Registry creates and stores prototype admission form templates for different departments.
2. The user selects a department.
3. The registry returns a cloned copy of the selected prototype.
4. Student-specific details such as name and roll number are added to the cloned form.
5. The generated admission form is stored and can be viewed later.
6. The original prototype templates remain unchanged and can be reused to generate additional forms.

## Pattern Flow

Client → FormRegistry → Prototype Template → Clone → Admission Form