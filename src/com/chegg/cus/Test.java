package com.chegg.cus;


class MyClass
{
	public void nonStaticMethod()
	{
		System.out.println("You are calling MyClass non-staticMethod");
	}
}

public class Test
{
	public static void main(String[] args) {
		
		MyClass myClass=new MyClass();
		myClass.nonStaticMethod();
		System.out.println(1000%3);
	}
}