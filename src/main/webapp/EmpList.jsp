<%@page import="java.util.ArrayList, com.emp.dto.Employee, java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <link rel="stylesheet" href="CSS/Styles.css">
</head>
<body>
<%@ include file="Header.jsp" %>

    <div class="container">
        <h1 class="title">All Employees</h1>
        <table class="styled-table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Salary</th>
                    <th>Company</th>
                    <th colspan="2">Action</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Employee> list = (List<Employee>) request.getAttribute("allEmp");
                    if (list != null) {
                        for (Employee e : list) {
                %>
                <tr>
                    <td><%= e.geteId() %></td>
                    <td><%= e.getEname() %></td>
                    <td><%= e.getEmail() %></td>
                    <td><%= e.getPhone() %></td>
                    <td><%= e.getSalary() %></td>
                    <td><%= e.getCompany() %></td>
                    <td><a class="edit-btn" href="EditDetails.jsp?empid=<%= e.geteId() %>">Edit</a></td>
                    <td><a class="delete-btn" href="DeleteServlet?empid=<%= e.geteId() %>">Delete</a></td>
                </tr>
                <% } } %>
            </tbody>
        </table>
    </div>
</body>
</html>
