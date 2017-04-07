<%-- 
    Document   : challenge1-2
    Created on : 2017/04/07, 14:10:17
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
          String name="市川　輝充";
          String sex="男";
          String age="25";
          String from="千葉県";
          String birthday="5月1日";
          
          final String PROFILE="名前:"+name+"　性別:"+sex+"　年齢:"+age+"　出身:"+from+"　誕生日:"+birthday;
          
          out.println("自己紹介"+" "+PROFILE+"　です。よろしくお願い致します。"); 
        
        %>
    </body>
</html>
