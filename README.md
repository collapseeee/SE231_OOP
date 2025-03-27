# Java Object-Oriented Programming Lab Exercises

This repository contains a collection of Java programs created for OOP lab exercises. The programs demonstrate various fundamental concepts in Java OOP programming, organized by lab sessions.

## Repository Structure

The repository is organized into separate lab folders (Lab01 through Lab11 included 2 LabExams), each containing Java programs that focus on specific programming concepts.

### Lab01: Basic Java Programs Recall
- **CheckpointOne.java**: Calculates total amount if deposit doubly each day for a month
- **CheckpointTwo.java**: Calculates how many days to deposit doubly each day to reach 1 million
- **CheckpointThree.java**: Receives 3x4 array from user and calculates sum of each row

### Lab02: Object and Classes
- **Car**: Creates a Car class with getter and setter then create Car objects with given attributes in the main class
- **Dog**: Creates a Dog class with getter and setter then create a Dog object with given attributes in the main class
- **Rectangle**: Creates a Rectangle class with area, perimeter calculation methods then create Rectangle objects with given attributes in the main class

### Lab03: Encapsulation
- **Counter**: Creates a Counter class with private count attribute that update its value via click method.
- **Stock**: Create a Stock class with given behaviors

### Lab04: More Classes Methods
- **Checkpoint1.java**: Uses Date class and toString method
- **Checkpoint2.java**: Uses Random class to create a random object with a seed to demonstrate psseudo random
- **Checkpoint3.java**: Uses Random class with Math class to calcurate random values of trigonometric.

### Lab05: Inheritance
- **Shape.java & TestShape.java**: Demonstrates inheritance with a Shape base class and Circle and Rectangle subclasses, implementing area, perimeter, and string representation methods

### Lab06: Polymorphism
- **Account.java & TestAccount.java**: Models a bank account with attributes like ID, balance, and annual interest rate, allowing withdrawals, deposits, and interest calculations.
- **Publishing.java & TestPublishing.java**: Demonstrates run-time polymorphism (overriding)
- **ArrayObject.java** Demonstrates storing object in array list.

### Lab07: Abstraction
- **Geometric**: Demonstrates abstraction using an abstract class GeometricObject.java and Triangle.java that overriding GeometricObject
- **Library**: Demonstrates abstraction using an abstract class LibraryItems.java and Resources.java that overriding LibraryItems

### Lab08: Interface
- **ColorableInterfaceLab**: Demonstrates using interface with abstract class
- **ComparableCircleInterfaceLab**: Overloading the compareTo method and demonstrates using interface with abstract class
- **KeyValueStorageComparisonInterface**: Demonstrates using Dictionary and Map.

### Lab09: Exception
- **ArrayIndexOutOfBoundLab**: Handles ArrayIndexOutOfBound using try catch
- **InputMismatchExceptionLab**: Handles InputMismatchException using try catch cooperate with do-while
- **IllegalTriangleExceptionLab**: Creates a new IllegalTriagleException class and throws it

### Lab10: GUI
- **SimpleCalculator.java**: Creates a simple calculator using javax swing components
- **SimpleCalculatorWithMenu.java**: Creates a simple calculator with 2 modes using javax swing components and card layout
- **SimpleForm.java**: Creates a simple form using javax swing components

### Lab11: IO
- **RandomIntegerWriter.java**: Prints all interger in the file if the file exist, else creates a file and write 100 random integers into its
- **ScoreProcessing.java**: Reads all the integer from the given file name, and find the total score and average of them

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or a text editor

### Running the Programs
1. Clone this repository
2. Navigate to the program directory
3. Compile the Java file: `javac ProgramName.java`
4. Run the compiled program: `java ProgramName`

## Key Concepts Covered

- Pre-defined Classes: java.util.Date and java.util.Random.
- Object-class relationship
- Encapsulation
- Inheritant
- Polymorphism
- Abstraction
- Interface
- GUI using javax.swing and java.util.awt
- IO stream

## Learning Path

This repository follows a progressive learning path, starting with basic concepts and gradually introducing more complex programming elements. It's suitable for beginners learning Java programming fundamentals.
