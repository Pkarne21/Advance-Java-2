package com.zensar.bean;

public class Student {
	private int RollNumber;
	private String Name;
	private String Course;
	private int Age;
	private int courseDuration;
	private String Gender;
	private String Location;
	
	public Student(int rollNumber, String name, String course, int age, int courseDuration, String gender,String location) {
		super();
		RollNumber = rollNumber;
		Name = name;
		Course = course;
		Age = age;
		this.courseDuration = courseDuration;
		Gender = gender;
		Location =location;
	}
	
	
	public int getRollNumber() {
		return RollNumber;
	}


	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getCourse() {
		return Course;
	}


	public void setCourse(String course) {
		Course = course;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public int getcourseDuration() {
		return courseDuration;
	}


	public void setcourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}
	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		this.Location = Location;
	}


	@Override
	public String toString() {
		return "Student [RollNumber=" + RollNumber + ", Name=" + Name + ", Course=" + Course + ", Age=" + Age
				+ ", courseDuration=" + courseDuration + ", Gender=" + Gender + ", Location=" + Location + "]";
	}


	
	
	
	
	
	
}
