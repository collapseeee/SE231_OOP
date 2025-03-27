# **Java Object-Oriented Programming Lab Exercises**  

This repository contains a collection of Java programs developed for Object-Oriented Programming (OOP) lab exercises. Each lab focuses on fundamental Java OOP concepts, progressing from basic principles to more advanced topics.  

## **Repository Structure**  

The repository is organized into separate lab folders (Lab01 through Lab11, including two lab exams). Each folder contains Java programs that demonstrate specific programming concepts.  

---

### **Lab01: Basic Java Program Recall**  
- **CheckpointOne.java** – Calculates the total amount when a deposit doubles each day for a month.  
- **CheckpointTwo.java** – Determines how many days it takes for a doubling deposit to reach 1 million.  
- **CheckpointThree.java** – Accepts a 3x4 array from the user and calculates the sum of each row.  

### **Lab02: Objects and Classes**  
- **Car.java** – Defines a `Car` class with getters and setters and creates `Car` objects with given attributes.  
- **Dog.java** – Defines a `Dog` class with getters and setters and creates a `Dog` object with given attributes.  
- **Rectangle.java** – Implements a `Rectangle` class with area and perimeter calculation methods and creates `Rectangle` objects.  

### **Lab03: Encapsulation**  
- **Counter.java** – Implements a `Counter` class with a private `count` attribute updated via a `click` method.  
- **Stock.java** – Creates a `Stock` class with specified behaviors.  

### **Lab04: More Methods and Built-in Classes**  
- **Checkpoint1.java** – Demonstrates the `Date` class and `toString()` method.  
- **Checkpoint2.java** – Uses the `Random` class to create a seeded pseudo-random number generator.  
- **Checkpoint3.java** – Uses the `Random` and `Math` classes to generate random trigonometric values.  

### **Lab05: Inheritance**  
- **Shape.java & TestShape.java** – Demonstrates inheritance with a `Shape` base class and `Circle` and `Rectangle` subclasses, implementing area, perimeter, and string representation methods.  

### **Lab06: Polymorphism**  
- **Account.java & TestAccount.java** – Models a bank account with attributes like ID, balance, and annual interest rate, allowing withdrawals, deposits, and interest calculations.  
- **Publishing.java & TestPublishing.java** – Demonstrates runtime polymorphism (method overriding).  
- **ArrayObject.java** – Demonstrates storing objects in an ArrayList.  

### **Lab07: Abstraction**  
- **Geometric.java & Triangle.java** – Implements abstraction using an abstract class (`GeometricObject`) and its subclass (`Triangle`).  
- **Library.java & Resources.java** – Demonstrates abstraction using an abstract class (`LibraryItems`) and a subclass (`Resources`).  

### **Lab08: Interfaces**  
- **ColorableInterfaceLab.java** – Implements an interface with an abstract class.  
- **ComparableCircleInterfaceLab.java** – Overloads the `compareTo()` method and demonstrates interface usage with an abstract class.  
- **KeyValueStorageComparisonInterface.java** – Demonstrates `Dictionary` and `Map` usage.  

### **Lab09: Exception Handling**  
- **ArrayIndexOutOfBoundsLab.java** – Handles `ArrayIndexOutOfBoundsException` using `try-catch`.  
- **InputMismatchExceptionLab.java** – Handles `InputMismatchException` using `try-catch` in a `do-while` loop.  
- **IllegalTriangleExceptionLab.java** – Defines a custom `IllegalTriangleException` class and throws it.  

### **Lab10: GUI (Graphical User Interface)**  
- **SimpleCalculator.java** – Creates a simple calculator using `javax.swing` components.  
- **SimpleCalculatorWithMenu.java** – Enhances the calculator with multiple modes using `javax.swing` and `CardLayout`.  
- **SimpleForm.java** – Creates a basic form using `javax.swing` components.  

### **Lab11: File I/O (Input/Output)**  
- **RandomIntegerWriter.java** – Reads integers from a file (if it exists); otherwise, it creates the file and writes 100 random integers.  
- **ScoreProcessing.java** – Reads integers from a file, then calculates and displays the total score and average.  

---

## **Getting Started**  

### **Prerequisites**  
- Java Development Kit (JDK) 8 or higher  
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or a text editor  

### **Running the Programs**  
1. Clone this repository:  
   ```bash
   git clone https://github.com/your-repo-url.git
   ```
2. Navigate to the program directory:  
   ```bash
   cd LabXX  # Replace XX with the specific lab number
   ```
3. Compile the Java file:  
   ```bash
   javac ProgramName.java
   ```
4. Run the compiled program:  
   ```bash
   java ProgramName
   ```  

---

## **Key Concepts Covered**  

- Pre-defined classes (`java.util.Date`, `java.util.Random`)  
- Object-Class Relationship  
- Encapsulation  
- Inheritance  
- Polymorphism  
- Abstraction  
- Interfaces  
- GUI Development (`javax.swing`, `java.awt`)  
- File I/O (`java.io`)  
- Exception Handling  

---

## **Learning Path**  

This repository follows a structured learning path, gradually introducing Java programming concepts. It is designed for beginners and intermediate learners to build a strong foundation in Java OOP.  
