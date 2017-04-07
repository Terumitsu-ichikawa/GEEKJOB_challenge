<%-- 
    Document   : challenge1-4
    Created on : 2017/04/07, 15:53:42
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
        int a=5;
        
        if(a==1){
        out.println("1です");
        }
        if(a<2){
        out.println("プログラミングキャンプ！");
       }
        else{
        out.println("その他です！");
        
        }
        
        %>
    </body>
</html>
