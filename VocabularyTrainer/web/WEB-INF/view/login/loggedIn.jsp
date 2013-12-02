<%-- 
    Document   : loggedIn
    Created on : Nov 30, 2013, 9:11:31 PM
    Author     : Hamza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LoggedIn!</h1>
        User successfully logged in!<br>
        Session:  <%=session.getId()%>
        
        <h3>Lessons</h3>
        <form action="LessonSelect" method="post">
            <input type="hidden" value="lesson1" name="lesson">
            <input type="submit" value="Lesson 1" name="lesson1submit"/>
        </form>
        
        <form action="LessonSelect" method="post">
            <input type="hidden" value="lesson2" name="lesson">
            <input type="submit" value="Lesson 2" name="lesson2submit"/>
        </form>
    </body>
</html>
