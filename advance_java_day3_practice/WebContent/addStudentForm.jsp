<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
</head>
<body>

	<form action="student" method="post">
		<table>
			<tr>
				<td>RollNumber:</td>
				<td><input type="text" name="RollNumber" /></td>
			<tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="Name" /></td>
			<tr>
			
			<tr>
				<td>Course:</td>
				<td><input type="text" name="Course" /></td>
			<tr>
			<tr>
				<td>Age:</td>
				<td><input type="text" name="Age" /></td>
			<tr>
			<tr>
				<td>CourseDuration:</td>
				<td><input type="text" name="courseDuration" /></td>
			<tr>
			<tr>
			<td> Gender:</td>
			<td><input type="radio" name="Gender" value="male"> Male</td>
			<td><input type="radio" name="Gender" value="female"> Female</td>
			</tr>
			 <tr>
            <td>Location :</td>
            <td>
                <td>
                <select name="Location" id="Location">
                    <option value="pune">Pune</option>
                    <option value="mumbai">Mumbai</option>
                    <option value="banglore">Banglore</option>
                    <option value="nagpur">Nagpur</option>
                    <option value="chennai">Chennai</option>
                </select>
            </td>
        </tr>
			<tr>
			<td> &nbsp; </td>
			<td> <input type="submit" value="Add Student" /></td>
			</tr>
		</table>
		</form>

</body>
</html>