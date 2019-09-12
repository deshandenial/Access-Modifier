package com.public_modifier_package2;

import com.public_modifier_package1.*;

public class Class4
{
	
	public String name  = "deshan";
	public void method2()
	{
		System.out.println("print name : " + name);
	}
	
	

	public static void main(String[] args) 
	{
	
		 Class2 cls2 = new Class2();
		 cls2.method1();
		

	}
}