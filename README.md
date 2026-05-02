# 📦 Inventory & Stock Management System

## 📌 Project Overview
The Inventory & Stock Management System is a web-based application developed as a group project using Java Servlets, JSP, and MySQL.

The system is designed to manage inventory operations such as suppliers, products, and stock efficiently. It helps reduce manual work, improve data accuracy, and provide a simple interface for managing business operations.

---

## 📁 Project Modules

👤 **User Management**
- User login system
- Basic authentication

📦 **Product Management**
- Add, update, delete products
- View product details

📊 **Stock Management**
- Track stock levels
- Manage inventory updates

🚚 **Supplier Management**
- Add new suppliers
- View supplier list
- Delete suppliers
- Store supplier details in database

📈 **Dashboard**
- Basic system overview

---

## 📂 Project Structure
Inventory-Stock-Management-System/
│
├── pom.xml
├── README.md
├── .gitignore
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/inventory/
│       │       │
│       │       ├── controller/
│       │       │   └── SupplierServlet.java
│       │       │
│       │       ├── DAO/
│       │       │   └── SupplierDAO.java
│       │       │
│       │       ├── model/
│       │       │   └── Supplier.java
│       │       │
│       │       └── util/
│       │           └── DBConnection.java
│       │
│       └── webapp/
│           │
│           ├── index.jsp
│           ├── dashboard.jsp
│           ├── supplier.jsp
│           │
│           ├── css/
│           │   └── style.css
│           │
│           ├── js/
│           │   └── script.js
│           │
│           └── WEB-INF/
│               └── web.xml
│
└── target/


---

## 👨‍👩‍👧‍👦 Team Members & Responsibilities

| 👤 Member | 🧩 Responsibility | ⚙️ Module Details |
|----------|-----------------|-----------------|
| Tharushi Dilshara | 🚚 Supplier Management | Developed supplier add, list, delete features and database integration |
| Member 2 | 📦 Product Management | Handles product CRUD operations |
| Member 3 | 📊 Stock Management | Manages stock updates and tracking |
| Member 4 | 👤 User Management | Handles login and authentication |
| Member 5 | 📈 Dashboard | Developed UI and system overview |
| Member 6 | 🔧 Integration & Testing | System integration and debugging |

---

## 🛠️ Tech Stack

- Java (Servlets & JSP)
- MySQL
- Apache Tomcat
- HTML, CSS, Bootstrap
- Maven
- Git & GitHub

---

## 🚀 Features

✔ Supplier management (Add, View, Delete)  
✔ Product management (CRUD)  
✔ Stock tracking system  
✔ Basic authentication system  
✔ Bootstrap responsive UI  
✔ MySQL database integration

---

## 📌 System Design

This project follows the **MVC architecture**:

- **Model** → Java classes (Supplier)
- **View** → JSP pages
- **Controller** → Servlets

Data is handled using DAO pattern and stored in MySQL database.

---

## 🚀 Status

- Core modules implemented ✔
- Supplier module completed ✔
- Database integration ✔
- UI improvements ongoing 🔄

---

## 📜 License

This project is developed for educational purposes only.