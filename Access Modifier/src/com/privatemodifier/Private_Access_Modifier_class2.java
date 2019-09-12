package com.privatemodifier;

public class Private_Access_Modifier_class2 
{
	// private variable should not be access out classes, methods
	
	private String name  = "deshan";
	
	public static void main(String[] args) {
		
	}
	

}

class Democlass
{
	public void method()
	{
	  //	System.out.println("print the name : " + name); // compile time error display(name cannot be resolved to a variable)
	}
}
