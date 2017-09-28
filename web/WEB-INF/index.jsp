<%-- 
    Document   : index
    Created on : Sep 27, 2017, 9:06:49 PM
    Author     : 718205
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Calculator</h1>
        
        <form action="Calculator" method="GET">
            First:<input type="number" name="first" value="${first}"><br/>
            Operation:<select name="operation">
                        <option value="+">+</option>
                        <option value="-">-</option>
                        <option value="*">*</option>
                        <option value="%">%</option>
                      </select><br/>
            Second:<input type="number" name="second" value="${second}"><br/>
            <input type="submit" value="Submit">
        </form>
        ${result}
    </body>
</html>
