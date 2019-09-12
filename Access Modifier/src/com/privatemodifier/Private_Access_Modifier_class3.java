package com.privatemodifier;

public class Private_Access_Modifier_class3 
{

	// private variable declared out the class it Should not be access in another class/main method.
	
	

	public static void main(String[] args) 
	{
		Private_Access_Modifier_class3 obj = new Private_Access_Modifier_class3();
	//	obj.name;  // compile time error display
		
	}
	
}

class demo
{
	private String name = "deshan";
}
