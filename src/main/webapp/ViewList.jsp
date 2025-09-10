<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
            
            <c:forEach var="emp" items="${allEmp}" >
            
            <tbody>
                <tr>
                    <td>${ emp.eId }</td>
                    <td>${ emp.ename }</td>
                    <td>${ emp.email }</td>
                    <td>${ emp.phone }</td>
                    <td>${ emp.salary }</td>
                    <td>${ emp.company }</td>
                    <td><a class="edit-btn" href="EditDetails.jsp?empid=${emp.eId }">Edit</a></td>
                    <td><a class="delete-btn" href="DeleteServlet?empid=${emp.eId }">Delete</a></td>
                </tr>
             
            </tbody>
            </c:forEach>
        </table>
    </div>
</body>
</html>