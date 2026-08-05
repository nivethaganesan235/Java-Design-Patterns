# Singleton Pattern - College Placement Cell Management System

A Java console application that demonstrates the **Singleton Design Pattern** using a college placement cell.

In a college, there should be only one Placement Cell responsible for managing all recruitment activities. This project ensures that only one PlacementCell object exists throughout the application.

## Features

- Add recruiting companies
- Prevent duplicate company entries
- Auto-generate Company IDs
- Search company by Company ID
- Update recruitment status
- View all companies
- Input validation
- Demonstrate Singleton using object hash code

## Project Structure

```
SingletonPattern
│
├── README.md
├── .gitignore
└── src
    └── singleton
        ├── Company.java
        ├── PlacementCell.java
        └── Main.java
```

## Design Pattern

**Singleton**

The `PlacementCell` class follows the Singleton Pattern by:

- Using a private constructor
- Providing a static `getInstance()` method
- Creating only one PlacementCell object

The application also displays the object's hash code to prove that every call to `getInstance()` returns the same instance.

## Sample Menu

```
1. Add Company
2. View Companies
3. Search Company
4. Update Recruitment Status
5. Display Singleton Instance
6. Exit
```

## Output

Screenshots of the application are available in the `screenshots` folder.