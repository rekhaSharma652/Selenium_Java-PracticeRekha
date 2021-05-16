package com.QATest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void sum()
	{
		System.out.println("sum");
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub()
	{
		System.out.println("sub");

		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	@Test
	public void div()
	{
		System.out.println("div");

		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	@Test
	public void multiplication()
	{
		System.out.println("multi");

		int a=10;
		int b=10;
		Assert.assertEquals(100, a*b);
	}
}
