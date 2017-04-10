<%-- 
    Document   : kiso2-2
    Created on : 2017/04/10, 12:03:22
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
           int x=8;
           int y=8;
           for(int i=0;i<20;i++){
           out.print(x*y*i);
           }
        %>
    </body>
</html>
