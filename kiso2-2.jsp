<%-- 
    Document   : kiso2-2
    Created on : 2017/04/10, 10:48:00
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
        char word='A';
        String message="";
        switch(word)
        {
            case 'A':
                message="英語";
            break;
            case 'あ':
                message="日本語";
            break;
            
        }
        
        out.println(message);

        %> 
    </body>
</html>
