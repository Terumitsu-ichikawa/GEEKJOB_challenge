<%-- 
    Document   : kiso2-6
    Created on : 2017/04/10, 15:15:50
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
        int i=1000;
        while(i>100){
        i=i/2;
        out.print(i);
        
        
        }
        %>
    </body>
</html>
