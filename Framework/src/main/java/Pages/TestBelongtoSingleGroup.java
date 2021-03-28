package Pages;

import org.testng.annotations.Test;

public class TestBelongtoSingleGroup {

	@Test(groups={"SanityGroup"})
	public void TestOne()
	{
		System.out.println("This is belong to sanity");
	}
	@Test(groups={"SanityGroup","RegressionGroup"})
	public void TestTwo()
	{
		System.out.println("This is belong to sanity and regression hroup");
	}
	@Test(groups={"SanityGroup"})
	public void TestThree()
	{
		System.out.println("This is belong to sanity");
	}
}
