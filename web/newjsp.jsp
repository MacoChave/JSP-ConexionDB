<%-- 
    Document   : newjsp
    Created on : 12-dic-2015, 7:53:41
    Author     : u
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                int i=3;
                for(int j=1;j<10;j++){
                    i=j+i;
                    out.println(i+"<br/>");
                }
            %>
        </h1>
    </body>
</html>
