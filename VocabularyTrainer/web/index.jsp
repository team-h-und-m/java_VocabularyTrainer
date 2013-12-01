<%-- 
    Document   : index
    Created on : Nov 30, 2013, 9:40:03 PM
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
        <h1>Index!</h1>
        <%
        request.getRequestDispatcher("LoginStart").forward(request, response);
        %>
    </body>
</html>
