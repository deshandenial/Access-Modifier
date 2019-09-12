package com.public_modifier_package2;


import com.public_modifier_package1.Class3;


public class Class5 extends Class3
{
	
	public void method4()
	{
		System.out.println("print name : " + name);
	}
	
	

	public static void main(String[] args) 
	{
	
		 Class5 cls5 = new Class5();
		 cls5.method4();
		

	}

}
