package com.protected_modifier_package2;


import com.proctected_modifier_package1.*;

public class Class2 extends Class1
{
	
	
	protected void method4()
	{
		System.out.println("print age : " + age);
		System.out.println("print name: " + name);
	}
	
	

	public static void main(String[] args) 
	{
	
		 Class2 cls2 = new Class2();
		 cls2.method3();
		 cls2.method4();

	}

}
