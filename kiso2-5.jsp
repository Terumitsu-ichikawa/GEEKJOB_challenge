<%-- 
    Document   : kiso2-5
    Created on : 2017/04/10, 14:37:24
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
        int x=0;
        for(int i=0;i<100;i++)
        x+=i;
        out.print(x);
        
        %>
    </body>
</html>
