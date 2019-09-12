package com.privatemodifier;


// how to access the private variable in Access Modifier concept by using setter and getter property.

public class Private_Access_Modifier_class6 
{

	private String name;
	private String address;
	private int age;
	
// name block	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public String getName()
	{
		
		return this.name;
		
	}
	
// address block 
	
	public void setAddress(String addre)
	{
		this.address = addre;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	
	
// 	age block
	
	public void setAge(int age)
	{
	  this.age =	age;
	}
	
	
	public int getAge()
	{
		return this.age;
	}
	
	
	public static void main(String[] args) {
		
		Private_Access_Modifier_class6 obj = new Private_Access_Modifier_class6();
		obj.setName("deshan");
		String value1 = obj.getName();
		System.out.println("print the user name: " + value1);
		
		
		obj.setAddress("no.1 street");
		String value2 = obj.getAddress();
		System.out.println("print the user address : " + value2 );
	
	    
		obj.setAge(25);
		int value3 = obj.getAge();
		System.out.println("print the user age : " + value3);
	}
	
	
}

