package com.zensar;

import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.zensar.bean.Student;

public class StudentController extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");
		if(requestAction.equalsIgnoreCase("viewAll")) {
		System.out.println("I am inside doGet() method now...");
		StudentRepository studentRepository = new StudentRepository();
		List<Student> listOfAllStudents = studentRepository.getAllStudent();
		System.out.println("listOfAllStudents:"+listOfAllStudents);
		RequestDispatcher rd = request.getRequestDispatcher("viewAllStudents.jsp");
	//forrwarording to viewall
		request.setAttribute("listOfAllStudents", listOfAllStudents);
		try {
		rd.forward(request, response);
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
		}
	
		else if(requestAction.equalsIgnoreCase("delete")) {
			// code for student deletion
			System.out.println("We are going to delete an student");
			StudentRepository studentRepository = new StudentRepository();
			int RollNumber= Integer.parseInt(request.getParameter("RollNumber"));
			studentRepository.deleteStudent(RollNumber);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			try {
			rd.forward(request, response);
				//response.sendRedirect("index.jsp");
			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
			
		}
		else if(requestAction.equalsIgnoreCase("openUpdateForm")) {
			int RollNumber = Integer.parseInt(request.getParameter("RollNumber"));
			// connect to db using Repository and fetch the details of this employee
			
			// connect to db using Repository and fetch the details of this employee
			StudentRepository studentRepository = new StudentRepository();
			Student student = studentRepository.getStudent(RollNumber);
			RequestDispatcher rd = request.getRequestDispatcher("updateStudentForm.jsp");
			request.setAttribute("student", student);
			try {
			rd.forward(request, response);
			} catch (Exception e) {
			System.out.println("Exception Occured:" + e);
			}
			}
		
		}
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		int RollNumber = Integer.parseInt(request.getParameter("RollNumber"));
		String Name = request.getParameter("Name");
		String Course = request.getParameter("Course");
		int Age= Integer.parseInt(request.getParameter("Age"));
		int courseDuration= Integer.parseInt(request.getParameter("courseDuration"));
		String Gender=request.getParameter("Gender");
		String Location=request.getParameter("Location");
		System.out.println("RollNumber:"+RollNumber);
		System.out.println("Name:"+Name);
		System.out.println("Course:"+Course);
		System.out.println("Age:"+Age);
		System.out.println("courseDuration:"+courseDuration);
		System.out.println("Gender:"+Gender);
		System.out.println("Location:"+Location);
		StudentRepository studentRepository = new 	StudentRepository();
		//employeeRepository.addEmployee(employeeId, employeeName, designation, salary,gender);
		Student student = new Student(RollNumber, Name,Course, Age,courseDuration, Gender,Location);
		studentRepository.addStudent(student);
         
		RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
		try{
			rd.forward(request, response);
					
		}catch(Exception e)
		{
			System.out.println("Exception Occured" +e);
		}
 }
	
	

}
