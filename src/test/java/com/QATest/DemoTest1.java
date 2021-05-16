package com.QATest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	@Test
	public void sum()
	{
		int a=20;
		int b=10;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub()
	{
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	@Test
	public void div()
	{
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	@Test
	public void multiplication()
	{
		int a=10;
		int b=10;
		Assert.assertEquals(100, a*b);
	}
}
