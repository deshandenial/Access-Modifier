package com.public_modifier_package1;



// with in the main class : how to accessing the one class to outside class property by using extends
public class Class1 extends Democlass3
{
	
	public static void main(String[] args) 
	{
	
		Class1 cls = new Class1();
		cls.oneMethod1();
		cls.oneMethod3();
		cls.oneMethod2();
		
	}
		
}

class Democlass1 
{
	public String name1 = "deshan";
	private String name2 = "desone";
	public String street = "nehru street";
	protected int age = 25;
	public void oneMethod1()
	{
		
		System.out.println("print name : " + name1);
		System.out.println("print name : " + name2);
	}
}

class Democlass2 extends Democlass1
{
	public void oneMethod2()
	{
		System.out.println("print street : " + street);
	//	System.out.println("print name : " + name2); // compile error display
		// ERROR : name2 is not visible because of name2 is private variable outside the class declaration
	}
}

class Democlass3 extends Democlass2
{
	public void oneMethod3()
	{
		System.out.println("print age : " +age);
		
	}
}