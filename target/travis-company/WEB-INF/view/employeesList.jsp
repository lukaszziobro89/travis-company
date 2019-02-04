<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="UTF-8">

    <title>Employees list</title>

</head>
<body>

    <h2>Employees list</h2>

    <table id="results" border="1" cellpadding="5" cellspacing="1" >
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Job</th>
        </tr>
        <c:forEach var="tempEmployee" items="${employee}" >

            <tr>
                <td>${tempEmployee.id}</td>
                <td>${tempEmployee.name}</td>
                <td>${tempEmployee.surname}</td>
                <td>${tempEmployee.job}</td>
            </tr>
        </c:forEach>
    </table>

<br><br>
    <form class="left_align" action="<%=request.getContextPath() %>/">
        <input type="submit" class="btn success" value="Home page"/>
    </form>

</body>
</html>
