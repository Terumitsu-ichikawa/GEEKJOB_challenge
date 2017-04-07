<%-- 
    Document   : challenge1-3
    Created on : 2017/04/07, 15:38:19
    Author     : ichikawaterumitsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int a=2;
        int b=6;
        int c=20;
        int d=33;
        
        out.println(10- ++a);
        out.println(10+ ++b);
        out.println(77-c++);
        out.println(79-d);
        
        %>
    </body>
</html>
