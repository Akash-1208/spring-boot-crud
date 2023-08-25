
<%@ page language="java" contentType="text/html; charset=UTF-8"

 pageEncoding="UTF-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Registration form</title>

 </head>
 <body>
 <h1>Enter the required detailes for adding new student to database</h1>
 <form action="register" method="post">
 <label>ID:</label><br>
 <input type="text" name="id"><br>
 <label>Name:</label><br>
 <input type="text" name="name"><br>
 <label>City:</label><br>
 <input type="text" name="city"><br>
 <label>College:</label><br>
 <input type="text" name="college"><br>
 <button name="submit">Submit</button>

</form>
    
</body>
</html>