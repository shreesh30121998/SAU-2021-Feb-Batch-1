package com.hibernate.DemoHib;

import java.util.Scanner;

public class Menu {
	Scanner sch = new Scanner(System.in);
	public void printList() {
		System.out.println("Enter Choices:\n1- Add Employee\n2- Update Employee\n3- Delete Employee\n4- Get All Employee\n5- Get Employee by ID\n6- Exit ");
	}
	public void printChoice(){
		
		System.out.println("Enter Attribute to update:\n1-First Name\n2- Last Name\n3- Age");
	}
	public Employee entChoice() 
	{
		Employee e=new Employee();
		EmpName name = new EmpName();
		try 
		{
			System.out.println("Give Details of New Employee: ");
			
			System.out.println("Enter First Name");
			name.setFname(sch.nextLine());
			
			System.out.println("Enter Last Name");
			name.setLname(sch.nextLine());
			
			e.setEname(name);
			
			System.out.println("Enter ID");
			e.setId(sch.nextInt());
			
			System.out.println("Enter Age");
			int num=sch.nextInt();
			sch.nextLine();
			int temp=num;
			
			if (num>99) {
				throw new ArithmeticException("Age Limit Exceeded");
			}
			else
			{
				e.setAge(temp);
			}
		}
		catch (Exception e1) {
			System.out.println("Entered age is greater than 99");
		}
			return e;
	}

}