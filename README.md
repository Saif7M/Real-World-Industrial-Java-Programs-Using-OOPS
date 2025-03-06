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


1️⃣ Encapsulation – Banking System
Encapsulation ensures data security by restricting direct access to class fields.

📌 Use Case: Secure Bank Account Management
A user can only deposit or withdraw money using defined methods.
Direct modification of balance is not allowed.

✅ Why Encapsulation?

Prevents direct balance manipulation (acc.balance = 0; is not allowed).
Provides controlled read/write access through methods.


