package com.greatlearning.gradedassignment.hrdepartment;
import com.greatlearning.gradedassignment.superdepartment.SuperDepartment;

//HR Department inherits Super Department
public class HRDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("Welcome to HR Department");
	}
	public void getTodaysWork() {
		System.out.println("Fill today's timesheet and mark your attendance");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	public void doActivity() {
		System.out.println("team Lunch");
	}
}