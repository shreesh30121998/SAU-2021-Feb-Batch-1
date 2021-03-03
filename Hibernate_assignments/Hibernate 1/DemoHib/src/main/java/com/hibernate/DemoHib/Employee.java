package com.hibernate.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	private int id;
	private EmpName ename;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public EmpName getEname() {
		return ename;
	}
	public void setEname(EmpName ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Employee [id:"+id+" ename:"+ename+" age:"+"+age]";
	}

}
