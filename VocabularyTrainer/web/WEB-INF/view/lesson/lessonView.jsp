<%-- 
    Document   : lektion
    Created on : Nov 30, 2013, 11:21:01 PM
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
        <h1>Vocabulary Trainer!</h1>
        <form action="LessonInput" method="post">
        <table>
                    <td>${words[0].english}</td>
                        <input type="hidden" name="index" value="0"/>
                        <input type="hidden" name="lessonNumber" value="${lessonNumber}">
                    <td><input type="text" name="eingabe"/></td>
        </table>
                    <input type="submit" value="Send" name="submit"/>     
        </form>
    </body>
</html>
