 
 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
    <title>List Books</title>
</head>
<body>
    <h2>List of Books</h2>
    <ul>
        <c:forEach var="book" items="${books}">
            <li>${book.id} - ${book.title} by ${book.author}</li>
        </c:forEach>
    </ul>
    <form action="CloneBookServlet" method="post">
        ID to clone: <input type="text" name="id" /><br>
        <input type="submit" value="Clone Book" />
    </form>
</body>
</html>
 