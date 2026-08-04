# Observer Pattern - College Placement Portal

## Overview

This project demonstrates the Observer Design Pattern using a console-based College Placement Portal.

The system allows students to subscribe to the placement cell and automatically receive notifications whenever a new placement drive is published. The placement cell acts as the subject, while students act as observers who are notified whenever placement updates are available.

## Design Pattern

Observer Pattern

## Features

- Register students with the placement cell
- Remove students from placement notifications
- Publish placement drives
- Automatic notification to registered students
- Individual notification inbox for each student
- Store multiple placement notifications
- Add multiple interview rounds for each company
- Display registered students
- View student-specific notifications
- Duplicate student registration prevention
- Menu-driven console application

## Implementation

The project consists of:

- Observer interface defining the update mechanism
- Subject interface defining observer management operations
- PlacementCell acting as the concrete subject
- Student acting as the concrete observer
- PlacementNotification class representing placement drive details
- Main class providing user interaction

## Technologies Used

- Java
- Object-Oriented Programming
- Observer Design Pattern
- Collections Framework (ArrayList)

## How It Works

1. Students register with the placement cell.
2. The placement cell maintains a list of registered students.
3. When a new placement drive is published, the placement cell creates a placement notification.
4. The notification is sent to all registered students through the observer update mechanism.
5. Each student stores the received notification in their personal inbox.
6. Students can view their individual placement notifications.

## Pattern Flow

Client → PlacementCell → Student Observers → Notification Inbox