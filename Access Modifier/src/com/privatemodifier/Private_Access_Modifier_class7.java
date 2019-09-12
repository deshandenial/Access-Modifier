package com.privatemodifier;

import java.lang.reflect.Method;

class SampleTest
{
	private String name = "deshan";
	private void GetName()
	{
		System.out.println("print the name : " + name);
	}
}

public class Private_Access_Modifier_class7 
{
	public static void main(String[] args) throws Exception  {
		
		Private_Access_Modifier_class7 obj = new Private_Access_Modifier_class7();
		//obj.GetName();  // Compile time Error display unable to call private method 
		
		// Solution is ?
		
		Class c = Class.forName("SampleTest");
		Object object = c.newInstance();
		Method method = c.getMethod("GetName", null);
		method.setAccessible(true);
		method.invoke(object, null);
		
	}
	

}
