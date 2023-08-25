
<%@ page language="java" contentType="text/html; charset=UTF-8"

 pageEncoding="UTF-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Registration form</title>

 </head>
 <body>
    <h1>Select the appropriate option for the required operation</h1>
  
    <form action="operations" method="post">
        <select name="operation" id="op">
        <option value="register">Insert</option>
        <option value="delete">Delete</option>
        <option value="read">Read</option>
        <option value="update">Update</option>
        </select>
        <button name=submit>Submit</button>
    </form>
</body>
</html>

