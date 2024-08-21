What is SOLID Principle and its implementation:

1. Single Responsibility Principle (SRP)
Definition: A class should have only one reason to change, meaning it should have only one job or responsibility.
Example from the Code:
Employee Class: The Employee class is responsible for holding general information about an employee, like their name, age, salary, and department. It doesn't handle specific employee behaviors that are different for full-time employees, interns, or sub-contracted employees. This allows each employee type (e.g., FullTimeEmployee, ProjectIntern) to manage its own specific behaviors, adhering to SRP.

2. Open-Closed Principle (OCP)
Definition: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
Example from the Code:
Adding New Employee Types: The design allows you to add new types of employees, like ContractEmployee or RemoteIntern, without modifying existing code. You just extend the Employee class and implement the required methods. The existing classes and code remain unchanged.

3. Liskov Substitution Principle (LSP)
Definition: Subclasses should be substitutable for their base classes without affecting the correctness of the program.
Example from the Code:
Employee Subclasses: The FullTimeEmployee, SubContractedEmployee, SummerIntern, and ProjectIntern classes can be used wherever an Employee object is expected. The program doesn't break when these subclasses are used instead of the base Employee class.

4. Interface Segregation Principle (ISP)
Definition: A class should not be forced to implement interfaces it doesn't use. Instead of one large interface, multiple smaller, more specific interfaces are preferred.
Example from the Code:
Intern Interface: The Intern interface ensures that only intern-related methods, like checkTDS(), are included. Full-time employees or subcontracted employees don’t have to implement checkTDS() because they don’t need it.

5. Dependency Inversion Principle (DIP)
Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
Example from the Code:
Employee Management: In this design, the high-level logic (like managing employees in the main method) depends on the Employee abstraction rather than concrete implementations like FullTimeEmployee or SummerIntern. This allows the system to work with any kind of employee, provided they extend the Employee class.
