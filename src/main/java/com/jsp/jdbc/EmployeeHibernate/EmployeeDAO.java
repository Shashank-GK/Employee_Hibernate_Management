package com.jsp.jdbc.EmployeeHibernate;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmployeeDAO {

	public static Session getConnection() {
		Configuration cgf=new Configuration();
		cgf.configure();
		cgf.addAnnotatedClass(Employee.class);
		SessionFactory sf=cgf.buildSessionFactory();
		Session session=sf.openSession();
		return session;
	}

	public static void addEmployee(Employee emp){
		Session session=getConnection();
		Transaction trans=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id: ");
		int empId=sc.nextInt();
		sc.nextLine(); 
		emp.setEmpId(empId);
		
		System.out.println("Enter the Employee Name: ");
		String empName=sc.nextLine();
		emp.setEmpName(empName);
		
		System.out.println("Enter the Employee Email ID: ");
		String empEmail=sc.nextLine();
		emp.setEmpEmail(empEmail);
		
		System.out.println("Enter the Employee Designation: ");
		String empDesignation=sc.nextLine();
		emp.setEmpDesignation(empDesignation);
		
		System.out.println("Enter the Employee Salary: ");
		int empSalary=sc.nextInt();
		emp.setEmpSalary(empSalary);
		
		System.out.println("Enter the Employee Age: ");
		int empAge=sc.nextInt();
		emp.setEmpAge(empAge);
		
		session.save(emp);
		trans.commit();
		session.close();
	}
	
	public static void fetchDetailsEmployee() {
		Session session=getConnection();
		Transaction trans=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee Id you want to find: ");
		int empId=sc.nextInt();
		Employee emp=session.get(Employee.class, empId);
		
		System.out.println(emp);
		trans.commit();
		session.close();
	}
	
	public static void updateEmployee() {
		Session session=getConnection();
		Transaction trans=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee Id you want to update details: ");
		int empId=sc.nextInt();
		sc.nextLine();
		Employee emp = session.get(Employee.class, empId);
		
		System.out.println("\nHere you can update the Employee details:");
	
		System.out.println("Enter the Employee Name: ");
		String empName=sc.nextLine();
		emp.setEmpName(empName);
		
		System.out.println("Enter the Employee Email ID: ");
		String empEmail=sc.nextLine();
		emp.setEmpEmail(empEmail);
		
		System.out.println("Enter the Employee Designation: ");
		String empDesignation=sc.nextLine();
		emp.setEmpDesignation(empDesignation);
		
		System.out.println("Enter the Employee Salary: ");
		int empSalary=sc.nextInt();
		emp.setEmpSalary(empSalary);
		
		System.out.println("Enter the Employee Age: ");
		int empAge=sc.nextInt();
		emp.setEmpAge(empAge);
		
		trans.commit();
		session.close();
	}

	
	public static void deletEmployee() {
		Session session=getConnection();
		Transaction trans=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee Id you want to delete: ");
		int empId=sc.nextInt();
		Employee emp=session.get(Employee.class, empId);
		session.delete(emp);
		trans.commit();
		session.close();
	}

}
