package com.javapractice;
import java.io.*; 

class Demo1 implements java.io.Serializable 
{ 
	public int a; 
	public String b; 
	public int c;
	public transient int x;
	public transient String y;
	public Demo1(int a, String b,int c,int x,String y) 
	{ 
		this.a = a; 
		this.b = b; 
		this.c = c;
		this.x = x;
		this.y = y;
	} 
} 

class java3 
{ 
	public static void display(Demo1 obj)
	{
		System.out.println("a = " + obj.a); 
		System.out.println("b = " + obj.b); 
		System.out.println("c = " + obj.c); 
		System.out.println("x = " + obj.x);
		System.out.println("y = " + obj.y); 
	}
	public static void main(String[] args) 
	{ 
		Demo1 object = new Demo1(1, "hello",2,3,"world"); 
		String filename = "file.s,er"; 
		try
		{ 
			FileOutputStream file = new FileOutputStream(filename); 
			ObjectOutputStream out = new ObjectOutputStream(file); 
			out.writeObject(object); 
			out.close(); 
			file.close();  
			display(object);
			System.out.println("Object has been serialized");
		}		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		}
		Demo1 object1 = null; 
		try
		{ 
			FileInputStream file = new FileInputStream(filename); 
			ObjectInputStream in = new ObjectInputStream(file); 
			object1 = (Demo1)in.readObject(); 
			in.close(); 
			file.close(); 
			display(object1);
			System.out.println("Object has been deserialized "); 
		} 
		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 
		
		catch(ClassNotFoundException ex) 
		{ 
			System.out.println("ClassNotFoundException is caught"); 
		} 

	} 
} 
