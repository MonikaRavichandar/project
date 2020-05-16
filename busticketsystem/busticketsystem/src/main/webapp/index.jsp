<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><center>WELCOME TO BUS TICKET BOOKING SYSTEM !!!</center></h1><br></br>
<form action="insert">
ENTER THE BUS  ID : <input type="text" name="busId"/><br>
ENTER THE BUS NAME : <input type="text" name="busPName"/><br>
ENTER THE BUS LOCATION : <input type="text" name="busLocation"/><br>
ENTER THE BUS DESTINATION : <input type="text" name="busDestination"/><br>
ENTER THE BUS PRICE : <input type="text" name="busPrice"/><br>
 <input type="submit" value="enter"/>
</form>

<form action="obtain">
ENTER THE BUS DESTINATION : <input type="text" name="bookDestination"/><br>
 <input type="submit" value="get"/>
</form>
</body>
</html>