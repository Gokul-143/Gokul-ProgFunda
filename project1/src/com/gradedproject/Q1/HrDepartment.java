package com.gradedproject.Q1;

public class HrDepartment extends AdminDepartment{
	
	 String departmentName() {
		return"Hr Department";
	}
	
	 String getTodayWork() {
		return"Complete Work Document Submission";
	}
	
	String getWorkDeadline() {
		return"Complete By EOD";
	}
	
	String doActivity() {
		return"Team Lunch";
	}
}
