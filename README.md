# EmployeeManagement

A simple **CRUD-based web application** built using **Java, JSP, Servlets, JDBC, and Maven**.  
This project allows users to manage employee records with basic operations like add, view, update, and delete employees with MVC architecture.


---

## ✨ Features
- ➕ Add new employees  
- 📋 View all employees  
- ✏️ Edit employee details  
- ❌ Delete employees  

---

## 🛠 Tech Stack
- **Backend:** Java, Servlets, JSP  
- **Frontend:** HTML, CSS  
- **Database:** MySQL  
- **Build Tool:** Maven  
- **Architecture:** MVC (Model-View-Controller)  

---

## 📂 Project Structure
```

EmployeeManagement/
┣ src/main/java/com/emp/controller/   # Servlets (CRUD logic)
┣ src/main/java/com/emp/dao/          # DAO layer
┣ src/main/java/com/emp/dto/          # DTO (Employee object)
┣ src/main/java/com/emp/util/         # Database connection
┣ src/main/webapp/                    # JSP pages, CSS, images
┣ pom.xml                             # Maven dependencies

````

---

## ⚡ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management.git
````

2. Import as a **Maven Project** in Eclipse/IntelliJ.
3. Configure **MySQL database**:

   ```sql
   CREATE DATABASE employee_db;
   USE employee_db;

   CREATE TABLE employee (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100),
       email VARCHAR(100),
       department VARCHAR(50),
       salary DOUBLE
   );
   ```
4. Update DB credentials in `DbConnection.java`.
5. Deploy the project on **Apache Tomcat** server.
6. Access the app at:

   ```
   http://localhost:8080/EmployeeManagement
   ```

---

## 📸 Screenshots
### 🏠 Code Page
![Code Page](https://raw.githubusercontent.com/NITHISH-KUMAR-M-S/EmployeeManagement/main/screenshots/Code.png)

### 🏠 Home Page
![Home Page](https://raw.githubusercontent.com/NITHISH-KUMAR-M-S/EmployeeManagement/main/screenshots/Home.png)

### ➕ Register Employee
![Register Page](https://raw.githubusercontent.com/NITHISH-KUMAR-M-S/EmployeeManagement/main/screenshots/Register.png)

### 📋 Employee List
![Employee List](https://raw.githubusercontent.com/NITHISH-KUMAR-M-S/EmployeeManagement/main/screenshots/EmployeeList.png)

### ✏️ Employee Details By Employee ID Page
![Edit Page](https://raw.githubusercontent.com/NITHISH-KUMAR-M-S/EmployeeManagement/main/screenshots/EmpDetails.png)



---

## 📌 Learning Outcomes

* Implementing **CRUD operations** in a Java web app
* Following **MVC design pattern**
* Using **DAO & DTO** for cleaner code
* Integrating Java with MySQL using JDBC

---

## 🤝 Contributing

Contributions, issues, and suggestions are welcome!

---

## 📜 License

This project is for **educational purposes**. Free to use and modify.

```

---

👉 Once you push this to GitHub, you can paste the **repo link** in your LinkedIn post.  

Do you want me to also give you the **Git commands** step by step to push this Maven project to GitHub from your system?
```

