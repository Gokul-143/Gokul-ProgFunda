package com.gradedproject.Q1;

public class Mainproj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome To " +admin.departmentName());
		System.out.println(admin.getTodayWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayHoliday());
		System.out.println();
	
		
		
		//Hr Department
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to" + hr.departmentName());
		System.out.println(hr.getTodayWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayHoliday());
		System.out.println();
		
		
		//tech Department
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome To" +tech.departmentName());
		System.out.println(tech.getTodayWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayHoliday());

	}
		
	
		
	}


