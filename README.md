📌 Real-World Industrial Java Programs Using OOP
We'll cover OOP concepts in a structured enterprise-style project with real-world scenarios, such as:

Encapsulation - Banking System
Inheritance - Employee Management
Polymorphism - Payment Processing
Abstraction - Car Rental System
Interfaces - Notification Service

Project Structure:
enterprise-java/
│── src/
│   ├── banking/
│   │   ├── Account.java
│   │   ├── Bank.java
│   ├── employee/
│   │   ├── Employee.java
│   │   ├── Manager.java
│   ├── payment/
│   │   ├── Payment.java
│   │   ├── CreditCardPayment.java
│   │   ├── UpiPayment.java
│   ├── rental/
│   │   ├── Vehicle.java
│   │   ├── Car.java
│   ├── notification/
│   │   ├── Notification.java
│   │   ├── EmailNotification.java
│   │   ├── SmsNotification.java
│── README.md
│── .gitignore
==============================================================

1️⃣ Encapsulation – Banking System
Encapsulation ensures data security by restricting direct access to class fields.

📌 Use Case: Secure Bank Account Management
A user can only deposit or withdraw money using defined methods.
Direct modification of balance is not allowed.

✅ Why Encapsulation?

Prevents direct balance manipulation (acc.balance = 0; is not allowed).
Provides controlled read/write access through methods.
==============================================================

2️⃣ Inheritance – Employee Management
Inheritance allows reusing and extending functionality.

📌 Use Case: Employee & Manager Hierarchy
Base class: Employee
Derived class: Manager (inherits Employee but has additional features)

✅ Why Inheritance?

Reduces code duplication (common properties in Employee).
Manager extends Employee without redefining the properties.
===============================================================


3️⃣ Polymorphism – Payment Processing
Polymorphism allows flexibility in method behavior.

📌 Use Case: Multiple Payment Methods
Payment (base class)
CreditCardPayment & UpiPayment (overrides behavior)

✅ Why Polymorphism?

One method (processPayment()) behaves differently based on the object type.
Makes the system extendable (e.g., adding CryptoPayment in the future).
===================================================================

4️⃣ Abstraction – Car Rental System
Abstraction hides complex logic and exposes only essential details.

📌 Use Case: Vehicles in a Rental System
Abstract class Vehicle
Concrete class Car implements start()

✅ Why Abstraction?

Prevents direct instantiation of Vehicle (only meaningful implementations allowed).
Helps in scalability (e.g., Bike, Truck can extend Vehicle).

=================================================================

5️⃣ Interfaces – Notification Service
Interfaces help define common behavior across unrelated classes.

📌 Use Case: Sending Notifications
Interface Notification
EmailNotification & SmsNotification implement it.

✅ Why Interfaces?

Enables multiple implementations (email, SMS, WhatsApp).
Encourages loose coupling in the system.
=================================================================
