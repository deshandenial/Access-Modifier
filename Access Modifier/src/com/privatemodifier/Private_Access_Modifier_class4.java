package com.privatemodifier;

public class Private_Access_Modifier_class4 
{
	// private variable should be access the public method and the method also invoked in main method 
	
	private String name = "deshan";
	
	public void method1()
	{
		System.out.println("print the name : " + name);
	}
	
	public static void main(String[] args) 
	{
		Private_Access_Modifier_class4 obj = new Private_Access_Modifier_class4();
		obj.method1();
		
	}

}
