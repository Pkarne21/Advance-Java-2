<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" import="com.zensar.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<% Student student = (Student)request.getAttribute("student"); %>
<body>
<h2>Update Student Form</h2>
<table>
<tr>
<td>RollNumber:</td>
<td><input type="text" name="RollNumber" value="<%=student.getRollNumber() %>" /></td>
</tr>
<tr>
<td> Name:</td>
<td><input type="text" name="Name" value="<%=student.getName() %>" /></td>
</tr>
<tr>
<td>Course:</td>
<td><input type="text" name="Course" value="<%=student.getCourse() %>" /></td>
</tr>
<tr>
<td>Age:</td>
<td><input type="text" name="Age" value="<%=student.getAge() %>"/></td>
</tr>
<tr>
<td>courseDuration:</td>
<td><input type="text" name="courseDuration" value="<%=student.getcourseDuration() %>" /></td>
</tr>

<tr>
<td>Gender:</td>
<td>Male <input type="radio" name="Gender" value="male" <%if(student.getGender().equalsIgnoreCase("male")){ %>checked<%} %> />
&nbsp;&nbsp; Female<input type="radio" name="Gender" value="female" <%if(student.getGender().equalsIgnoreCase("female")){ %>checked<%} %> />
</td>
</td>


</tr>
<tr>
<td>Location:</td>
<td><input type="text" name="Location" value="<%=student.getLocation() %>"/></td>
</tr>
<tr>
<td>&nbsp;</td>
<td><input type="submit" value="Update Employee" /></td>
</tr>
</table>


</body>
</html>