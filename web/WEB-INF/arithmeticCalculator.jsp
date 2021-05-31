<%-- 
    Document   : arithmeticCalculator
    Created on : May 27, 2021, 9:01:39 AM
    Author     : 840288
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic"> 
            <label>First: </label>
            <input type="text" name="1stNum" placeholder="0" value="${firstNum}">
            <br>
            <label>Second: </label>
            <input type="text" name="2ndNum" placeholder="0" value="${secNum}">
            <br>
            <input type="submit" name="plus" value= "+" >
            <input type="submit" name="minus" value= "-" >
            <input type="submit" name="mult" value= "x" >
            <input type="submit" name="div" value= "%" > 
            <p>Result: ${ans}</p>
            <p>${message}</p>
            <a href="age">Age calculator</a>
        </form>
    </body>
</html>
