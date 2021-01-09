<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.zensar.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information</title>
</head>
<body>
<h2>List of All Students</h2>
<% List<Student> listOfAllStudents =(List<Student>)request.getAttribute("listOfAllStudents");%> 


<table border="1">
<th> RollNumber </th>
<th> Name </th>
<th> Course </th>
<th> Age </th>
<th> courseDuration </th>
<th> Gender </th>
<th> Location </th>
<% for(Student student:listOfAllStudents){ %>
<tr>

<td> <%=student.getRollNumber() %> </td>
<td> <%=student.getName() %> </td>
<td> <%=student.getCourse() %> </td>
<td> <%=student.getAge() %> </td>
<td> <%=student.getcourseDuration() %> </td>
<td> <%=student.getGender() %> </td>
<td> <%=student.getLocation() %> </td>
<td><a href="deleteStudent?requestAction=delete&RollNumber=<%=student.getRollNumber() %>">Delete</a>
<td> <a href="updateStudentForm?requestAction=openUpdateForm&RollNumber=<%=student.getRollNumber() %>">Update</a> </td>
</tr>
<% } %>
</table>

</body>
</html>