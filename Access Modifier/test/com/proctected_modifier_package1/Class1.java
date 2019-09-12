package com.proctected_modifier_package1;



// if member variable can be access  - must import packag name and extends the classname

public class Class1 
{
	public String name = "deshan" ;
	protected int age = 25 ;
	
	// protected method 
	protected void method3()
	{
      System.out.println("print name : " + name);	
	}
	
	public static void main(String[] args) {
		
		Class1 cls1 = new Class1();
		cls1.method3();
	}

}
