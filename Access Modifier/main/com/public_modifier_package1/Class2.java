package com.public_modifier_package1;
import com.public_modifier_package2.*;


public class Class2
{
	
	
	public int age = 25 ;

	public void method1()
	{
      System.out.println("print age : " + age);	
	}
	
	public static void main(String[] args) {
		
		Class4 cls4 = new Class4();
		cls4.method2();
	}
}
