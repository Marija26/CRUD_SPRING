<%--
  Created by IntelliJ IDEA.
  User: Ar4er
  Date: 11.04.16
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Manager</title>
</head>

<body>
<div>
    <h1>User Manager</h1>
    <c:if test="${!empty user}">
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Admin</th>
                <th>Created Date</th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach items="${user}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td><c:if test="${user.admin==true}">+</c:if></td>
                    <td>${user.createdDate}</td>
                    <td><a href="updateUser/${user.id}">Update</a> </td>
                    <td><a href="deleteUser/${user.id}">Delete</a> </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>
<a href="addUser">Add user</a>
</body>
</html>