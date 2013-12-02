<%-- 
    Document   : test
    Created on : Dec 1, 2013, 6:00:01 PM
    Author     : Hamza
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eingegebene Wort!</h1>
    <c:forEach items="${newList}" var="item">
        ${item.english}
        ${item.deutsch}
        ${item.eingabe}
    </c:forEach>
    </body>
</html>
