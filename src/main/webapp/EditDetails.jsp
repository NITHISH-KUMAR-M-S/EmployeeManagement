<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.emp.dao.*, com.emp.dto.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Employee</title>
    <link rel="stylesheet" href="CSS/Styles.css">
</head>
<body>
    <%
        EmployeeDAO dao = new EmployeeDAO();
        String eid = request.getParameter("empid");
        Employee e = dao.getEmployeeById(eid);
    %>

<%@ include file="Header.jsp" %>

    <div class="container">
        <h1 class="title">Edit Employee Details</h1>
        <form action="EditServlet" method="get" class="form-card">
            <label>ID:</label>
            <input type="text" name="eid" value="<%=e.geteId()%>" readonly>

            <label>Name:</label>
            <input type="text" name="ename" value="<%=e.getEname()%>" required>

            <label>Email:</label>
            <input type="email" name="email" value="<%=e.getEmail()%>" required>

            <label>Phone:</label>
            <input type="number" name="phone" value="<%=e.getPhone()%>" required>

            <label>Salary:</label>
            <input type="number" name="salary" value="<%=e.getSalary()%>" required>

            <label>Company:</label>
            <input type="text" name="cname" value="<%=e.getCompany()%>" required>

            <button type="submit">Update</button>
        </form>
    </div>
</body>
</html>
