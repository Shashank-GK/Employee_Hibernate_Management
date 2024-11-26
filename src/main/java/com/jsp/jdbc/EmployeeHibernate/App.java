package com.jsp.jdbc.EmployeeHibernate;

import java.util.Scanner;

public class App 
{
	public static void main( String[] args )
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice for respective operation you want to perform");
		System.out.println("CHOICES:\nInsert: 1.\nFetch By Id: 2.\nUpdate: 3.\nDelete: 4.");
		int choice=sc.nextInt();

		switch(choice) {
		case 1:
			EmployeeDAO.addEmployee(new Employee());
			break;
		case 2:
			EmployeeDAO.fetchDetailsEmployee();
			break;
		case 3:
			EmployeeDAO.updateEmployee();
			break;
		case 4: 
			EmployeeDAO.deletEmployee();
			break;
		default:
			System.out.println("Try again!!");
		}
	}
}
