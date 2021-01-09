package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.zensar.bean.Student;



public class StudentRepository {
	public void addStudent(Student student) {
		Connection con = DBUtility.getMySqlDbConnection();
		String sql = "insert into student values (?,?,?,?,?,?,?)";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, student.getRollNumber());	
		pst.setString(2, student.getName());
		pst.setString(3, student.getCourse());
		pst.setInt(4, student.getAge());
		pst.setInt(5, student.getcourseDuration());
		pst.setString(6, student.getGender());
		pst.setString(7, student.getLocation());
		int result = pst.executeUpdate();
		if(result==0) {
		System.out.println("Database Operation Failed");
		}else {
		System.out.println("Database Operation Successful");
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
}
}
 public List<Student> getAllStudent()
 {
	 List<Student> listOfAllStudents=new ArrayList<Student>();
	// jdbc code to fetch all employees from db and add them to this list
	 Connection con = DBUtility.getMySqlDbConnection();
	 String sql = "select * from student";
	 try {
	 PreparedStatement pst = con.prepareStatement(sql);
	 ResultSet rs = pst.executeQuery();
	 while(rs.next()) {
	int RollNumber = rs.getInt("RollNumber");
	 String Name = rs.getString("Name");
	 String Course = rs.getString("Course");
	 int Age = rs.getInt("Age");
	 int courseDuration = rs.getInt("courseDuration");
	 String Gender = rs.getString("Gender");
	 String Location = rs.getString("Location");
	 Student student = new Student(RollNumber, Name,Course, Age,courseDuration, Gender,Location);
	 listOfAllStudents.add(student);
	 }
	 }catch(Exception e) {
	 System.out.println("Exception Occured:"+e);
	 }
	 
	return listOfAllStudents;
	 
 }
 public void deleteStudent(int RollNumber) {
		// TODO Auto-generated method stub
		Connection con = DBUtility.getMySqlDbConnection();
		 String sql = "delete from student where RollNumber=?";
		 try {
		 PreparedStatement pst = con.prepareStatement(sql);
		 pst.setInt(1, RollNumber);
		 int result = pst.executeUpdate();
		 if(result==0) {
		 System.out.println("Deletion Failed");
		 }else {
		 System.out.println("Deletion Successful");
		 }
		 }catch(Exception e) {
		 System.out.println("Exception Occured:"+e);
		 }
		 }
 public Student getStudent(int RollNumber)
 {
	 Student student =null;
	 Connection con=DBUtility.getMySqlDbConnection();
	 String sql="select * from student where RollNumber=?";
	 try {
		 PreparedStatement pst = con.prepareStatement(sql);
		 pst.setInt(1, RollNumber);
		 ResultSet rs = pst.executeQuery();
		 while(rs.next()) {
		 String Name = rs.getString("Name");
		 String Course = rs.getString("Course");
		 int Age = rs.getInt("Age");
		 int courseDuration= rs.getInt("courseDuration");
		 String Gender = rs.getString("Gender");
		 String Location = rs.getString("Location");
		  student =new Student(RollNumber,Name,Course,Age,courseDuration,Gender,Location);
		 
		 }
		 }catch(Exception e) {
		 System.out.println("Exception Occured:"+e);
		 }
	 return student;
 }


}
