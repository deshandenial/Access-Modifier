package com.public_modifier_package1;



// if member variable can be access  - must import packag name and extends the classname

public class Class3
{
	public String name = "deshan" ;
	public int age = 25 ;
	public void method3()
	{
      System.out.println("print age : " + age);	
	}
	
	public static void main(String[] args) {
		
		Class3 cls3 = new Class3();
		cls3.method3();
	}

}
