package com.privatemodifier;

import java.lang.reflect.Field;


public class Private_Access_Modifier_class8 
{
public static void main(String[] args) throws Exception  {
		
		
		
		Field f = SampleTest1.class.getDeclaredField("name");
		f.setAccessible(true);
		f.get(new SampleTest1());
		
	}

}


class SampleTest1
{
	private String name = "deshan";
	
	public void SampleMethod()
	{
		System.out.println("print the value: " + name);
	}
	
}