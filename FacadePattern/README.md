# Facade Pattern - College Admission Portal

## Overview

This project demonstrates the **Facade Design Pattern** using a College Admission Portal.

The Facade Pattern provides a simplified interface to a complex system by hiding the interactions between multiple subsystems.

In this project, the student interacts only with the `CollegeAdmissionFacade`, which manages the complete admission process by coordinating different departments.

---

## Design Pattern

**Pattern:** Facade Pattern

**Category:** Structural Design Pattern

---

## Problem

A college admission process involves multiple departments:

- Admission Department
- Document Verification Department
- Fee Department
- Library Department
- Hostel Department
- ID Card Department

Without using the Facade Pattern, the client needs to interact with each department separately, increasing code complexity and dependency.

---

## Solution

The `CollegeAdmissionFacade` acts as a single entry point for the admission process.

The client only needs to call:

```java
facade.admitStudent(student);
```

The Facade internally manages communication between:

- Admission Approval
- Document Verification
- Fee Payment
- Library Registration
- Hostel Allocation
- ID Card Generation

This hides the complexity of the subsystem classes from the client.

---

## Features

- Console-based College Admission System
- Demonstrates Facade Design Pattern
- Student information handling
- Admission workflow management
- Document verification
- Fee payment validation
- Optional hostel allocation
- Library registration
- ID card generation
- Success and failure handling

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Eclipse IDE

---

## Learning Outcome

- Understanding Structural Design Patterns
- Implementing the Facade Pattern
- Reducing complexity using a single interface
- Improving communication between multiple classes
- Applying object-oriented design principles