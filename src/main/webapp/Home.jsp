<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management System</title>
    <link rel="stylesheet" href="CSS/Styles.css">
</head>
<body>

<%@ include file="Header.jsp" %>
<!-- <c:import url="Header.jsp" ></c:import>  -->


    <div class="container">
        <h1 class="title">Employee Management System</h1>

        <form action="SearchServlet" method="post" class="form-inline">
            <input type="text" name="eid" placeholder="Enter Employee ID" required>
            <button type="submit">Search Employee</button>
        </form>

        
        <c:if test="${emp != null}"> 
        
        <div class="card">
            <h3>ID: ${emp.eId}</h3>
            <h3>Name:  ${emp.ename}</h3>
            <h3>Email:  ${emp.email}</h3>
            <h3>Phone:  ${emp.phone}</h3>
            <h3>Salary:  ${emp.salary}</h3>
            <h3>Company:  ${emp.company}</h3>
        </div>
        </c:if>

        <c:if test="${error != null}">
        
        <div class="error">${error}</div>

        </c:if>
        
    </div>
</body>
</html>
