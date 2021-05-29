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
        <form>
        <label>First:</label>
        <input type="text" name="firstNum" value="${firstNum}" placeholder="0">
        <br>
         <label>Second:</label>
        <input type="text" name="secondNum" value="${secondNum}" placeholder="0">
        <br>
         <button type="submit" name="calc" value="+">+</button>
         <button type="submit" name="calc" value="-">-</button> 
         <button type="submit" name="calc" value="*">*</button> 
         <button type="button" name="calc" value="%">%</button> 
         <p>Result: ${result}</p>
        <a href="age">Age Calculator</a>  
        </form>
    </body>
</html>
