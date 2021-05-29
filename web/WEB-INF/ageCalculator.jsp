<%-- 
    Document   : ageCalculator
    Created on : May 27, 2021, 9:00:18 AM
    Author     : 840288
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Form</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
         <form method="post" action="age" >
            <label>Enter your age: </label>
            <input type="text" name="user_age" placeholder="0">
            <br>
            <input type="Submit" value="Age next birthday">
            <p>${message}</p>
            <p>${calculatedAge}</p>
            <a href="arithmetic">Arithmetic Calculator</a>  
        </form>
    </body>
</html>
