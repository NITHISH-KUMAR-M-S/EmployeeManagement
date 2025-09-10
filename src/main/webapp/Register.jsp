<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register Employee</title>
    <link rel="stylesheet" href="CSS/Styles.css">
</head>
<body>
<%@ include file="Header.jsp" %>

    <div class="container">
        <h1 class="title">Register Employee</h1>
        <form action="RegisterServlet" method="post" class="form-card">
            <label>ID:</label>
            <input type="text" name="eid" required>

            <label>Name:</label>
            <input type="text" name="ename" required>

            <label>Email:</label>
            <input type="email" name="email" required>

            <label>Phone:</label>
            <input type="number" name="phone" required>

            <label>Salary:</label>
            <input type="number" name="salary" required>

            <label>Company:</label>
            <input type="text" name="cname" required>

            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>
