package com.greatlearning.gradedassignment.techdepartment;
import com.greatlearning.gradedassignment.superdepartment.SuperDepartment;

//Tech Department inherits Super Department
public class TechDepartment extends SuperDepartment{
	public void departmentName() {
		System.out.println("Welcome to Tech Department");
	}
	public void getTodaysWork() {
		System.out.println("Complete coding of Module 1");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	public void getTechStackInformation() {
		System.out.println("Core Java");
	}
}