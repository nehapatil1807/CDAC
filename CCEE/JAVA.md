## Chat history

### Previous 7 Days

### Previous 30 Days

Sure! Please share the topics you'd like me to explain. I'll provide detailed explanations, examples, and visual aids like diagrams, flowcharts, code snippets, or photos wherever applicable. Let me know the depth and format you prefer!

Here’s a detailed explanation of each topic, along with diagrams, flowcharts, and examples to clarify concepts.

### 1. Introduction to Java

Java is a high-level, object-oriented programming language developed by James Gosling at Sun Microsystems in 1995. It's designed for platform independence, meaning Java code can run on any device that supports the Java Virtual Machine (JVM). The famous principle of Java is Write Once, Run Anywhere (WORA).

```
javaCopy codepublic class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 2. Features of Java

Java has many features that make it popular:



### 3. JVM Architecture

The Java Virtual Machine (JVM) is a crucial component of Java that allows platform independence. It converts bytecode into machine code specific to the underlying hardware.

```
.class
```



### 4. JDK and its Usage

The Java Development Kit (JDK) is a software development kit used to write and run Java applications. It includes:

```
javac
```

```
jdb
```

```
.java
```

```
javac
```

```
java
```

```
makefileCopy codebin/       # Binary files (java, javac)
lib/       # Core libraries
include/   # Header files for JNI
jre/       # Java Runtime Environment
```

```
bin/       # Binary files (java, javac)
lib/       # Core libraries
include/   # Header files for JNI
jre/       # Java Runtime Environment
```

### 5. Structure of a Java Class

A typical Java class contains fields (variables), methods (functions), and a main method for execution.

```
main
```

```
javaCopy code// FileName: Student.java
public class Student {   // Class declaration
    int id;              // Field
    String name;

    public void display() {   // Method
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student(); // Object creation
        s.id = 101;
        s.name = "John";
        s.display();
    }
}
```

```
// FileName: Student.java
public class Student {   // Class declaration
    int id;              // Field
    String name;

    public void display() {   // Method
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student(); // Object creation
        s.id = 101;
        s.name = "John";
        s.display();
    }
}
```

```
public class Student
```

```
int id
```

```
String name
```

```
display()
```

```
yamlCopy codeID: 101, Name: John
```

```
ID: 101, Name: John
```

### 6. Working with Data Types: Primitive Data Types

Java has 8 primitive data types:

```
byte
```

```
byte b = 10;
```

```
short
```

```
short s = 100;
```

```
int
```

```
int i = 1000;
```

```
long
```

```
long l = 10000L;
```

```
float
```

```
float f = 10.5f;
```

```
double
```

```
double d = 20.5;
```

```
char
```

```
char c = 'A';
```

```
boolean
```

```
false
```

```
boolean b = true;
```

```
javaCopy codepublic class DataTypesDemo {
    public static void main(String[] args) {
        int age = 25;
        double salary = 55000.75;
        char grade = 'A';
        boolean isEmployed = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
    }
}
```

```
public class DataTypesDemo {
    public static void main(String[] args) {
        int age = 25;
        double salary = 55000.75;
        char grade = 'A';
        boolean isEmployed = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
    }
}
```

```
vbnetCopy codeAge: 25
Salary: 55000.75
Grade: A
Employed: true
```

```
Age: 25
Salary: 55000.75
Grade: A
Employed: true
```

Let me know if you'd like more examples, deeper details, or clarifications on any of these topics!

Here’s a detailed explanation of the requested topics:

### 1. Java Tokens

Java tokens are the smallest units of a Java program. These include keywords, identifiers, literals, operators, punctuators, and comments.

Keywords: Reserved words with a predefined meaning in Java (e.g., int, class, if).

```
int
```

```
class
```

```
if
```

```
public class Example {}
```

Identifiers: Names used for variables, methods, classes, etc.

```
_
```

```
$
```

```
int myVariable;
```

Literals: Constant values assigned to variables.

```
10
```

```
'A'
```

```
"Hello"
```

```
true
```

Operators: Symbols used to perform operations (+, -, *).

```
+
```

```
-
```

```
*
```

Punctuators: Symbols like {}, ;, (), etc.

```
{}
```

```
;
```

```
()
```

Comments: Ignored by the compiler.

```
// This is a comment
```

```
/* This is a multi-line comment */
```

### 2. Declaring Variables and Methods

Variables are declared with a data type and an identifier.

```
javaCopy code// Syntax: dataType variableName = value;
int age = 25;
double salary = 50000.5;
String name = "John";
```

```
// Syntax: dataType variableName = value;
int age = 25;
double salary = 50000.5;
String name = "John";
```

Methods are declared with a return type, name, and parameters.

```
javaCopy code// Syntax: returnType methodName(parameters) { // body }
public int add(int a, int b) {
    return a + b;
}
```

```
// Syntax: returnType methodName(parameters) { // body }
public int add(int a, int b) {
    return a + b;
}
```

```
javaCopy codepublic class VariableMethodExample {
    int x = 10; // Instance variable

    public int multiply(int a, int b) { // Method
        return a * b;
    }

    public static void main(String[] args) {
        VariableMethodExample obj = new VariableMethodExample();
        System.out.println(obj.multiply(5, 3));
    }
}
```

```
public class VariableMethodExample {
    int x = 10; // Instance variable

    public int multiply(int a, int b) { // Method
        return a * b;
    }

    public static void main(String[] args) {
        VariableMethodExample obj = new VariableMethodExample();
        System.out.println(obj.multiply(5, 3));
    }
}
```

Output: 15

```
15
```

### 3. Data Type Compatibility

Java enforces strict type compatibility, but it allows type casting and type promotion in certain cases.

```
int → long → float → double
```

```
javaCopy codeint x = (int) 10.5; // Explicit casting
```

```
int x = (int) 10.5; // Explicit casting
```

```
javaCopy codepublic class TypeCompatibility {
    public static void main(String[] args) {
        int x = 10;
        double y = x; // Widening
        System.out.println(y); // Output: 10.0

        double z = 12.34;
        int w = (int) z; // Narrowing
        System.out.println(w); // Output: 12
    }
}
```

```
public class TypeCompatibility {
    public static void main(String[] args) {
        int x = 10;
        double y = x; // Widening
        System.out.println(y); // Output: 10.0

        double z = 12.34;
        int w = (int) z; // Narrowing
        System.out.println(w); // Output: 12
    }
}
```

### 4. Operators

Java supports various operators:

```
+
```

```
-
```

```
*
```

```
/
```

```
%
```

```
a + b
```

```
==
```

```
!=
```

```
<
```

```
>
```

```
<=
```

```
>=
```

```
a > b
```

```
&&
```

```
&
```

```
,
```

```
,
```

```
,
```

```
,
```

```
=
```

```
+=
```

```
-=
```

```
*=
```

```
a += b
```

```
++
```

```
--
```

```
+
```

```
-
```

```
a++
```

```
--b
```

```
? :
```

```
result = (a > b) ? a : b
```

```
javaCopy codepublic class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Logical AND: " + (a > 0 && b > 0));
        System.out.println("Ternary: " + (a > b ? a : b));
    }
}
```

```
public class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Logical AND: " + (a > 0 && b > 0));
        System.out.println("Ternary: " + (a > b ? a : b));
    }
}
```

Output:

```
yamlCopy codeAddition: 15
Logical AND: true
Ternary: 10
```

```
Addition: 15
Logical AND: true
Ternary: 10
```

### 5. Control Statements

```
javaCopy codeif (age > 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}
```

```
if (age > 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}
```

```
javaCopy codeint day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

```
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

```
javaCopy codefor (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

```
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

```
javaCopy codeint i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

```
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

```
javaCopy codeint i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

```
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### 6. Arrays

An array stores elements of the same type in a contiguous memory location.

```
javaCopy codeint[] arr = new int[5]; // Declare an array
arr[0] = 10;            // Initialize values
```

```
int[] arr = new int[5]; // Declare an array
arr[0] = 10;            // Initialize values
```

```
javaCopy codepublic class OneDArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

```
public class OneDArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
```

Output:

```
Copy code10
20
30
40
50
```

```
10
20
30
40
50
```

Used to represent a matrix or table-like structure.

```
javaCopy codeint[][] matrix = new int[2][3]; // 2 rows, 3 columns
matrix[0][0] = 1; // Initialize values
```

```
int[][] matrix = new int[2][3]; // 2 rows, 3 columns
matrix[0][0] = 1; // Initialize values
```

```
javaCopy codepublic class MultiDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

```
public class MultiDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

Output:

```
Copy code1 2 3
4 5 6
```

```
1 2 3
4 5 6
```

Let me know if you need more details or additional examples for these topics!

Here’s a detailed explanation of the topics with examples and visual aids:

### 1. Introduction to OOP (Object-Oriented Programming)

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of objects. Objects are instances of classes that encapsulate data (fields) and behavior (methods). OOP enables developers to model real-world entities and provides several advantages over procedural programming.

### 2. Classes and Objects

A blueprint or template for creating objects. It defines properties (fields) and methods (behavior).

An instance of a class that contains data and behavior defined by the class.

```
javaCopy code// Define a class
public class Car {
    String brand; // Field
    int speed;

    // Method
    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

// Create and use an object
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object creation
        myCar.brand = "Toyota";
        myCar.speed = 100;
        myCar.drive();
    }
}
```

```
// Define a class
public class Car {
    String brand; // Field
    int speed;

    // Method
    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

// Create and use an object
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object creation
        myCar.brand = "Toyota";
        myCar.speed = 100;
        myCar.drive();
    }
}
```

```
bashCopy codeToyota is driving at 100 km/h.
```

```
Toyota is driving at 100 km/h.
```

### 3. OOP Principles

OOP is based on four main principles:

### 4. Encapsulation

Encapsulation is the process of restricting direct access to some components of an object and providing controlled access through methods.

```
javaCopy codepublic class BankAccount {
    private double balance; // Encapsulation with private modifier

    // Public methods for controlled access
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Balance: " + account.getBalance());
    }
}
```

```
public class BankAccount {
    private double balance; // Encapsulation with private modifier

    // Public methods for controlled access
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Balance: " + account.getBalance());
    }
}
```

```
makefileCopy codeBalance: 400.0
```

```
Balance: 400.0
```

### 5. Abstraction

Abstraction involves hiding implementation details and showing only the relevant features to the user.

```
javaCopy codeabstract class Shape {
    abstract void draw(); // Abstract method

    public void display() { // Concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.display();
    }
}
```

```
abstract class Shape {
    abstract void draw(); // Abstract method

    public void display() { // Concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.display();
    }
}
```

```
cssCopy codeDrawing a Circle
This is a shape.
```

```
Drawing a Circle
This is a shape.
```

### 6. Inheritance

Inheritance allows one class (child) to inherit properties and methods from another class (parent). It promotes code reusability.

```
javaCopy codeclass Parent {
    int x = 10;
}

class Child extends Parent {
    int y = 20;
}
```

```
class Parent {
    int x = 10;
}

class Child extends Parent {
    int y = 20;
}
```

```
javaCopy codeclass Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method
    }
}
```

```
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method
    }
}
```

```
Copy codeDog barks.
```

```
Dog barks.
```

### 7. Polymorphism

Polymorphism allows the same method or operator to perform different actions based on the context.

Compile-Time Polymorphism (Method Overloading):
Multiple methods with the same name but different parameters.

```
javaCopy codeclass Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

```
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

Runtime Polymorphism (Method Overriding):
A subclass provides a specific implementation of a method defined in its superclass.

```
javaCopy codeclass Vehicle {
    public void run() {
        System.out.println("Vehicle is running.");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike(); // Upcasting
        vehicle.run(); // Calls the overridden method
    }
}
```

```
class Vehicle {
    public void run() {
        System.out.println("Vehicle is running.");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Bike(); // Upcasting
        vehicle.run(); // Calls the overridden method
    }
}
```

```
arduinoCopy codeBike is running.
```

```
Bike is running.
```

### Diagram: Relationship Between OOP Concepts

Here’s a simplified diagram showing how the OOP principles interact:

```
luaCopy code                +---------------------+
                |       Object        |
                +---------------------+
                         ^
                         |
             +-----------+-----------+
             |                       |
   +------------------+   +------------------+
   |     Inheritance   |   |   Polymorphism   |
   +------------------+   +------------------+
             ^
             |
 +-----------+------------+
 |                        |
 +------------------------+
 |    Encapsulation       |
 +------------------------+
```

```
+---------------------+
                |       Object        |
                +---------------------+
                         ^
                         |
             +-----------+-----------+
             |                       |
   +------------------+   +------------------+
   |     Inheritance   |   |   Polymorphism   |
   +------------------+   +------------------+
             ^
             |
 +-----------+------------+
 |                        |
 +------------------------+
 |    Encapsulation       |
 +------------------------+
```

These concepts form the backbone of OOP and are extensively used in Java development. Let me know if you'd like further elaboration or examples for any specific principle!

Here’s a detailed explanation of the requested topics with examples, diagrams, and differences where applicable:

### 1. Static Variables and Methods

```
static
```

```
javaCopy codepublic class StaticExample {
    static int count = 0; // Static variable

    public StaticExample() {
        count++; // Increment every time a new object is created
    }

    public static void main(String[] args) {
        new StaticExample();
        new StaticExample();
        System.out.println("Number of objects created: " + StaticExample.count);
    }
}
```

```
public class StaticExample {
    static int count = 0; // Static variable

    public StaticExample() {
        count++; // Increment every time a new object is created
    }

    public static void main(String[] args) {
        new StaticExample();
        new StaticExample();
        System.out.println("Number of objects created: " + StaticExample.count);
    }
}
```

```
javascriptCopy codeNumber of objects created: 2
```

```
Number of objects created: 2
```

```
javaCopy codepublic class StaticMethodExample {
    static void displayMessage() { // Static method
        System.out.println("Hello, this is a static method.");
    }

    public static void main(String[] args) {
        StaticMethodExample.displayMessage(); // Called without creating an object
    }
}
```

```
public class StaticMethodExample {
    static void displayMessage() { // Static method
        System.out.println("Hello, this is a static method.");
    }

    public static void main(String[] args) {
        StaticMethodExample.displayMessage(); // Called without creating an object
    }
}
```

```
csharpCopy codeHello, this is a static method.
```

```
Hello, this is a static method.
```

### 2. Accessing Static Variables and Methods of a Different Class

You can access static members of one class from another class using the class name.

```
javaCopy codepublic class Utility {
    static int square(int x) { // Static method
        return x * x;
    }

    static String appName = "StaticApp"; // Static variable
}

public class Main {
    public static void main(String[] args) {
        // Accessing static method and variable of Utility class
        int result = Utility.square(5);
        System.out.println("Square: " + result);
        System.out.println("App Name: " + Utility.appName);
    }
}
```

```
public class Utility {
    static int square(int x) { // Static method
        return x * x;
    }

    static String appName = "StaticApp"; // Static variable
}

public class Main {
    public static void main(String[] args) {
        // Accessing static method and variable of Utility class
        int result = Utility.square(5);
        System.out.println("Square: " + result);
        System.out.println("App Name: " + Utility.appName);
    }
}
```

```
yamlCopy codeSquare: 25
App Name: StaticApp
```

```
Square: 25
App Name: StaticApp
```

### 3. Introduction to Reference Data Types

### 4. Reference Variables and Methods

```
javaCopy codepublic class Student {
    String name; // Instance variable

    Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John"); // Reference variable
        student.display();
    }
}
```

```
public class Student {
    String name; // Instance variable

    Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John"); // Reference variable
        student.display();
    }
}
```

```
yamlCopy codeStudent Name: John
```

```
Student Name: John
```

```
student.display();
```

### 5. Difference Between Reference Data Types and Primitive Data Types

```
int
```

```
double
```

```
char
```

```
0
```

```
0.0
```

```
false
```

```
null
```

```
int
```

```
float
```

```
boolean
```

```
String
```

```
Array
```

```
javaCopy codepublic class DataTypeExample {
    public static void main(String[] args) {
        int x = 5; // Primitive type
        String y = "Hello"; // Reference type

        System.out.println("Primitive: " + x);
        System.out.println("Reference: " + y);
    }
}
```

```
public class DataTypeExample {
    public static void main(String[] args) {
        int x = 5; // Primitive type
        String y = "Hello"; // Reference type

        System.out.println("Primitive: " + x);
        System.out.println("Reference: " + y);
    }
}
```

### 6. Difference Between Reference Variable and Static Variable

```
null
```

```
0
```

```
false
```

```
null
```

```
javaCopy codepublic class Example {
    static int staticVar = 100; // Static variable
    String instanceVar; // Reference variable

    public static void main(String[] args) {
        Example obj1 = new Example();
        obj1.instanceVar = "Hello";

        System.out.println("Static Variable: " + Example.staticVar); // Access static variable
        System.out.println("Reference Variable: " + obj1.instanceVar); // Access reference variable
    }
}
```

```
public class Example {
    static int staticVar = 100; // Static variable
    String instanceVar; // Reference variable

    public static void main(String[] args) {
        Example obj1 = new Example();
        obj1.instanceVar = "Hello";

        System.out.println("Static Variable: " + Example.staticVar); // Access static variable
        System.out.println("Reference Variable: " + obj1.instanceVar); // Access reference variable
    }
}
```

```
yamlCopy codeStatic Variable: 100
Reference Variable: Hello
```

```
Static Variable: 100
Reference Variable: Hello
```

If you need further clarifications, additional examples, or diagrams for any of these topics, feel free to ask!

### 1. Constructors and Initializing Reference Variables

A constructor is a special method in a class used to initialize objects. It has the same name as the class and no return type.

```
javaCopy codepublic class Student {
    String name; // Reference variable

    // Constructor to initialize the reference variable
    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student student = new Student("John"); // Constructor initializes the variable
        student.display();
    }
}
```

```
public class Student {
    String name; // Reference variable

    // Constructor to initialize the reference variable
    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student student = new Student("John"); // Constructor initializes the variable
        student.display();
    }
}
```

```
yamlCopy codeStudent Name: John
```

```
Student Name: John
```

### 2. Pass by Value vs Pass by Reference

In Java, all arguments are passed by value. For primitives, the value is passed. For objects, the reference (memory address) is passed.

```
javaCopy codepublic class PassByValueExample {
    public static void modifyPrimitive(int num) {
        num = 50; // Changes local copy
    }

    public static void main(String[] args) {
        int x = 10;
        modifyPrimitive(x);
        System.out.println("Value after modification: " + x); // x remains unchanged
    }
}
```

```
public class PassByValueExample {
    public static void modifyPrimitive(int num) {
        num = 50; // Changes local copy
    }

    public static void main(String[] args) {
        int x = 10;
        modifyPrimitive(x);
        System.out.println("Value after modification: " + x); // x remains unchanged
    }
}
```

```
yamlCopy codeValue after modification: 10
```

```
Value after modification: 10
```

When an object is passed, the method gets the reference to the object. Changes to the object affect the original.

```
javaCopy codepublic class PassByReferenceExample {
    public static void modifyObject(StringBuilder sb) {
        sb.append(" World");
    }

    public static void main(String[] args) {
        StringBuilder message = new StringBuilder("Hello");
        modifyObject(message); // Modifies the original object
        System.out.println("Modified message: " + message);
    }
}
```

```
public class PassByReferenceExample {
    public static void modifyObject(StringBuilder sb) {
        sb.append(" World");
    }

    public static void main(String[] args) {
        StringBuilder message = new StringBuilder("Hello");
        modifyObject(message); // Modifies the original object
        System.out.println("Modified message: " + message);
    }
}
```

```
yamlCopy codeModified message: Hello World
```

```
Modified message: Hello World
```

### 3. Re-assigning a Reference Variable

Reference variables can be reassigned to point to a different object, breaking the link to the previous object.

```
javaCopy codepublic class ReassignReference {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        str1 = str2; // Reassigning str1 to refer to the same object as str2
        System.out.println(str1); // Output: World
    }
}
```

```
public class ReassignReference {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        str1 = str2; // Reassigning str1 to refer to the same object as str2
        System.out.println(str1); // Output: World
    }
}
```

### 4. Passing Reference Variables to a Method

When a reference variable is passed to a method, the method can modify the object it refers to.

```
javaCopy codepublic class ReferenceMethodExample {
    String name;

    public ReferenceMethodExample(String name) {
        this.name = name;
    }

    public static void updateName(ReferenceMethodExample obj) {
        obj.name = "Updated Name";
    }

    public static void main(String[] args) {
        ReferenceMethodExample ref = new ReferenceMethodExample("Original Name");
        updateName(ref); // Pass reference variable
        System.out.println("Name after update: " + ref.name);
    }
}
```

```
public class ReferenceMethodExample {
    String name;

    public ReferenceMethodExample(String name) {
        this.name = name;
    }

    public static void updateName(ReferenceMethodExample obj) {
        obj.name = "Updated Name";
    }

    public static void main(String[] args) {
        ReferenceMethodExample ref = new ReferenceMethodExample("Original Name");
        updateName(ref); // Pass reference variable
        System.out.println("Name after update: " + ref.name);
    }
}
```

```
sqlCopy codeName after update: Updated Name
```

```
Name after update: Updated Name
```

### 5. Initializing Reference Variables of a Different Class

Reference variables can be used to reference objects of a different class.

```
javaCopy codeclass Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Person {
    String name;
    Address address; // Reference variable of another class

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println(name + " lives in " + address.city + ", " + address.state);
    }
}

public class Main {
    public static void main(String[] args) {
        Address addr = new Address("Mumbai", "Maharashtra");
        Person person = new Person("John", addr); // Initializing reference variable
        person.display();
    }
}
```

```
class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Person {
    String name;
    Address address; // Reference variable of another class

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println(name + " lives in " + address.city + ", " + address.state);
    }
}

public class Main {
    public static void main(String[] args) {
        Address addr = new Address("Mumbai", "Maharashtra");
        Person person = new Person("John", addr); // Initializing reference variable
        person.display();
    }
}
```

```
Copy codeJohn lives in Mumbai, Maharashtra
```

```
John lives in Mumbai, Maharashtra
```

### 6. Heap Memory and Stack Memory

```
sqlCopy code+--------------------+          +-------------------------+
|     Stack Memory   |          |        Heap Memory      |
|--------------------|          |-------------------------|
| Local variables    |          | Objects                |
| Function calls     |          | Class-level variables  |
|--------------------|          |-------------------------|
| Last-in, First-out |          | Managed by GC          |
+--------------------+          +-------------------------+
```

```
+--------------------+          +-------------------------+
|     Stack Memory   |          |        Heap Memory      |
|--------------------|          |-------------------------|
| Local variables    |          | Objects                |
| Function calls     |          | Class-level variables  |
|--------------------|          |-------------------------|
| Last-in, First-out |          | Managed by GC          |
+--------------------+          +-------------------------+
```

```
javaCopy codepublic class MemoryExample {
    public static void main(String[] args) {
        int localVar = 10; // Stored in Stack
        MemoryExample obj = new MemoryExample(); // Object stored in Heap
    }
}
```

```
public class MemoryExample {
    public static void main(String[] args) {
        int localVar = 10; // Stored in Stack
        MemoryExample obj = new MemoryExample(); // Object stored in Heap
    }
}
```

Let me know if you'd like additional details, examples, or diagrams for any of these concepts!

Here’s a detailed explanation of the topics with examples, diagrams, and rules:

### 1. Inheritance: Single & Multilevel

A child class inherits properties and methods from a single parent class.

```
javaCopy codeclass Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Parent's method
        child.show();    // Child's method
    }
}
```

```
class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Parent's method
        child.show();    // Child's method
    }
}
```

```
csharpCopy codeThis is the parent class.
This is the child class.
```

```
This is the parent class.
This is the child class.
```

A class inherits from a child class, which in turn inherits from another class.

```
javaCopy codeclass GrandParent {
    void greet() {
        System.out.println("Hello from Grandparent!");
    }
}

class Parent extends GrandParent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();   // Grandparent's method
        child.show();    // Parent's method
        child.display(); // Child's method
    }
}
```

```
class GrandParent {
    void greet() {
        System.out.println("Hello from Grandparent!");
    }
}

class Parent extends GrandParent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();   // Grandparent's method
        child.show();    // Parent's method
        child.display(); // Child's method
    }
}
```

```
csharpCopy codeHello from Grandparent!
This is the parent class.
This is the child class.
```

```
Hello from Grandparent!
This is the parent class.
This is the child class.
```

### 2. Inheritance: Hierarchical

In hierarchical inheritance, multiple child classes inherit from a single parent class.

```
javaCopy codeclass Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
```

```
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
```

```
Copy codeThis animal eats food.
Dog barks.
This animal eats food.
Cat meows.
```

```
This animal eats food.
Dog barks.
This animal eats food.
Cat meows.
```

### 3. Association, Aggregation, and Composition

Association:

```
javaCopy codeclass Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

```
class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
```

Aggregation:

```
javaCopy codeclass Department {
    String name;
    Faculty faculty;

    Department(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}
```

```
class Department {
    String name;
    Faculty faculty;

    Department(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}
```

Composition:

```
javaCopy codeclass Room {
    String roomNumber;

    Room(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}

class House {
    Room room;

    House(String roomNumber) {
        this.room = new Room(roomNumber); // Strong dependency
    }
}
```

```
class Room {
    String roomNumber;

    Room(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}

class House {
    Room room;

    House(String roomNumber) {
        this.room = new Room(roomNumber); // Strong dependency
    }
}
```

### 4. Polymorphism: Compile-Time and Runtime

When methods with the same name exist in a class but differ in parameters (number, type, or order).

```
javaCopy codeclass Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3)); // Calls int method
        System.out.println(calc.add(2.5, 3.5)); // Calls double method
    }
}
```

```
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3)); // Calls int method
        System.out.println(calc.add(2.5, 3.5)); // Calls double method
    }
}
```

```
Copy code5
6.0
```

```
5
6.0
```

When a child class provides a specific implementation of a method from the parent class.

```
javaCopy codeclass Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.display(); // Calls the overridden method in Child
    }
}
```

```
class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.display(); // Calls the overridden method in Child
    }
}
```

```
csharpCopy codeThis is the child class.
```

```
This is the child class.
```

### 5. Rules of Overriding and Overloading of Methods

```
static
```

```
final
```

```
private
```

### 6. super and this Keywords

```
super
```

```
this
```

```
this
```

```
javaCopy codeclass Example {
    int x;

    Example(int x) {
        this.x = x; // Resolving ambiguity
    }
}
```

```
class Example {
    int x;

    Example(int x) {
        this.x = x; // Resolving ambiguity
    }
}
```

```
super
```

```
javaCopy codeclass Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent's constructor
        System.out.println("Child class constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
```

```
class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls Parent's constructor
        System.out.println("Child class constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
```

```
kotlinCopy codeParent class constructor
Child class constructor
```

```
Parent class constructor
Child class constructor
```

Let me know if you'd like further examples, diagrams, or clarifications!

### 1. Upcasting and Downcasting of a Reference Variable

```
javaCopy codeclass Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.sound(); // Calls overridden method in Dog
        // animal.wagTail(); // Not accessible, as the reference is of type Animal
    }
}
```

```
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.sound(); // Calls overridden method in Dog
        // animal.wagTail(); // Not accessible, as the reference is of type Animal
    }
}
```

```
Copy codeDog barks
```

```
Dog barks
```

```
javaCopy codepublic class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        Dog dog = (Dog) animal; // Downcasting
        dog.sound(); // Calls overridden method in Dog
        dog.wagTail(); // Accessing subclass-specific method
    }
}
```

```
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        Dog dog = (Dog) animal; // Downcasting
        dog.sound(); // Calls overridden method in Dog
        dog.wagTail(); // Accessing subclass-specific method
    }
}
```

```
bashCopy codeDog barks
Dog wags its tail
```

```
Dog barks
Dog wags its tail
```

```
ClassCastException
```

```
instanceof
```

```
javaCopy codeif (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.wagTail();
}
```

```
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
    dog.wagTail();
}
```

### 2. Abstract Class and Abstract Methods

```
javaCopy codeabstract class Animal {
    abstract void sound(); // Abstract method
    void eat() { // Concrete method
        System.out.println("This animal eats food.");
    }
}
```

```
abstract class Animal {
    abstract void sound(); // Abstract method
    void eat() { // Concrete method
        System.out.println("This animal eats food.");
    }
}
```

```
javaCopy codeabstract class Shape {
    abstract void draw(); // Abstract method

    void display() { // Concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.draw();
        shape.display();
    }
}
```

```
abstract class Shape {
    abstract void draw(); // Abstract method

    void display() { // Concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.draw();
        shape.display();
    }
}
```

```
cssCopy codeDrawing a Circle
This is a shape.
```

```
Drawing a Circle
This is a shape.
```

### 3. Interface (Implementing Multiple Interfaces)

```
javaCopy codeinterface Animal {
    void eat(); // Abstract method
}

interface Pet {
    void play(); // Abstract method
}

class Dog implements Animal, Pet { // Multiple interfaces
    @Override
    public void eat() {
        System.out.println("Dog eats food.");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch.");
    }
}
```

```
interface Animal {
    void eat(); // Abstract method
}

interface Pet {
    void play(); // Abstract method
}

class Dog implements Animal, Pet { // Multiple interfaces
    @Override
    public void eat() {
        System.out.println("Dog eats food.");
    }

    @Override
    public void play() {
        System.out.println("Dog plays fetch.");
    }
}
```

```
javaCopy codeinterface Vehicle {
    void start(); // Abstract method
}

interface FourWheeler {
    void drive(); // Abstract method
}

class Car implements Vehicle, FourWheeler {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
```

```
interface Vehicle {
    void start(); // Abstract method
}

interface FourWheeler {
    void drive(); // Abstract method
}

class Car implements Vehicle, FourWheeler {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
```

```
csharpCopy codeCar is starting.
Car is driving.
```

```
Car is starting.
Car is driving.
```

```
javaCopy codeinterface Printable {
    default void print() {
        System.out.println("This is a default method in the interface.");
    }

    static void show() {
        System.out.println("This is a static method in the interface.");
    }
}

class Document implements Printable {}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print(); // Calls default method
        Printable.show(); // Calls static method
    }
}
```

```
interface Printable {
    default void print() {
        System.out.println("This is a default method in the interface.");
    }

    static void show() {
        System.out.println("This is a static method in the interface.");
    }
}

class Document implements Printable {}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print(); // Calls default method
        Printable.show(); // Calls static method
    }
}
```

```
csharpCopy codeThis is a default method in the interface.
This is a static method in the interface.
```

```
This is a default method in the interface.
This is a static method in the interface.
```

### Abstract Class vs Interface

```
public static final
```

Feel free to ask if you need further examples, clarifications, or additional topics!

### 1. Final Variables, Final Methods, and Final Class

```
final
```

```
javaCopy codepublic class FinalVariableExample {
    final int MAX_VALUE = 100; // Final variable

    public void display() {
        // MAX_VALUE = 200; // Error: Cannot reassign final variable
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        new FinalVariableExample().display();
    }
}
```

```
public class FinalVariableExample {
    final int MAX_VALUE = 100; // Final variable

    public void display() {
        // MAX_VALUE = 200; // Error: Cannot reassign final variable
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        new FinalVariableExample().display();
    }
}
```

```
final
```

```
javaCopy codeclass Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void show() { } // Error: Cannot override a final method
}
```

```
class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void show() { } // Error: Cannot override a final method
}
```

```
final
```

```
javaCopy codefinal class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass { } // Error: Cannot extend a final class
```

```
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass { } // Error: Cannot extend a final class
```

### 2. Functional Interface

```
javaCopy code@FunctionalInterface
interface Greeting {
    void sayHello(String name); // Single abstract method
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name);
        greet.sayHello("John");
    }
}
```

```
@FunctionalInterface
interface Greeting {
    void sayHello(String name); // Single abstract method
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = (name) -> System.out.println("Hello, " + name);
        greet.sayHello("John");
    }
}
```

```
Copy codeHello, John
```

```
Hello, John
```

### 3. New Interface Features (Java 8 and 11)

Default Methods:

```
javaCopy codeinterface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting.");
    }
}
```

```
interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting.");
    }
}
```

Static Methods:

```
javaCopy codeinterface Utility {
    static void show() {
        System.out.println("Static method in interface.");
    }
}
```

```
interface Utility {
    static void show() {
        System.out.println("Static method in interface.");
    }
}
```

```
javaCopy codeinterface Calculator {
    private void log(String message) {
        System.out.println("Log: " + message);
    }
}
```

```
interface Calculator {
    private void log(String message) {
        System.out.println("Log: " + message);
    }
}
```

### 4. Lambda Expression

```
javaCopy code(parameters) -> expression OR (parameters) -> { statements }
```

```
(parameters) -> expression OR (parameters) -> { statements }
```

```
javaCopy codeinterface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b; // Lambda expression
        System.out.println("Sum: " + addition.operate(5, 3));
    }
}
```

```
interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b; // Lambda expression
        System.out.println("Sum: " + addition.operate(5, 3));
    }
}
```

```
makefileCopy codeSum: 8
```

```
Sum: 8
```

### 5. Inner Class (Regular, Method Local, Anonymous, & Static Inner Class)

```
javaCopy codeclass Outer {
    class Inner {
        void display() {
            System.out.println("This is a regular inner class.");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.display();
    }
}
```

```
class Outer {
    class Inner {
        void display() {
            System.out.println("This is a regular inner class.");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.display();
    }
}
```

```
javaCopy codeclass Outer {
    void show() {
        class Inner {
            void display() {
                System.out.println("This is a method-local inner class.");
            }
        }
        new Inner().display();
    }

    public static void main(String[] args) {
        new Outer().show();
    }
}
```

```
class Outer {
    void show() {
        class Inner {
            void display() {
                System.out.println("This is a method-local inner class.");
            }
        }
        new Inner().display();
    }

    public static void main(String[] args) {
        new Outer().show();
    }
}
```

```
javaCopy codeinterface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = new Greeting() { // Anonymous inner class
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class.");
            }
        };
        greet.sayHello();
    }
}
```

```
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = new Greeting() { // Anonymous inner class
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class.");
            }
        };
        greet.sayHello();
    }
}
```

```
static
```

```
javaCopy codeclass Outer {
    static class Inner {
        void display() {
            System.out.println("This is a static inner class.");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}
```

```
class Outer {
    static class Inner {
        void display() {
            System.out.println("This is a static inner class.");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}
```

### 6. Enum

```
javaCopy codeenum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Iterating over enum values
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
```

```
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Iterating over enum values
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
```

```
csharpCopy codeToday is: MONDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
SUNDAY
```

```
Today is: MONDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
SUNDAY
```

Let me know if you need further explanations, examples, or diagrams for these concepts!

### 1. Access Modifiers (public, private, protected, and default)

Access modifiers define the scope and visibility of classes, variables, methods, and constructors.

```
public
```

```
protected
```

```
private
```

Public:

```
javaCopy codepublic class PublicClass {
    public void display() {
        System.out.println("Public method is accessible anywhere.");
    }
}
```

```
public class PublicClass {
    public void display() {
        System.out.println("Public method is accessible anywhere.");
    }
}
```

Private:

```
javaCopy codepublic class PrivateExample {
    private int number = 10; // Private variable

    private void display() { // Private method
        System.out.println("This is private: " + number);
    }
}
```

```
public class PrivateExample {
    private int number = 10; // Private variable

    private void display() { // Private method
        System.out.println("This is private: " + number);
    }
}
```

Protected:

```
javaCopy codepublic class ProtectedExample {
    protected void display() {
        System.out.println("Protected method.");
    }
}
```

```
public class ProtectedExample {
    protected void display() {
        System.out.println("Protected method.");
    }
}
```

Default (No Modifier):

```
javaCopy codeclass DefaultExample {
    void display() {
        System.out.println("Default access modifier.");
    }
}
```

```
class DefaultExample {
    void display() {
        System.out.println("Default access modifier.");
    }
}
```

### 2. Packages and Import Statements

Define the package:

```
javaCopy codepackage mypackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from MyClass in mypackage.");
    }
}
```

```
package mypackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from MyClass in mypackage.");
    }
}
```

Import and use:

```
javaCopy codeimport mypackage.MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
```

```
import mypackage.MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
```

### 3. Static Imports

Static imports allow you to access static members of a class directly, without the class name.

```
javaCopy codeimport static java.lang.Math.*;

public class StaticImportExample {
    public static void main(String[] args) {
        System.out.println("Square root: " + sqrt(16)); // No Math.sqrt()
        System.out.println("Pi: " + PI);               // No Math.PI
    }
}
```

```
import static java.lang.Math.*;

public class StaticImportExample {
    public static void main(String[] args) {
        System.out.println("Square root: " + sqrt(16)); // No Math.sqrt()
        System.out.println("Pi: " + PI);               // No Math.PI
    }
}
```

```
mathematicaCopy codeSquare root: 4.0
Pi: 3.141592653589793
```

```
Square root: 4.0
Pi: 3.141592653589793
```

### 4. Constructor Chaining (With and Without Packages)

Calling one constructor from another within the same or a different class.

Use the this keyword to call another constructor in the same class.

```
this
```

```
javaCopy codeclass ConstructorChainingExample {
    ConstructorChainingExample() {
        this(10); // Calls parameterized constructor
        System.out.println("Default constructor.");
    }

    ConstructorChainingExample(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        new ConstructorChainingExample();
    }
}
```

```
class ConstructorChainingExample {
    ConstructorChainingExample() {
        this(10); // Calls parameterized constructor
        System.out.println("Default constructor.");
    }

    ConstructorChainingExample(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        new ConstructorChainingExample();
    }
}
```

```
kotlinCopy codeParameterized constructor: 10
Default constructor.
```

```
Parameterized constructor: 10
Default constructor.
```

Define constructors in different classes:

```
javaCopy codepackage mypackage;

public class Parent {
    Parent() {
        System.out.println("Parent constructor.");
    }
}
```

```
package mypackage;

public class Parent {
    Parent() {
        System.out.println("Parent constructor.");
    }
}
```

Use super() in the subclass:

```
super()
```

```
javaCopy codepackage mypackage;

public class Child extends Parent {
    Child() {
        super(); // Calls the Parent class constructor
        System.out.println("Child constructor.");
    }

    public static void main(String[] args) {
        new Child();
    }
}
```

```
package mypackage;

public class Child extends Parent {
    Child() {
        super(); // Calls the Parent class constructor
        System.out.println("Child constructor.");
    }

    public static void main(String[] args) {
        new Child();
    }
}
```

```
kotlinCopy codeParent constructor.
Child constructor.
```

```
Parent constructor.
Child constructor.
```

### 5. Accessing Protected Variables and Methods Outside the Package

```
protected
```

```
javaCopy codepackage parentpackage;

public class Parent {
    protected void display() {
        System.out.println("Protected method in Parent class.");
    }
}
```

```
package parentpackage;

public class Parent {
    protected void display() {
        System.out.println("Protected method in Parent class.");
    }
}
```

```
javaCopy codepackage childpackage;

import parentpackage.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Accessing protected method
    }
}
```

```
package childpackage;

import parentpackage.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Accessing protected method
    }
}
```

```
vbnetCopy codeProtected method in Parent class.
```

```
Protected method in Parent class.
```

```
protected
```

Let me know if you'd like further clarifications or additional examples!

### 1. Garbage Collection in Java

An object is considered reachable if:

### 2. Requesting JVM to Run Garbage Collection

You can request the JVM to run garbage collection using:

```
System.gc()
```

```
Runtime.getRuntime().gc()
```

```
System.gc()
```

```
javaCopy codepublic class GarbageCollectionExample {
    public static void main(String[] args) {
        String str = new String("Hello");
        str = null; // Eligible for garbage collection

        System.gc(); // Requesting garbage collection
        System.out.println("Garbage collection requested.");
    }
}
```

```
public class GarbageCollectionExample {
    public static void main(String[] args) {
        String str = new String("Hello");
        str = null; // Eligible for garbage collection

        System.gc(); // Requesting garbage collection
        System.out.println("Garbage collection requested.");
    }
}
```

```
Copy codeGarbage collection requested.
```

```
Garbage collection requested.
```

Note: The execution of garbage collection depends on the JVM, so it's not guaranteed to run immediately.

### 3. Different Ways to Make an Object Eligible for Garbage Collection

```
null
```

```
javaCopy codepublic class GCExample {
    public static void main(String[] args) {
        String str = new String("Hello");
        str = null; // Object is now eligible for GC
    }
}
```

```
public class GCExample {
    public static void main(String[] args) {
        String str = new String("Hello");
        str = null; // Object is now eligible for GC
    }
}
```

```
javaCopy codepublic class GCExample {
    public static void main(String[] args) {
        String str = new String("Hello");
        str = new String("World"); // "Hello" is now eligible for GC
    }
}
```

```
public class GCExample {
    public static void main(String[] args) {
        String str = new String("Hello");
        str = new String("World"); // "Hello" is now eligible for GC
    }
}
```

```
javaCopy codeclass GCExample {
    GCExample ref;

    public static void main(String[] args) {
        GCExample obj1 = new GCExample();
        GCExample obj2 = new GCExample();

        obj1.ref = obj2;
        obj2.ref = obj1;

        obj1 = null;
        obj2 = null; // Both objects are now eligible for GC
    }
}
```

```
class GCExample {
    GCExample ref;

    public static void main(String[] args) {
        GCExample obj1 = new GCExample();
        GCExample obj2 = new GCExample();

        obj1.ref = obj2;
        obj2.ref = obj1;

        obj1 = null;
        obj2 = null; // Both objects are now eligible for GC
    }
}
```

### 4. finalize() Method

```
finalize()
```

```
finalize()
```

```
finalize()
```

```
javaCopy codeprotected void finalize() throws Throwable {
    // Cleanup code
}
```

```
protected void finalize() throws Throwable {
    // Cleanup code
}
```

```
javaCopy codepublic class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before object is garbage collected.");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null; // Eligible for garbage collection
        System.gc(); // Request GC
    }
}
```

```
public class FinalizeExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before object is garbage collected.");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null; // Eligible for garbage collection
        System.gc(); // Request GC
    }
}
```

```
csharpCopy codeFinalize method called before object is garbage collected.
```

```
Finalize method called before object is garbage collected.
```

```
finalize()
```

```
try-with-resources
```

```
finalize()
```

### Summary

```
System.gc()
```

```
Runtime.getRuntime().gc()
```

```
finalize()
```

Let me know if you'd like additional examples or further clarification!

### 1. Wrapper Classes and Constant Pools

```
Integer
```

```
Double
```

```
Character
```

```
Boolean
```

```
javaCopy codeInteger num = 10; // Autoboxing
```

```
Integer num = 10; // Autoboxing
```

```
javaCopy codeint val = num; // Unboxing
```

```
int val = num; // Unboxing
```

```
javaCopy codepublic class WrapperExample {
    public static void main(String[] args) {
        Integer a = 100; // From constant pool
        Integer b = 100; // Same reference as a

        Integer c = 200; // New object
        Integer d = 200; // New object

        System.out.println(a == b); // true
        System.out.println(c == d); // false
    }
}
```

```
public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 100; // From constant pool
        Integer b = 100; // Same reference as a

        Integer c = 200; // New object
        Integer d = 200; // New object

        System.out.println(a == b); // true
        System.out.println(c == d); // false
    }
}
```

```
arduinoCopy codetrue
false
```

```
true
false
```

### 2. String Class, StringBuffer, and StringBuilder

```
javaCopy codepublic class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World"); // Creates a new String object
        System.out.println(str1); // Original String remains unchanged
        System.out.println(str2);
    }
}
```

```
public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World"); // Creates a new String object
        System.out.println(str1); // Original String remains unchanged
        System.out.println(str2);
    }
}
```

```
Copy codeHello
Hello World
```

```
Hello
Hello World
```

```
javaCopy codepublic class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the existing object
        System.out.println(sb);
    }
}
```

```
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the existing object
        System.out.println(sb);
    }
}
```

```
javaCopy codepublic class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
```

```
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
```

```
Copy codeHello World
```

```
Hello World
```

### 3. String Pool

Literal Strings are stored in the String Pool:

```
javaCopy codeString s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2); // true, same reference
```

```
String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2); // true, same reference
```

new Keyword creates a new String object outside the pool:

```
new
```

```
javaCopy codeString s1 = new String("Hello");
String s2 = "Hello";
System.out.println(s1 == s2); // false, different references
```

```
String s1 = new String("Hello");
String s2 = "Hello";
System.out.println(s1 == s2); // false, different references
```

```
javaCopy codepublic class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "Hello"; // Stored in the String Pool
        String str2 = "Hello"; // Points to the same pool object
        String str3 = new String("Hello"); // New object in heap

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
    }
}
```

```
public class StringPoolExample {
    public static void main(String[] args) {
        String str1 = "Hello"; // Stored in the String Pool
        String str2 = "Hello"; // Points to the same pool object
        String str3 = new String("Hello"); // New object in heap

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
    }
}
```

```
arduinoCopy codetrue
false
true
```

```
true
false
true
```

The intern() method forces a String object to be stored in the String Pool.

```
intern()
```

```
javaCopy codepublic class StringInternExample {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = s1.intern(); // Adds "Hello" to the String Pool
        String s3 = "Hello";

        System.out.println(s2 == s3); // true
    }
}
```

```
public class StringInternExample {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = s1.intern(); // Adds "Hello" to the String Pool
        String s3 = "Hello";

        System.out.println(s2 == s3); // true
    }
}
```

```
arduinoCopy codetrue
```

```
true
```

Let me know if you need further clarifications or additional examples!

public class WrapperExample { public static void main(String\[\] args) { Integer a \= 100; // From constant pool Integer b \= 100; // Same reference as a Integer c \= 200; // New object Integer d \= 200; // New object System.out.println(a == b); // true System.out.println(c == d); // false } }

Let me explain and debug the code in detail:

### Code:

```
javaCopy codepublic class WrapperExample {
    public static void main(String[] args) {
        Integer a = 100; // From constant pool
        Integer b = 100; // Same reference as a

        Integer c = 200; // New object
        Integer d = 200; // New object

        System.out.println(a == b); // true
        System.out.println(c == d); // false
    }
}
```

```
public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 100; // From constant pool
        Integer b = 100; // Same reference as a

        Integer c = 200; // New object
        Integer d = 200; // New object

        System.out.println(a == b); // true
        System.out.println(c == d); // false
    }
}
```

### Behavior Explanation:

```
Integer
```

```
==
```

```
==
```

```
a == b
```

```
true
```

```
c
```

```
d
```

```
c == d
```

```
false
```

### Output Explanation:

a == b (True)

```
a == b
```

```
a
```

```
b
```

c == d (False)

```
c == d
```

```
c
```

```
d
```

### Debugging Techniques:

To debug and observe the behavior, you can print the references of the variables:

```
javaCopy codepublic class WrapperExample {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        // Print references
        System.out.println("a == b: " + (a == b)); // true
        System.out.println("c == d: " + (c == d)); // false

        // Print hash codes to verify references
        System.out.println("HashCode of a: " + System.identityHashCode(a));
        System.out.println("HashCode of b: " + System.identityHashCode(b));
        System.out.println("HashCode of c: " + System.identityHashCode(c));
        System.out.println("HashCode of d: " + System.identityHashCode(d));
    }
}
```

```
public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        // Print references
        System.out.println("a == b: " + (a == b)); // true
        System.out.println("c == d: " + (c == d)); // false

        // Print hash codes to verify references
        System.out.println("HashCode of a: " + System.identityHashCode(a));
        System.out.println("HashCode of b: " + System.identityHashCode(b));
        System.out.println("HashCode of c: " + System.identityHashCode(c));
        System.out.println("HashCode of d: " + System.identityHashCode(d));
    }
}
```

```
yamlCopy codea == b: true
c == d: false
HashCode of a: 12345678
HashCode of b: 12345678
HashCode of c: 87654321
HashCode of d: 87654322
```

```
a == b: true
c == d: false
HashCode of a: 12345678
HashCode of b: 12345678
HashCode of c: 87654321
HashCode of d: 87654322
```

### Conclusion:

The code behaves as expected due to the Integer Constant Pool. If you need further clarifications or modifications, feel free to ask!

### **2\. String Class, StringBuffer, and StringBuilder**

#### **String Class:**

*   Strings in Java are **immutable**, meaning they cannot be changed once created.
*   Stored in the **String Pool**.

#### Example:

java

Copy code

`public class StringExample {     public static void main(String[] args) {         String str1 = "Hello";         String str2 = str1.concat(" World"); // Creates a new String object         System.out.println(str1); // Original String remains unchanged         System.out.println(str2);     } }`

#### Output:

Copy code

`Hello Hello World`

* * *

#### **StringBuffer and StringBuilder:**

*   These are mutable classes, meaning the content of objects can be changed without creating new objects.
*   **StringBuffer** is thread-safe (synchronized), whereas **StringBuilder** is faster but not thread-safe.

#### Example: StringBuffer

java

Copy code

`public class StringBufferExample {     public static void main(String[] args) {         StringBuffer sb = new StringBuffer("Hello");         sb.append(" World"); // Modifies the existing object         System.out.println(sb);     } }`

#### Example: StringBuilder

java

Copy code

`public class StringBuilderExample {     public static void main(String[] args) {         StringBuilder sb = new StringBuilder("Hello");         sb.append(" World");         System.out.println(sb);     } }`

#### Output (for both):

Copy code

`Hello World`

* * *

#### **Comparison:**

| **Feature** | **String** | **StringBuffer** | **StringBuilder** |
| --- | --- | --- | --- |
| **Mutability** | Immutable | Mutable | Mutable |
| **Thread Safety** | Thread-safe (immutable) | Thread-safe | Not thread-safe |
| **Performance** | Slower (due to immutability) | Moderate (synchronized) | Faster (no synchronization) |

* * *

### **3\. String Pool**

#### **What is the String Pool?**

*   The **String Pool** is a special memory area inside the **Heap Memory** where JVM stores **String literals** to optimize memory usage.
*   Strings in the pool are **immutable** and **shared**.

* * *

#### **String Pool Behavior:**

1.  **Literal Strings** are stored in the String Pool:
    
    java
    
    Copy code
    
    `String s1 = "Hello"; String s2 = "Hello"; System.out.println(s1 == s2); // true, same reference`
    
2.  **`new` Keyword** creates a new String object outside the pool:
    
    java
    
    Copy code
    
    `String s1 = new String("Hello"); String s2 = "Hello"; System.out.println(s1 == s2); // false, different references`
    

#### Example:

java

Copy code

`public class StringPoolExample {     public static void main(String[] args) {         String str1 = "Hello"; // Stored in the String Pool         String str2 = "Hello"; // Points to the same pool object         String str3 = new String("Hello"); // New object in heap          System.out.println(str1 == str2); // true         System.out.println(str1 == str3); // false         System.out.println(str1.equals(str3)); // true     } }`

#### Output:

arduino

Copy code

`true false true`

* * *

#### **Intern Method:**

The `intern()` method forces a String object to be stored in the String Pool.

#### Example:

java

Copy code

`public class StringInternExample {     public static void main(String[] args) {         String s1 = new String("Hello");         String s2 = s1.intern(); // Adds "Hello" to the String Pool         String s3 = "Hello";          System.out.println(s2 == s3); // true     } }`

#### Output:

arduino

Copy code

`true`

Here’s an in-depth explanation with additional examples and variations to help you understand these concepts better:

### 1. String Class

The String class in Java represents immutable objects. Once created, the content of a String object cannot be modified.

```
String
```

```
String
```

```
javaCopy codepublic class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World"); // Creates a new String object
        System.out.println("Original String: " + str1); // "Hello"
        System.out.println("Modified String: " + str2); // "Hello World"
    }
}
```

```
public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World"); // Creates a new String object
        System.out.println("Original String: " + str1); // "Hello"
        System.out.println("Modified String: " + str2); // "Hello World"
    }
}
```

Output:

```
arduinoCopy codeOriginal String: Hello
Modified String: Hello World
```

```
Original String: Hello
Modified String: Hello World
```

```
==
```

```
equals()
```

```
javaCopy codepublic class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello"; // Stored in String Pool
        String s2 = "Hello"; // Points to the same object
        String s3 = new String("Hello"); // New object in heap

        System.out.println(s1 == s2); // true (same reference)
        System.out.println(s1 == s3); // false (different references)
        System.out.println(s1.equals(s3)); // true (content is the same)
    }
}
```

```
public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello"; // Stored in String Pool
        String s2 = "Hello"; // Points to the same object
        String s3 = new String("Hello"); // New object in heap

        System.out.println(s1 == s2); // true (same reference)
        System.out.println(s1 == s3); // false (different references)
        System.out.println(s1.equals(s3)); // true (content is the same)
    }
}
```

Output:

```
arduinoCopy codetrue
false
true
```

```
true
false
true
```

### 2. StringBuffer and StringBuilder

```
StringBuffer
```

```
StringBuilder
```

```
String
```

```
javaCopy codepublic class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the existing object
        System.out.println(sb); // "Hello World"
    }
}
```

```
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the existing object
        System.out.println(sb); // "Hello World"
    }
}
```

```
javaCopy codepublic class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.insert(4, " Programming"); // Insert text
        System.out.println(sb); // "Java Programming"

        sb.reverse(); // Reverse text
        System.out.println(sb); // "gnimmargorP avaJ"
    }
}
```

```
public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.insert(4, " Programming"); // Insert text
        System.out.println(sb); // "Java Programming"

        sb.reverse(); // Reverse text
        System.out.println(sb); // "gnimmargorP avaJ"
    }
}
```

```
StringBuffer
```

```
javaCopy codepublic class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Fast");
        sb.append(" and Efficient");
        System.out.println(sb); // "Fast and Efficient"
    }
}
```

```
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Fast");
        sb.append(" and Efficient");
        System.out.println(sb); // "Fast and Efficient"
    }
}
```

### 3. String Pool

```
javaCopy codepublic class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Java"; // Stored in String Pool
        String s2 = "Java"; // Points to the same object
        String s3 = new String("Java"); // Creates a new object

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
    }
}
```

```
public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Java"; // Stored in String Pool
        String s2 = "Java"; // Points to the same object
        String s3 = new String("Java"); // Creates a new object

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
    }
}
```

Output:

```
arduinoCopy codetrue
false
```

```
true
false
```

### 4. Intern Method

```
intern()
```

```
javaCopy codepublic class InternExample {
    public static void main(String[] args) {
        String s1 = new String("Hello"); // New object in heap
        String s2 = s1.intern(); // Adds "Hello" to String Pool
        String s3 = "Hello"; // Points to the same pool object

        System.out.println(s1 == s2); // false (s1 is in heap, s2 is in pool)
        System.out.println(s2 == s3); // true (both point to the pool)
    }
}
```

```
public class InternExample {
    public static void main(String[] args) {
        String s1 = new String("Hello"); // New object in heap
        String s2 = s1.intern(); // Adds "Hello" to String Pool
        String s3 = "Hello"; // Points to the same pool object

        System.out.println(s1 == s2); // false (s1 is in heap, s2 is in pool)
        System.out.println(s2 == s3); // true (both point to the pool)
    }
}
```

Output:

```
arduinoCopy codefalse
true
```

```
false
true
```

### 5. Performance Comparison

Using String, StringBuffer, and StringBuilder for repeated concatenation:

```
String
```

```
StringBuffer
```

```
StringBuilder
```

```
javaCopy codepublic class PerformanceComparison {
    public static void main(String[] args) {
        // Using String
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i; // Creates new objects repeatedly
        }
        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + "ms");

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i); // Appends to the same object
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + "ms");
    }
}
```

```
public class PerformanceComparison {
    public static void main(String[] args) {
        // Using String
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i; // Creates new objects repeatedly
        }
        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + "ms");

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i); // Appends to the same object
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + "ms");
    }
}
```

```
lessCopy codeString Time: 120ms
StringBuilder Time: 5ms
```

```
String Time: 120ms
StringBuilder Time: 5ms
```

### 6. Key Takeaways

Let me know if you'd like to dive deeper into any of these concepts or explore advanced examples!

### 1. Exception Hierarchy, Errors, Checked and Unchecked Exceptions

In Java, exceptions are part of the Throwable class hierarchy.

```
Throwable
```

```
OutOfMemoryError
```

```
StackOverflowError
```

```
IOException
```

```
ArithmeticException
```

```
Exception
```

```
NullPointerException
```

```
IndexOutOfBounds
```

```
phpCopy codeThrowable
├── Error
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
├── Exception
    ├── IOException (Checked)
    ├── SQLException (Checked)
    ├── RuntimeException (Unchecked)
        ├── NullPointerException
        ├── ArithmeticException
        ├── IndexOutOfBoundsException
        └── ...
```

```
Throwable
├── Error
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
├── Exception
    ├── IOException (Checked)
    ├── SQLException (Checked)
    ├── RuntimeException (Unchecked)
        ├── NullPointerException
        ├── ArithmeticException
        ├── IndexOutOfBoundsException
        └── ...
```

```
IOException
```

```
SQLException
```

```
try-catch
```

```
throws
```

```
NullPointerException
```

```
ArithmeticException
```

```
OutOfMemoryError
```

```
StackOverflowError
```

### 2. Exception Propagation

```
try-catch
```

```
javaCopy codepublic class PropagationExample {
    public static void method1() {
        throw new ArithmeticException("Exception in method1");
    }

    public static void method2() {
        method1(); // Exception propagates here
    }

    public static void main(String[] args) {
        try {
            method2(); // Exception propagates here
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```

```
public class PropagationExample {
    public static void method1() {
        throw new ArithmeticException("Exception in method1");
    }

    public static void method2() {
        method1(); // Exception propagates here
    }

    public static void main(String[] args) {
        try {
            method2(); // Exception propagates here
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```

```
phpCopy codeCaught exception: Exception in method1
```

```
Caught exception: Exception in method1
```

### 3. try-catch-finally Block, throws Clause, and throw Keyword

```
try
```

```
catch
```

```
finally
```

```
javaCopy codepublic class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
```

```
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
```

```
vbnetCopy codeCaught an exception: / by zero
Finally block executed.
```

```
Caught an exception: / by zero
Finally block executed.
```

```
javaCopy codeimport java.io.IOException;

public class ThrowsExample {
    public static void method() throws IOException {
        throw new IOException("IOException occurred");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```

```
import java.io.IOException;

public class ThrowsExample {
    public static void method() throws IOException {
        throw new IOException("IOException occurred");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```

```
yamlCopy codeCaught exception: IOException occurred
```

```
Caught exception: IOException occurred
```

```
javaCopy codepublic class ThrowExample {
    public static void main(String[] args) {
        throw new IllegalArgumentException("Custom exception thrown");
    }
}
```

```
public class ThrowExample {
    public static void main(String[] args) {
        throw new IllegalArgumentException("Custom exception thrown");
    }
}
```

```
arduinoCopy codeException in thread "main" java.lang.IllegalArgumentException: Custom exception thrown
```

```
Exception in thread "main" java.lang.IllegalArgumentException: Custom exception thrown
```

### 4. Multi-Catch Block

```
catch
```

```
javaCopy codepublic class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught an exception: " + e.getClass().getSimpleName());
        }
    }
}
```

```
public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught an exception: " + e.getClass().getSimpleName());
        }
    }
}
```

```
yamlCopy codeCaught an exception: ArithmeticException
```

```
Caught an exception: ArithmeticException
```

### 5. Creating User-Defined Checked and Unchecked Exceptions

```
Exception
```

```
throws
```

```
javaCopy codeclass CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class CheckedExample {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("This is a custom checked exception");
        } catch (CustomCheckedException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
```

```
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class CheckedExample {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("This is a custom checked exception");
        } catch (CustomCheckedException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
```

```
vbnetCopy codeCaught: This is a custom checked exception
```

```
Caught: This is a custom checked exception
```

```
RuntimeException
```

```
javaCopy codeclass CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class UncheckedExample {
    public static void main(String[] args) {
        throw new CustomUncheckedException("This is a custom unchecked exception");
    }
}
```

```
class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class UncheckedExample {
    public static void main(String[] args) {
        throw new CustomUncheckedException("This is a custom unchecked exception");
    }
}
```

```
csharpCopy codeException in thread "main" CustomUncheckedException: This is a custom unchecked exception
```

```
Exception in thread "main" CustomUncheckedException: This is a custom unchecked exception
```

### Key Takeaways

```
Error
```

```
Exception
```

```
RuntimeException
```

```
finally
```

```
catch
```

Let me know if you need more examples or further clarification!

### 1. Brief Introduction to InputStream, OutputStream, Reader, and Writer Interfaces

```
FileInputStream
```

```
BufferedInputStream
```

```
FileOutputStream
```

```
BufferedOutputStream
```

```
javaCopy codeimport java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        // Writing bytes
        OutputStream os = new FileOutputStream("output.txt");
        os.write("Hello, World!".getBytes());
        os.close();

        // Reading bytes
        InputStream is = new FileInputStream("output.txt");
        int data;
        while ((data = is.read()) != -1) {
            System.out.print((char) data);
        }
        is.close();
    }
}
```

```
import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        // Writing bytes
        OutputStream os = new FileOutputStream("output.txt");
        os.write("Hello, World!".getBytes());
        os.close();

        // Reading bytes
        InputStream is = new FileInputStream("output.txt");
        int data;
        while ((data = is.read()) != -1) {
            System.out.print((char) data);
        }
        is.close();
    }
}
```

```
Copy codeHello, World!
```

```
Hello, World!
```

```
FileReader
```

```
BufferedReader
```

```
FileWriter
```

```
BufferedWriter
```

```
javaCopy codeimport java.io.*;

public class CharStreamExample {
    public static void main(String[] args) throws IOException {
        // Writing characters
        Writer writer = new FileWriter("output.txt");
        writer.write("Hello, Reader and Writer!");
        writer.close();

        // Reading characters
        Reader reader = new FileReader("output.txt");
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        reader.close();
    }
}
```

```
import java.io.*;

public class CharStreamExample {
    public static void main(String[] args) throws IOException {
        // Writing characters
        Writer writer = new FileWriter("output.txt");
        writer.write("Hello, Reader and Writer!");
        writer.close();

        // Reading characters
        Reader reader = new FileReader("output.txt");
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        reader.close();
    }
}
```

```
Copy codeHello, Reader and Writer!
```

```
Hello, Reader and Writer!
```

### 2. NIO Package

```
java.nio
```

Buffers:

```
ByteBuffer
```

```
CharBuffer
```

```
IntBuffer
```

Channels:

```
FileChannel
```

```
SocketChannel
```

Selectors:

```
javaCopy codeimport java.nio.file.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.*;

public class NIOExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("output.txt");
        FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();

        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        channel.close();
    }
}
```

```
import java.nio.file.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.*;

public class NIOExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("output.txt");
        FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();

        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        channel.close();
    }
}
```

### 3. Serialization and Deserialization

```
ObjectOutputStream
```

```
ObjectInputStream
```

```
javaCopy codeimport java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialization
        Person person = new Person("John", 30);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(person);
        oos.close();

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person deserializedPerson = (Person) ois.readObject();
        ois.close();

        System.out.println("Deserialized Person: " + deserializedPerson);
    }
}
```

```
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialization
        Person person = new Person("John", 30);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
        oos.writeObject(person);
        oos.close();

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
        Person deserializedPerson = (Person) ois.readObject();
        ois.close();

        System.out.println("Deserialized Person: " + deserializedPerson);
    }
}
```

```
yamlCopy codeDeserialized Person: Name: John, Age: 30
```

```
Deserialized Person: Name: John, Age: 30
```

### 4. Shallow Copy and Deep Copy

```
javaCopy codeclass Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person shallowCopy() {
        return this; // Returns the same object reference
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("John", addr);
        Person p2 = p1.shallowCopy();

        p2.address.city = "Pune"; // Changes city for both p1 and p2
        System.out.println(p1.address.city); // Output: Pune
    }
}
```

```
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person shallowCopy() {
        return this; // Returns the same object reference
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("John", addr);
        Person p2 = p1.shallowCopy();

        p2.address.city = "Pune"; // Changes city for both p1 and p2
        System.out.println(p1.address.city); // Output: Pune
    }
}
```

```
Copy codePune
```

```
Pune
```

```
javaCopy codeclass Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) this.address.clone(); // Deep copy
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("John", addr);
        Person p2 = (Person) p1.clone();

        p2.address.city = "Pune"; // Changes city only for p2
        System.out.println(p1.address.city); // Output: Mumbai
        System.out.println(p2.address.city); // Output: Pune
    }
}
```

```
class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) this.address.clone(); // Deep copy
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Mumbai");
        Person p1 = new Person("John", addr);
        Person p2 = (Person) p1.clone();

        p2.address.city = "Pune"; // Changes city only for p2
        System.out.println(p1.address.city); // Output: Mumbai
        System.out.println(p2.address.city); // Output: Pune
    }
}
```

```
Copy codeMumbai
Pune
```

```
Mumbai
Pune
```

### Summary

```
Buffer
```

```
Channel
```

```
Selector
```

Let me know if you'd like more examples or clarification!

### 1. Date, DateTime, Calendar Class

```
Date
```

```
java.util
```

```
javaCopy codeimport java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date currentDate = new Date(); // Current date and time
        System.out.println("Current Date: " + currentDate);
    }
}
```

```
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date currentDate = new Date(); // Current date and time
        System.out.println("Current Date: " + currentDate);
    }
}
```

```
sqlCopy codeCurrent Date: Wed Jan 08 12:30:45 IST 2025
```

```
Current Date: Wed Jan 08 12:30:45 IST 2025
```

```
Calendar
```

```
java.util
```

```
javaCopy codeimport java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Months are 0-based
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
    }
}
```

```
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Months are 0-based
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
    }
}
```

```
yamlCopy codeYear: 2025
Month: 1
Day: 8
Hour: 12
Minute: 45
```

```
Year: 2025
Month: 1
Day: 8
Hour: 12
Minute: 45
```

```
java.time
```

```
java.time
```

```
LocalDate
```

```
LocalTime
```

```
LocalDateTime
```

```
LocalDateTime
```

```
javaCopy codeimport java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
    }
}
```

```
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
    }
}
```

```
sqlCopy codeCurrent Date and Time: 2025-01-08T12:50:30.123
```

```
Current Date and Time: 2025-01-08T12:50:30.123
```

### 2. Converting Date to String and String to Date Using SimpleDateFormat Class

```
SimpleDateFormat
```

```
java.text
```

```
yyyy
```

```
2025
```

```
MM
```

```
01
```

```
dd
```

```
08
```

```
HH
```

```
13
```

```
mm
```

```
45
```

```
ss
```

```
30
```

```
javaCopy codeimport java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
```

```
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringExample {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
```

```
yamlCopy codeFormatted Date: 2025-01-08 12:45:30
```

```
Formatted Date: 2025-01-08 12:45:30
```

```
javaCopy codeimport java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2025-01-08 12:45:30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(dateStr);
        System.out.println("Parsed Date: " + date);
    }
}
```

```
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2025-01-08 12:45:30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(dateStr);
        System.out.println("Parsed Date: " + date);
    }
}
```

```
yamlCopy codeParsed Date: Wed Jan 08 12:45:30 IST 2025
```

```
Parsed Date: Wed Jan 08 12:45:30 IST 2025
```

### 3. Object Class: Overriding toString, equals, and hashCode

```
toString
```

```
equals
```

```
hashCode
```

```
Object
```

```
Object
```

```
toString()
```

```
equals(Object obj)
```

```
hashCode()
```

```
toString()
```

```
javaCopy codeclass Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println(person); // Calls overridden toString()
    }
}
```

```
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println(person); // Calls overridden toString()
    }
}
```

```
arduinoCopy codePerson{name='John', age=30}
```

```
Person{name='John', age=30}
```

```
equals()
```

```
javaCopy codeclass Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

public class EqualsExample {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        System.out.println(p1.equals(p2)); // true
    }
}
```

```
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

public class EqualsExample {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        System.out.println(p1.equals(p2)); // true
    }
}
```

```
arduinoCopy codetrue
```

```
true
```

```
hashCode()
```

```
HashMap
```

```
javaCopy codeimport java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class HashCodeExample {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        System.out.println("Hash Code: " + p1.hashCode());
    }
}
```

```
import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class HashCodeExample {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        System.out.println("Hash Code: " + p1.hashCode());
    }
}
```

```
cssCopy codeHash Code: 2066939
```

```
Hash Code: 2066939
```

### Summary

```
java.time
```

```
toString
```

```
equals
```

```
hashCode
```

Let me know if you'd like further clarifications or more examples!

### 1. Introduction to Collections: Collection Hierarchy

```
java.util
```

```
ArrayList
```

```
LinkedList
```

```
Vector
```

```
HashSet
```

```
LinkedHashSet
```

```
TreeSet
```

```
PriorityQueue
```

```
LinkedList
```

```
ArrayDeque
```

```
HashMap
```

```
TreeMap
```

```
LinkedHashMap
```

### 2. List, Queue, Set, and Map Collections

```
LinkedHashSet
```

```
TreeSet
```

### 3. List Collection: ArrayList, LinkedList, Vector

```
ArrayList
```

```
LinkedList
```

```
Vector
```

```
javaCopy codeimport java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);
    }
}
```

```
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);
    }
}
```

```
ArrayList
```

```
javaCopy codeimport java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");
        System.out.println("LinkedList: " + list);
    }
}
```

```
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");
        System.out.println("LinkedList: " + list);
    }
}
```

```
ArrayList
```

```
javaCopy codeimport java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Iterating
        for (int i : vector) {
            System.out.println(i);
        }

        // Replace element
        vector.set(1, 25); // Replace 20 with 25
        System.out.println("Updated Vector: " + vector);

        // Search element
        System.out.println("Contains 25: " + vector.contains(25));

        // Sorting
        vector.sort(Integer::compareTo);
        System.out.println("Sorted Vector: " + vector);
    }
}
```

```
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Iterating
        for (int i : vector) {
            System.out.println(i);
        }

        // Replace element
        vector.set(1, 25); // Replace 20 with 25
        System.out.println("Updated Vector: " + vector);

        // Search element
        System.out.println("Contains 25: " + vector.contains(25));

        // Sorting
        vector.sort(Integer::compareTo);
        System.out.println("Sorted Vector: " + vector);
    }
}
```

```
yamlCopy code10
20
30
Updated Vector: [10, 25, 30]
Contains 25: true
Sorted Vector: [10, 25, 30]
```

```
10
20
30
Updated Vector: [10, 25, 30]
Contains 25: true
Sorted Vector: [10, 25, 30]
```

### 4. Collections Class

```
java.util.Collections
```

```
sort()
```

```
reverse()
```

```
shuffle()
```

```
min()
```

```
max()
```

```
binarySearch()
```

```
javaCopy codeimport java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 3, 8, 1, 6);
        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        int max = Collections.max(list);
        System.out.println("Maximum Element: " + max);
    }
}
```

```
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 3, 8, 1, 6);
        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        int max = Collections.max(list);
        System.out.println("Maximum Element: " + max);
    }
}
```

```
mathematicaCopy codeOriginal List: [5, 3, 8, 1, 6]
Sorted List: [1, 3, 5, 6, 8]
Reversed List: [8, 6, 5, 3, 1]
Maximum Element: 8
```

```
Original List: [5, 3, 8, 1, 6]
Sorted List: [1, 3, 5, 6, 8]
Reversed List: [8, 6, 5, 3, 1]
Maximum Element: 8
```

### 5. Comparable and Comparator Interfaces

```
compareTo()
```

```
javaCopy codeimport java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 25));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 22));

        Collections.sort(students); // Uses compareTo
        System.out.println(students);
    }
}
```

```
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 25));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 22));

        Collections.sort(students); // Uses compareTo
        System.out.println(students);
    }
}
```

```
csharpCopy code[Bob (20), Charlie (22), Alice (25)]
```

```
[Bob (20), Charlie (22), Alice (25)]
```

```
compare()
```

```
javaCopy codeimport java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 25));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 22));

        // Custom Comparator for descending age
        Comparator<Student> byAgeDesc = (s1, s2) -> Integer.compare(s2.age, s1.age);
        students.sort(byAgeDesc);

        System.out.println(students);
    }
}
```

```
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 25));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 22));

        // Custom Comparator for descending age
        Comparator<Student> byAgeDesc = (s1, s2) -> Integer.compare(s2.age, s1.age);
        students.sort(byAgeDesc);

        System.out.println(students);
    }
}
```

```
csharpCopy code[Alice (25), Charlie (22), Bob (20)]
```

```
[Alice (25), Charlie (22), Bob (20)]
```

### 6. Queue Collection

```
PriorityQueue
```

```
LinkedList
```

```
javaCopy codeimport java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(15);

        System.out.println("Head of Queue: " + queue.peek()); // Smallest element
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Removes and returns the head
        }
    }
}
```

```
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(15);

        System.out.println("Head of Queue: " + queue.peek()); // Smallest element
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Removes and returns the head
        }
    }
}
```

```
mathematicaCopy codeHead of Queue: 5
5
10
15
```

```
Head of Queue: 5
5
10
15
```

### Summary

```
ArrayList
```

```
compareTo()
```

```
compare()
```

Let me know if you'd like further clarifications or additional examples!

### 1. List Collection

The List Collection is an ordered collection that allows duplicate elements. Here are detailed descriptions and operations for ArrayList, LinkedList, and Vector.

```
ArrayList
```

```
LinkedList
```

```
Vector
```

```
javaCopy codeimport java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        // Insert
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After Insert: " + list);

        // Delete
        list.remove("Banana");
        System.out.println("After Delete: " + list);

        // Search
        System.out.println("Contains 'Cherry': " + list.contains("Cherry"));

        // Sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Iterate
        System.out.println("Iterating:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Replace
        list.set(1, "Blueberry");
        System.out.println("After Replace: " + list);
    }
}
```

```
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        // Insert
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After Insert: " + list);

        // Delete
        list.remove("Banana");
        System.out.println("After Delete: " + list);

        // Search
        System.out.println("Contains 'Cherry': " + list.contains("Cherry"));

        // Sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Iterate
        System.out.println("Iterating:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Replace
        list.set(1, "Blueberry");
        System.out.println("After Replace: " + list);
    }
}
```

```
mathematicaCopy codeAfter Insert: [Apple, Banana, Cherry]
After Delete: [Apple, Cherry]
Contains 'Cherry': true
Sorted List: [Apple, Cherry]
Iterating:
Apple
Cherry
After Replace: [Apple, Blueberry]
```

```
After Insert: [Apple, Banana, Cherry]
After Delete: [Apple, Cherry]
Contains 'Cherry': true
Sorted List: [Apple, Cherry]
Iterating:
Apple
Cherry
After Replace: [Apple, Blueberry]
```

```
ArrayList
```

```
javaCopy codeimport java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Insert
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");
        System.out.println("After Insert: " + list);

        // Delete
        list.remove("Cat");
        System.out.println("After Delete: " + list);

        // Search
        System.out.println("Contains 'Bird': " + list.contains("Bird"));

        // Iterate
        System.out.println("Iterating:");
        for (String animal : list) {
            System.out.println(animal);
        }

        // Replace
        list.set(1, "Rabbit");
        System.out.println("After Replace: " + list);
    }
}
```

```
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Insert
        list.add("Dog");
        list.add("Cat");
        list.add("Bird");
        System.out.println("After Insert: " + list);

        // Delete
        list.remove("Cat");
        System.out.println("After Delete: " + list);

        // Search
        System.out.println("Contains 'Bird': " + list.contains("Bird"));

        // Iterate
        System.out.println("Iterating:");
        for (String animal : list) {
            System.out.println(animal);
        }

        // Replace
        list.set(1, "Rabbit");
        System.out.println("After Replace: " + list);
    }
}
```

```
mathematicaCopy codeAfter Insert: [Dog, Cat, Bird]
After Delete: [Dog, Bird]
Contains 'Bird': true
Iterating:
Dog
Bird
After Replace: [Dog, Rabbit]
```

```
After Insert: [Dog, Cat, Bird]
After Delete: [Dog, Bird]
Contains 'Bird': true
Iterating:
Dog
Bird
After Replace: [Dog, Rabbit]
```

```
ArrayList
```

```
javaCopy codeimport java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Insert
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("After Insert: " + vector);

        // Delete
        vector.remove(Integer.valueOf(20));
        System.out.println("After Delete: " + vector);

        // Search
        System.out.println("Contains 30: " + vector.contains(30));

        // Sort
        vector.sort(Integer::compareTo);
        System.out.println("Sorted Vector: " + vector);

        // Iterate
        System.out.println("Iterating:");
        for (int num : vector) {
            System.out.println(num);
        }

        // Replace
        vector.set(1, 25);
        System.out.println("After Replace: " + vector);
    }
}
```

```
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Insert
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("After Insert: " + vector);

        // Delete
        vector.remove(Integer.valueOf(20));
        System.out.println("After Delete: " + vector);

        // Search
        System.out.println("Contains 30: " + vector.contains(30));

        // Sort
        vector.sort(Integer::compareTo);
        System.out.println("Sorted Vector: " + vector);

        // Iterate
        System.out.println("Iterating:");
        for (int num : vector) {
            System.out.println(num);
        }

        // Replace
        vector.set(1, 25);
        System.out.println("After Replace: " + vector);
    }
}
```

```
yamlCopy codeAfter Insert: [10, 20, 30]
After Delete: [10, 30]
Contains 30: true
Sorted Vector: [10, 30]
Iterating:
10
30
After Replace: [10, 25]
```

```
After Insert: [10, 20, 30]
After Delete: [10, 30]
Contains 30: true
Sorted Vector: [10, 30]
Iterating:
10
30
After Replace: [10, 25]
```

### 2. Collections Class

The java.util.Collections class provides utility methods for collections.

```
java.util.Collections
```

```
sort()
```

```
reverse()
```

```
shuffle()
```

```
binarySearch()
```

```
min()
```

```
max()
```

```
javaCopy codeimport java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 15, 20, 25);

        // Sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Reverse
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // Shuffle
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // Min and Max
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));

        // Binary Search
        Collections.sort(list);
        int index = Collections.binarySearch(list, 15);
        System.out.println("Index of 15: " + index);
    }
}
```

```
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 15, 20, 25);

        // Sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Reverse
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // Shuffle
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        // Min and Max
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));

        // Binary Search
        Collections.sort(list);
        int index = Collections.binarySearch(list, 15);
        System.out.println("Index of 15: " + index);
    }
}
```

```
yamlCopy codeSorted List: [5, 10, 15, 20, 25]
Reversed List: [25, 20, 15, 10, 5]
Shuffled List: [15, 5, 20, 25, 10]
Min: 5
Max: 25
Index of 15: 2
```

```
Sorted List: [5, 10, 15, 20, 25]
Reversed List: [25, 20, 15, 10, 5]
Shuffled List: [15, 5, 20, 25, 10]
Min: 5
Max: 25
Index of 15: 2
```

### 3. Comparable and Comparator Interfaces

```
compareTo()
```

```
javaCopy codeimport java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        Collections.sort(students);
        System.out.println("Sorted Students: " + students);
    }
}
```

```
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        Collections.sort(students);
        System.out.println("Sorted Students: " + students);
    }
}
```

```
lessCopy codeSorted Students: [Bob (20), Alice (22), Charlie (25)]
```

```
Sorted Students: [Bob (20), Alice (22), Charlie (25)]
```

```
compare()
```

```
javaCopy codeimport java.util.ArrayList;
import java.util.Comparator;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        // Custom Comparator
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Students Sorted by Name: " + students);
    }
}
```

```
import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        // Custom Comparator
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Students Sorted by Name: " + students);
    }
}
```

```
csharpCopy codeStudents Sorted by Name: [Alice (22), Bob (20), Charlie (25)]
```

```
Students Sorted by Name: [Alice (22), Bob (20), Charlie (25)]
```

### 4. Queue Collection

```
PriorityQueue
```

```
LinkedList
```

```
javaCopy codeimport java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements
        queue.add(30);
        queue.add(20);
        queue.add(10);

        // Access head
        System.out.println("Head of Queue: " + queue.peek());

        // Remove elements
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```

```
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements
        queue.add(30);
        queue.add(20);
        queue.add(10);

        // Access head
        System.out.println("Head of Queue: " + queue.peek());

        // Remove elements
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```

```
mathematicaCopy codeHead of Queue: 10
10
20
30
```

```
Head of Queue: 10
10
20
30
```

### Summary

```
ArrayList
```

```
sort()
```

```
reverse()
```

```
shuffle()
```

```
compareTo()
```

```
compare()
```

Let me know if you'd like further clarifications or additional examples!

### 1. Set Collection

The Set Collection in Java is a part of the java.util package. It is used to store unique elements and does not allow duplicates.

```
java.util
```

### Set Implementations

```
null
```

```
javaCopy codeimport java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Insert elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        // Display elements
        System.out.println("HashSet: " + set);

        // Search
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Delete
        set.remove("Banana");
        System.out.println("After Remove: " + set);

        // Iterate
        System.out.println("Iterating:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

```
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Insert elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        // Display elements
        System.out.println("HashSet: " + set);

        // Search
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Delete
        set.remove("Banana");
        System.out.println("After Remove: " + set);

        // Iterate
        System.out.println("Iterating:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

```
yamlCopy codeHashSet: [Apple, Cherry, Banana]
Contains 'Banana': true
After Remove: [Apple, Cherry]
Iterating:
Apple
Cherry
```

```
HashSet: [Apple, Cherry, Banana]
Contains 'Banana': true
After Remove: [Apple, Cherry]
Iterating:
Apple
Cherry
```

```
javaCopy codeimport java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Insert elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, will not be added

        // Display elements
        System.out.println("LinkedHashSet: " + set);

        // Iterate
        System.out.println("Iterating:");
        for (int num : set) {
            System.out.println(num);
        }
    }
}
```

```
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Insert elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, will not be added

        // Display elements
        System.out.println("LinkedHashSet: " + set);

        // Iterate
        System.out.println("Iterating:");
        for (int num : set) {
            System.out.println(num);
        }
    }
}
```

```
makefileCopy codeLinkedHashSet: [10, 20, 30]
Iterating:
10
20
30
```

```
LinkedHashSet: [10, 20, 30]
Iterating:
10
20
30
```

```
javaCopy codeimport java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        // Insert elements
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");

        // Display elements (sorted order)
        System.out.println("TreeSet: " + set);

        // Search
        System.out.println("Contains 'Apple': " + set.contains("Apple"));

        // Delete
        set.remove("Banana");
        System.out.println("After Remove: " + set);

        // Iterate
        System.out.println("Iterating:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

```
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        // Insert elements
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");

        // Display elements (sorted order)
        System.out.println("TreeSet: " + set);

        // Search
        System.out.println("Contains 'Apple': " + set.contains("Apple"));

        // Delete
        set.remove("Banana");
        System.out.println("After Remove: " + set);

        // Iterate
        System.out.println("Iterating:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

```
mathematicaCopy codeTreeSet: [Apple, Banana, Orange]
Contains 'Apple': true
After Remove: [Apple, Orange]
Iterating:
Apple
Orange
```

```
TreeSet: [Apple, Banana, Orange]
Contains 'Apple': true
After Remove: [Apple, Orange]
Iterating:
Apple
Orange
```

### Comparison of Set Implementations

```
null
```

```
null
```

```
null
```

### 2. Backed Set Collections

```
javaCopy codeimport java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class BackedSetExample {
    public static void main(String[] args) {
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("A");
        originalSet.add("B");
        originalSet.add("C");

        // Create a backed synchronized set
        Set<String> synchronizedSet = Collections.synchronizedSet(originalSet);

        // Modify the original set
        originalSet.add("D");

        // Access through backed collection
        System.out.println("Synchronized Set: " + synchronizedSet);

        // Modify the backed collection
        synchronizedSet.remove("A");

        // Access through original set
        System.out.println("Original Set: " + originalSet);
    }
}
```

```
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class BackedSetExample {
    public static void main(String[] args) {
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("A");
        originalSet.add("B");
        originalSet.add("C");

        // Create a backed synchronized set
        Set<String> synchronizedSet = Collections.synchronizedSet(originalSet);

        // Modify the original set
        originalSet.add("D");

        // Access through backed collection
        System.out.println("Synchronized Set: " + synchronizedSet);

        // Modify the backed collection
        synchronizedSet.remove("A");

        // Access through original set
        System.out.println("Original Set: " + originalSet);
    }
}
```

```
mathematicaCopy codeSynchronized Set: [A, B, C, D]
Original Set: [B, C, D]
```

```
Synchronized Set: [A, B, C, D]
Original Set: [B, C, D]
```

### Advanced Example: TreeSet with Comparator

```
javaCopy codeimport java.util.TreeSet;
import java.util.Comparator;

public class CustomTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());

        // Insert elements
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");

        // Display elements (reverse order)
        System.out.println("Custom Ordered TreeSet: " + set);
    }
}
```

```
import java.util.TreeSet;
import java.util.Comparator;

public class CustomTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());

        // Insert elements
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");

        // Display elements (reverse order)
        System.out.println("Custom Ordered TreeSet: " + set);
    }
}
```

```
lessCopy codeCustom Ordered TreeSet: [Orange, Banana, Apple]
```

```
Custom Ordered TreeSet: [Orange, Banana, Apple]
```

### Summary

```
null
```

```
null
```

```
null
```

Let me know if you need further clarifications or additional examples!

### Map Collection

The Map Collection in Java is part of the java.util package and is used to store key-value pairs. Keys in a Map must be unique, while values can be duplicated.

```
java.util
```

### 1. Map Implementations

```
javaCopy codeimport java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Insert duplicate key (overwrites the value)
        map.put(1, "Orange");

        // Display map
        System.out.println("HashMap: " + map);

        // Access a value
        System.out.println("Value for key 2: " + map.get(2));

        // Remove a key-value pair
        map.remove(3);
        System.out.println("After Remove: " + map);

        // Iterate over entries
        System.out.println("Iterating:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

```
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Insert duplicate key (overwrites the value)
        map.put(1, "Orange");

        // Display map
        System.out.println("HashMap: " + map);

        // Access a value
        System.out.println("Value for key 2: " + map.get(2));

        // Remove a key-value pair
        map.remove(3);
        System.out.println("After Remove: " + map);

        // Iterate over entries
        System.out.println("Iterating:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

```
mathematicaCopy codeHashMap: {1=Orange, 2=Banana, 3=Cherry}
Value for key 2: Banana
After Remove: {1=Orange, 2=Banana}
Iterating:
1 -> Orange
2 -> Banana
```

```
HashMap: {1=Orange, 2=Banana, 3=Cherry}
Value for key 2: Banana
After Remove: {1=Orange, 2=Banana}
Iterating:
1 -> Orange
2 -> Banana
```

```
javaCopy codeimport java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Insert key-value pairs
        map.put(1, "Dog");
        map.put(2, "Cat");
        map.put(3, "Rabbit");

        // Display map
        System.out.println("LinkedHashMap: " + map);

        // Iterate in insertion order
        System.out.println("Iterating:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

```
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Insert key-value pairs
        map.put(1, "Dog");
        map.put(2, "Cat");
        map.put(3, "Rabbit");

        // Display map
        System.out.println("LinkedHashMap: " + map);

        // Iterate in insertion order
        System.out.println("Iterating:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

```
rustCopy codeLinkedHashMap: {1=Dog, 2=Cat, 3=Rabbit}
Iterating:
1 -> Dog
2 -> Cat
3 -> Rabbit
```

```
LinkedHashMap: {1=Dog, 2=Cat, 3=Rabbit}
Iterating:
1 -> Dog
2 -> Cat
3 -> Rabbit
```

```
javaCopy codeimport java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Insert key-value pairs
        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Banana");

        // Display map (sorted by keys)
        System.out.println("TreeMap: " + map);

        // Access a specific value
        System.out.println("Value for key 2: " + map.get(2));

        // Iterate in sorted order
        System.out.println("Iterating:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

```
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Insert key-value pairs
        map.put(3, "Orange");
        map.put(1, "Apple");
        map.put(2, "Banana");

        // Display map (sorted by keys)
        System.out.println("TreeMap: " + map);

        // Access a specific value
        System.out.println("Value for key 2: " + map.get(2));

        // Iterate in sorted order
        System.out.println("Iterating:");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

```
rustCopy codeTreeMap: {1=Apple, 2=Banana, 3=Orange}
Value for key 2: Banana
Iterating:
1 -> Apple
2 -> Banana
3 -> Orange
```

```
TreeMap: {1=Apple, 2=Banana, 3=Orange}
Value for key 2: Banana
Iterating:
1 -> Apple
2 -> Banana
3 -> Orange
```

```
HashMap
```

```
HashMap
```

```
javaCopy codeimport java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        // Insert key-value pairs
        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "Three");

        // Display table
        System.out.println("Hashtable: " + table);

        // Access a value
        System.out.println("Value for key 2: " + table.get(2));

        // Remove a key-value pair
        table.remove(3);
        System.out.println("After Remove: " + table);
    }
}
```

```
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        // Insert key-value pairs
        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "Three");

        // Display table
        System.out.println("Hashtable: " + table);

        // Access a value
        System.out.println("Value for key 2: " + table.get(2));

        // Remove a key-value pair
        table.remove(3);
        System.out.println("After Remove: " + table);
    }
}
```

```
yamlCopy codeHashtable: {3=Three, 2=Two, 1=One}
Value for key 2: Two
After Remove: {2=Two, 1=One}
```

```
Hashtable: {3=Three, 2=Two, 1=One}
Value for key 2: Two
After Remove: {2=Two, 1=One}
```

### Comparison of Map Implementations

```
HashMap
```

### 2. Backed Map Collections

```
TreeMap
```

```
javaCopy codeimport java.util.TreeMap;
import java.util.SortedMap;

public class BackedMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Create a backed submap
        SortedMap<Integer, String> subMap = map.subMap(2, 5);

        // Modify the original map
        map.put(3, "Three Updated");

        // Access through backed submap
        System.out.println("SubMap: " + subMap);

        // Modify the submap
        subMap.put(4, "Four Updated");

        // Access through original map
        System.out.println("Original Map: " + map);
    }
}
```

```
import java.util.TreeMap;
import java.util.SortedMap;

public class BackedMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Create a backed submap
        SortedMap<Integer, String> subMap = map.subMap(2, 5);

        // Modify the original map
        map.put(3, "Three Updated");

        // Access through backed submap
        System.out.println("SubMap: " + subMap);

        // Modify the submap
        subMap.put(4, "Four Updated");

        // Access through original map
        System.out.println("Original Map: " + map);
    }
}
```

```
cssCopy codeSubMap: {2=Two, 3=Three Updated, 4=Four}
Original Map: {1=One, 2=Two, 3=Three Updated, 4=Four Updated, 5=Five}
```

```
SubMap: {2=Two, 3=Three Updated, 4=Four}
Original Map: {1=One, 2=Two, 3=Three Updated, 4=Four Updated, 5=Five}
```

### Advanced Example: TreeMap with Comparator

```
javaCopy codeimport java.util.TreeMap;
import java.util.Comparator;

public class TreeMapWithComparator {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        // Insert key-value pairs
        map.put("Orange", 3);
        map.put("Apple", 1);
        map.put("Banana", 2);

        // Display map (custom sorted order)
        System.out.println("TreeMap with Custom Comparator: " + map);
    }
}
```

```
import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapWithComparator {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        // Insert key-value pairs
        map.put("Orange", 3);
        map.put("Apple", 1);
        map.put("Banana", 2);

        // Display map (custom sorted order)
        System.out.println("TreeMap with Custom Comparator: " + map);
    }
}
```

```
mathematicaCopy codeTreeMap with Custom Comparator: {Orange=3, Banana=2, Apple=1}
```

```
TreeMap with Custom Comparator: {Orange=3, Banana=2, Apple=1}
```

### Summary

Let me know if you'd like further clarifications or additional examples!

### 1. Concurrent Collections

```
java.util.concurrent
```

```
Vector
```

```
Hashtable
```

```
ConcurrentHashMap
```

```
HashMap
```

```
CopyOnWriteArrayList
```

```
ArrayList
```

```
CopyOnWriteArraySet
```

```
Set
```

```
CopyOnWriteArrayList
```

```
ConcurrentLinkedQueue
```

```
ConcurrentSkipListMap
```

```
ConcurrentSkipListSet
```

```
BlockingQueue
```

```
ArrayBlockingQueue
```

```
LinkedBlockingQueue
```

```
javaCopy codeimport java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Retrieve and iterate
        System.out.println("ConcurrentHashMap: " + map);
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Remove an element
        map.remove(2);
        System.out.println("After Remove: " + map);
    }
}
```

```
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Add elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Retrieve and iterate
        System.out.println("ConcurrentHashMap: " + map);
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Remove an element
        map.remove(2);
        System.out.println("After Remove: " + map);
    }
}
```

```
rustCopy codeConcurrentHashMap: {1=Apple, 2=Banana, 3=Cherry}
1 -> Apple
2 -> Banana
3 -> Cherry
After Remove: {1=Apple, 3=Cherry}
```

```
ConcurrentHashMap: {1=Apple, 2=Banana, 3=Cherry}
1 -> Apple
2 -> Banana
3 -> Cherry
After Remove: {1=Apple, 3=Cherry}
```

```
javaCopy codeimport java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add elements
        list.add("Dog");
        list.add("Cat");
        list.add("Rabbit");

        // Iterate (safe during concurrent modification)
        System.out.println("CopyOnWriteArrayList:");
        for (String animal : list) {
            System.out.println(animal);
        }

        // Add during iteration
        for (String animal : list) {
            list.add("Bird");
        }
        System.out.println("After Adding: " + list);
    }
}
```

```
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add elements
        list.add("Dog");
        list.add("Cat");
        list.add("Rabbit");

        // Iterate (safe during concurrent modification)
        System.out.println("CopyOnWriteArrayList:");
        for (String animal : list) {
            System.out.println(animal);
        }

        // Add during iteration
        for (String animal : list) {
            list.add("Bird");
        }
        System.out.println("After Adding: " + list);
    }
}
```

```
yamlCopy codeCopyOnWriteArrayList:
Dog
Cat
Rabbit
After Adding: [Dog, Cat, Rabbit, Bird, Bird, Bird]
```

```
CopyOnWriteArrayList:
Dog
Cat
Rabbit
After Adding: [Dog, Cat, Rabbit, Bird, Bird, Bird]
```

```
javaCopy codeimport java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        // Add elements
        queue.put(1);
        queue.put(2);
        queue.put(3);
        System.out.println("Queue: " + queue);

        // Remove and retrieve elements
        System.out.println("Polled Element: " + queue.take());
        System.out.println("Queue After Poll: " + queue);
    }
}
```

```
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        // Add elements
        queue.put(1);
        queue.put(2);
        queue.put(3);
        System.out.println("Queue: " + queue);

        // Remove and retrieve elements
        System.out.println("Polled Element: " + queue.take());
        System.out.println("Queue After Poll: " + queue);
    }
}
```

```
yamlCopy codeQueue: [1, 2, 3]
Polled Element: 1
Queue After Poll: [2, 3]
```

```
Queue: [1, 2, 3]
Polled Element: 1
Queue After Poll: [2, 3]
```

### 2. Implementation of Java 8 Stream API

Intermediate Operations:

```
filter()
```

```
map()
```

```
sorted()
```

Terminal Operations:

```
forEach()
```

```
collect()
```

```
reduce()
```

```
javaCopy codeimport java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names starting with "A" and convert to uppercase
        names.stream()
             .filter(name -> name.startsWith("A"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
```

```
import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names starting with "A" and convert to uppercase
        names.stream()
             .filter(name -> name.startsWith("A"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
```

```
Copy codeALICE
```

```
ALICE
```

```
javaCopy codeimport java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        // Sort in ascending order
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}
```

```
import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        // Sort in ascending order
        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}
```

```
Copy code1
2
3
5
8
```

```
1
2
3
5
8
```

```
javaCopy codeimport java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filter even numbers and collect them into a list
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
```

```
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filter even numbers and collect them into a list
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
```

```
lessCopy codeEven Numbers: [2, 4]
```

```
Even Numbers: [2, 4]
```

```
reduce()
```

```
javaCopy codeimport java.util.Arrays;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}
```

```
import java.util.Arrays;
import java.util.List;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}
```

```
makefileCopy codeSum: 15
```

```
Sum: 15
```

```
javaCopy codeimport java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                 .parallel()
                 .forEach(System.out::println);
    }
}
```

```
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                 .parallel()
                 .forEach(System.out::println);
    }
}
```

```
pythonCopy code1
2
3
...
```

```
1
2
3
...
```

### Summary

```
ConcurrentHashMap
```

```
CopyOnWriteArrayList
```

```
BlockingQueue
```

```
filter
```

```
map
```

```
reduce
```

```
collect()
```

```
forEach()
```

Let me know if you'd like further details or more examples!

### 1. Multithreading: Thread Class and Runnable Interface

```
Thread
```

```
Thread
```

```
run()
```

```
javaCopy codeclass MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Start the thread
    }
}
```

```
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Start the thread
    }
}
```

```
mathematicaCopy codeThread is running: Thread-0
```

```
Thread is running: Thread-0
```

```
Runnable
```

```
Runnable
```

```
run()
```

```
javaCopy codeclass MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
```

```
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
```

```
mathematicaCopy codeThread is running: Thread-0
```

```
Thread is running: Thread-0
```

### 2. Methods of the Thread Class

```
sleep()
```

```
InterruptedException
```

```
javaCopy codepublic class SleepExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread sleeping...");
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("Thread woke up!");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        });
        thread.start();
    }
}
```

```
public class SleepExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread sleeping...");
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("Thread woke up!");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        });
        thread.start();
    }
}
```

```
mathematicaCopy codeThread sleeping...
Thread woke up!
```

```
Thread sleeping...
Thread woke up!
```

```
join()
```

```
javaCopy codepublic class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread running...");
        });

        thread.start();
        thread.join(); // Wait for the thread to finish
        System.out.println("Main thread continues after child thread finishes.");
    }
}
```

```
public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Thread running...");
        });

        thread.start();
        thread.join(); // Wait for the thread to finish
        System.out.println("Main thread continues after child thread finishes.");
    }
}
```

```
arduinoCopy codeThread running...
Main thread continues after child thread finishes.
```

```
Thread running...
Main thread continues after child thread finishes.
```

```
yield()
```

```
javaCopy codepublic class YieldExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 executing");
                Thread.yield();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 executing");
            }
        });

        thread1.start();
        thread2.start();
    }
}
```

```
public class YieldExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 executing");
                Thread.yield();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 executing");
            }
        });

        thread1.start();
        thread2.start();
    }
}
```

```
mathematicaCopy codeThread 1 executing
Thread 2 executing
...
```

```
Thread 1 executing
Thread 2 executing
...
```

```
setPriority()
```

```
getPriority()
```

```
setPriority(int priority)
```

```
Thread.MIN_PRIORITY
```

```
Thread.MAX_PRIORITY
```

```
getPriority()
```

```
javaCopy codepublic class PriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("Thread 1 running"));
        Thread thread2 = new Thread(() -> System.out.println("Thread 2 running"));

        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Highest priority

        System.out.println("Thread 1 Priority: " + thread1.getPriority());
        System.out.println("Thread 2 Priority: " + thread2.getPriority());

        thread1.start();
        thread2.start();
    }
}
```

```
public class PriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("Thread 1 running"));
        Thread thread2 = new Thread(() -> System.out.println("Thread 2 running"));

        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Highest priority

        System.out.println("Thread 1 Priority: " + thread1.getPriority());
        System.out.println("Thread 2 Priority: " + thread2.getPriority());

        thread1.start();
        thread2.start();
    }
}
```

```
mathematicaCopy codeThread 1 Priority: 1
Thread 2 Priority: 10
Thread 1 running
Thread 2 running
```

```
Thread 1 Priority: 1
Thread 2 Priority: 10
Thread 1 running
Thread 2 running
```

### 3. ThreadGroup Class

```
ThreadGroup
```

```
javaCopy codepublic class ThreadGroupExample {
    public static void main(String[] args) {
        // Create a thread group
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        // Create threads in the group
        Thread thread1 = new Thread(group, () -> System.out.println("Thread 1 running"), "Thread-1");
        Thread thread2 = new Thread(group, () -> System.out.println("Thread 2 running"), "Thread-2");

        thread1.start();
        thread2.start();

        // Display information about the thread group
        System.out.println("Thread Group Name: " + group.getName());
        System.out.println("Active Threads: " + group.activeCount());
    }
}
```

```
public class ThreadGroupExample {
    public static void main(String[] args) {
        // Create a thread group
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        // Create threads in the group
        Thread thread1 = new Thread(group, () -> System.out.println("Thread 1 running"), "Thread-1");
        Thread thread2 = new Thread(group, () -> System.out.println("Thread 2 running"), "Thread-2");

        thread1.start();
        thread2.start();

        // Display information about the thread group
        System.out.println("Thread Group Name: " + group.getName());
        System.out.println("Active Threads: " + group.activeCount());
    }
}
```

```
mathematicaCopy codeThread 1 running
Thread 2 running
Thread Group Name: MyThreadGroup
Active Threads: 2
```

```
Thread 1 running
Thread 2 running
Thread Group Name: MyThreadGroup
Active Threads: 2
```

```
javaCopy codepublic class ThreadGroupInterruptExample {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");

        Thread thread1 = new Thread(group, () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 1 working...");
            }
            System.out.println("Thread 1 interrupted.");
        });

        Thread thread2 = new Thread(group, () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 2 working...");
            }
            System.out.println("Thread 2 interrupted.");
        });

        thread1.start();
        thread2.start();

        // Interrupt all threads in the group after 2 seconds
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                group.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
```

```
public class ThreadGroupInterruptExample {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");

        Thread thread1 = new Thread(group, () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 1 working...");
            }
            System.out.println("Thread 1 interrupted.");
        });

        Thread thread2 = new Thread(group, () -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 2 working...");
            }
            System.out.println("Thread 2 interrupted.");
        });

        thread1.start();
        thread2.start();

        // Interrupt all threads in the group after 2 seconds
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                group.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
```

```
mathematicaCopy codeThread 1 working...
Thread 2 working...
...
Thread 1 interrupted.
Thread 2 interrupted.
```

```
Thread 1 working...
Thread 2 working...
...
Thread 1 interrupted.
Thread 2 interrupted.
```

### Summary

```
Thread
```

```
Runnable
```

```
sleep()
```

```
join()
```

```
yield()
```

```
setPriority()
```

```
getPriority()
```

Let me know if you'd like further examples or clarifications!

### Key Points of Multithreading in Java

```
Thread
```

```
run()
```

```
start()
```

```
Thread
```

```
Runnable
```

```
super(threadName)
```

```
setName(threadName)
```

```
getName()
```

```
Thread.currentThread()
```

```
Thread.sleep(milliseconds)
```

```
Runnable
```

```
run()
```

```
Runnable
```

```
Thread
```

```
start()
```

```
Thread
```

Example:

```
javaCopy codeclass MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable(); // Runnable object
        Thread t1 = new Thread(runnable);      // Thread object
        t1.start();                            // Start thread
    }
}
```

```
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable(); // Runnable object
        Thread t1 = new Thread(runnable);      // Thread object
        t1.start();                            // Start thread
    }
}
```

Output:

```
mathematicaCopy codeThread is running: Thread-0
```

```
Thread is running: Thread-0
```

```
Runnable
```

Example:

```
javaCopy codeclass SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.printNumbers(), "Thread-1");
        Thread t2 = new Thread(() -> resource.printNumbers(), "Thread-2");

        t1.start();
        t2.start();
    }
}
```

```
class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.printNumbers(), "Thread-1");
        Thread t2 = new Thread(() -> resource.printNumbers(), "Thread-2");

        t1.start();
        t2.start();
    }
}
```

Output:

```
mathematicaCopy codeThread-1 - 1
Thread-1 - 2
Thread-1 - 3
Thread-1 - 4
Thread-1 - 5
Thread-2 - 1
Thread-2 - 2
Thread-2 - 3
Thread-2 - 4
Thread-2 - 5
```

```
Thread-1 - 1
Thread-1 - 2
Thread-1 - 3
Thread-1 - 4
Thread-1 - 5
Thread-2 - 1
Thread-2 - 2
Thread-2 - 3
Thread-2 - 4
Thread-2 - 5
```

join():

```
join()
```

Example:

```
javaCopy codepublic class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 executing");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t1.join(); // Main thread waits for t1 to finish

        System.out.println("Main thread resumes");
    }
}
```

```
public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 executing");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t1.join(); // Main thread waits for t1 to finish

        System.out.println("Main thread resumes");
    }
}
```

Output:

```
mathematicaCopy codeThread 1 executing
Thread 1 executing
Thread 1 executing
Thread 1 executing
Thread 1 executing
Main thread resumes
```

```
Thread 1 executing
Thread 1 executing
Thread 1 executing
Thread 1 executing
Thread 1 executing
Main thread resumes
```

```
thread.setDaemon(true)
```

Example:

```
javaCopy codepublic class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Main thread ends");
    }
}
```

```
public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println("Main thread ends");
    }
}
```

Output:

```
arduinoCopy codeMain thread ends
Daemon thread running...
```

```
Main thread ends
Daemon thread running...
```

```
wait()
```

```
notify()
```

```
notifyAll()
```

Example:

```
javaCopy codeclass Shared {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producing...");
        wait(); // Wait until notified
        System.out.println("Resumed production");
    }

    synchronized void consume() {
        System.out.println("Consuming...");
        notify(); // Notify waiting thread
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Shared resource = new Shared();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(resource::consume);

        producer.start();
        consumer.start();
    }
}
```

```
class Shared {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producing...");
        wait(); // Wait until notified
        System.out.println("Resumed production");
    }

    synchronized void consume() {
        System.out.println("Consuming...");
        notify(); // Notify waiting thread
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Shared resource = new Shared();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(resource::consume);

        producer.start();
        consumer.start();
    }
}
```

Output:

```
Copy codeProducing...
Consuming...
Resumed production
```

```
Producing...
Consuming...
Resumed production
```

### Summary

```
Thread
```

```
Runnable
```

```
synchronized
```

Let me know if you need further details or examples!

### 1. Synchronization

Synchronized Method:

```
javaCopy codesynchronized void sharedMethod() {
    // critical section
}
```

```
synchronized void sharedMethod() {
    // critical section
}
```

Synchronized Block:

```
javaCopy codevoid sharedMethod() {
    synchronized (this) {
        // critical section
    }
}
```

```
void sharedMethod() {
    synchronized (this) {
        // critical section
    }
}
```

```
javaCopy codeclass SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.printNumbers(), "Thread-1");
        Thread t2 = new Thread(() -> resource.printNumbers(), "Thread-2");

        t1.start();
        t2.start();
    }
}
```

```
class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.printNumbers(), "Thread-1");
        Thread t2 = new Thread(() -> resource.printNumbers(), "Thread-2");

        t1.start();
        t2.start();
    }
}
```

```
mathematicaCopy codeThread-1 - 1
Thread-1 - 2
Thread-1 - 3
Thread-1 - 4
Thread-1 - 5
Thread-2 - 1
Thread-2 - 2
Thread-2 - 3
Thread-2 - 4
Thread-2 - 5
```

```
Thread-1 - 1
Thread-1 - 2
Thread-1 - 3
Thread-1 - 4
Thread-1 - 5
Thread-2 - 1
Thread-2 - 2
Thread-2 - 3
Thread-2 - 4
Thread-2 - 5
```

### 2. Deadlock

```
javaCopy codeclass Resource {
    synchronized void method1(Resource other) {
        System.out.println(Thread.currentThread().getName() + " executing method1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        other.method2(); // Tries to call method2 of the other resource
    }

    synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " executing method2");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread t1 = new Thread(() -> resource1.method1(resource2), "Thread-1");
        Thread t2 = new Thread(() -> resource2.method1(resource1), "Thread-2");

        t1.start();
        t2.start();
    }
}
```

```
class Resource {
    synchronized void method1(Resource other) {
        System.out.println(Thread.currentThread().getName() + " executing method1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        other.method2(); // Tries to call method2 of the other resource
    }

    synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " executing method2");
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread t1 = new Thread(() -> resource1.method1(resource2), "Thread-1");
        Thread t2 = new Thread(() -> resource2.method1(resource1), "Thread-2");

        t1.start();
        t2.start();
    }
}
```

### 3. Wait, notify, and notifyAll Methods

```
wait()
```

```
notify()
```

```
notifyAll()
```

```
notify()
```

```
notifyAll()
```

```
javaCopy codeclass SharedResource {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producing...");
        wait(); // Wait until notified
        System.out.println("Resumed production");
    }

    synchronized void consume() {
        System.out.println("Consuming...");
        notify(); // Notify the waiting thread
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(resource::consume);

        producer.start();
        consumer.start();
    }
}
```

```
class SharedResource {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producing...");
        wait(); // Wait until notified
        System.out.println("Resumed production");
    }

    synchronized void consume() {
        System.out.println("Consuming...");
        notify(); // Notify the waiting thread
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(resource::consume);

        producer.start();
        consumer.start();
    }
}
```

```
Copy codeProducing...
Consuming...
Resumed production
```

```
Producing...
Consuming...
Resumed production
```

### 4. Producer-Consumer Problem

```
wait()
```

```
notify()
```

```
javaCopy codeimport java.util.LinkedList;

class SharedQueue {
    private final LinkedList<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            while (queue.size() == CAPACITY) {
                wait(); // Wait if the queue is full
            }

            System.out.println("Produced: " + value);
            queue.add(value++);

            notify(); // Notify the consumer
            Thread.sleep(500);
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true) {
            while (queue.isEmpty()) {
                wait(); // Wait if the queue is empty
            }

            int value = queue.removeFirst();
            System.out.println("Consumed: " + value);

            notify(); // Notify the producer
            Thread.sleep(500);
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();

        Thread producer = new Thread(() -> {
            try {
                sharedQueue.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                sharedQueue.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
```

```
import java.util.LinkedList;

class SharedQueue {
    private final LinkedList<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            while (queue.size() == CAPACITY) {
                wait(); // Wait if the queue is full
            }

            System.out.println("Produced: " + value);
            queue.add(value++);

            notify(); // Notify the consumer
            Thread.sleep(500);
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true) {
            while (queue.isEmpty()) {
                wait(); // Wait if the queue is empty
            }

            int value = queue.removeFirst();
            System.out.println("Consumed: " + value);

            notify(); // Notify the producer
            Thread.sleep(500);
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();

        Thread producer = new Thread(() -> {
            try {
                sharedQueue.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                sharedQueue.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
```

```
makefileCopy codeProduced: 0
Consumed: 0
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
...
```

```
Produced: 0
Consumed: 0
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
...
```

### Summary

```
wait()
```

```
notify()
```

Let me know if you'd like further explanations or additional examples!

### 1. Introduction to Generics

```
javaCopy codeimport java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(10); // No compile-time error

        String str = (String) list.get(0); // Explicit casting required
        System.out.println(str);
    }
}
```

```
import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(10); // No compile-time error

        String str = (String) list.get(0); // Explicit casting required
        System.out.println(str);
    }
}
```

```
javaCopy codeimport java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Type-safe
        list.add("Hello");
        // list.add(10); // Compile-time error

        String str = list.get(0); // No casting needed
        System.out.println(str);
    }
}
```

```
import java.util.ArrayList;

public class WithGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // Type-safe
        list.add("Hello");
        // list.add(10); // Compile-time error

        String str = list.get(0); // No casting needed
        System.out.println(str);
    }
}
```

### 2. Generic Classes

```
javaCopy codeclass ClassName<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
```

```
class ClassName<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
```

```
javaCopy codeclass GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        GenericClass<String> stringObj = new GenericClass<>();
        stringObj.setData("Hello");
        System.out.println("String Data: " + stringObj.getData());

        GenericClass<Integer> intObj = new GenericClass<>();
        intObj.setData(100);
        System.out.println("Integer Data: " + intObj.getData());
    }
}
```

```
class GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        GenericClass<String> stringObj = new GenericClass<>();
        stringObj.setData("Hello");
        System.out.println("String Data: " + stringObj.getData());

        GenericClass<Integer> intObj = new GenericClass<>();
        intObj.setData(100);
        System.out.println("Integer Data: " + intObj.getData());
    }
}
```

```
mathematicaCopy codeString Data: Hello
Integer Data: 100
```

```
String Data: Hello
Integer Data: 100
```

### 3. Generic Methods

```
javaCopy codepublic <T> void methodName(T param) {
    // method body
}
```

```
public <T> void methodName(T param) {
    // method body
}
```

```
javaCopy codepublic class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"A", "B", "C"};

        printArray(intArray);
        printArray(strArray);
    }
}
```

```
public class GenericMethodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"A", "B", "C"};

        printArray(intArray);
        printArray(strArray);
    }
}
```

```
cssCopy code1 2 3 4 
A B C
```

```
1 2 3 4 
A B C
```

### 4. Wildcards in Generics

```
?
```

```
<?>
```

```
<? extends T>
```

```
T
```

```
<? super T>
```

```
T
```

```
javaCopy codeimport java.util.List;
import java.util.ArrayList;

public class UnboundedWildcard {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("A", "B", "C");

        printList(intList);
        printList(strList);
    }
}
```

```
import java.util.List;
import java.util.ArrayList;

public class UnboundedWildcard {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("A", "B", "C");

        printList(intList);
        printList(strList);
    }
}
```

```
javaCopy codeimport java.util.List;

public class UpperBoundedWildcard {
    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        System.out.println("Sum of intList: " + sum(intList));
        System.out.println("Sum of doubleList: " + sum(doubleList));
    }
}
```

```
import java.util.List;

public class UpperBoundedWildcard {
    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        System.out.println("Sum of intList: " + sum(intList));
        System.out.println("Sum of doubleList: " + sum(doubleList));
    }
}
```

```
javaCopy codeimport java.util.List;
import java.util.ArrayList;

public class LowerBoundedWildcard {
    public static void addElements(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        addElements(numList);
        System.out.println(numList);
    }
}
```

```
import java.util.List;
import java.util.ArrayList;

public class LowerBoundedWildcard {
    public static void addElements(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<>();
        addElements(numList);
        System.out.println(numList);
    }
}
```

### 5. Metadata & Reflection

```
java.lang.reflect
```

```
Class
```

```
Method
```

```
Field
```

```
Constructor
```

```
javaCopy codeimport java.lang.reflect.Method;

class MyClass {
    public void sayHello() {
        System.out.println("Hello, Reflection!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = MyClass.class;

        // Instantiate the class
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Get and invoke the method
        Method method = clazz.getMethod("sayHello");
        method.invoke(obj);
    }
}
```

```
import java.lang.reflect.Method;

class MyClass {
    public void sayHello() {
        System.out.println("Hello, Reflection!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = MyClass.class;

        // Instantiate the class
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Get and invoke the method
        Method method = clazz.getMethod("sayHello");
        method.invoke(obj);
    }
}
```

```
Copy codeHello, Reflection!
```

```
Hello, Reflection!
```

```
javaCopy codeimport java.lang.reflect.Field;

class MyClass {
    private String message = "Hello, Reflection!";
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();

        // Get the class
        Class<?> clazz = obj.getClass();

        // Access the private field
        Field field = clazz.getDeclaredField("message");
        field.setAccessible(true); // Bypass private modifier

        // Get and print the field value
        String value = (String) field.get(obj);
        System.out.println("Message: " + value);
    }
}
```

```
import java.lang.reflect.Field;

class MyClass {
    private String message = "Hello, Reflection!";
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();

        // Get the class
        Class<?> clazz = obj.getClass();

        // Access the private field
        Field field = clazz.getDeclaredField("message");
        field.setAccessible(true); // Bypass private modifier

        // Get and print the field value
        String value = (String) field.get(obj);
        System.out.println("Message: " + value);
    }
}
```

```
makefileCopy codeMessage: Hello, Reflection!
```

```
Message: Hello, Reflection!
```

### Summary

```
?
```

```
? extends T
```

```
? super T
```

Let me know if you'd like further examples or additional clarifications!

