package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Try1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Im B4 suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Im B4 Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Im B4 class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Im B4 Method");
	}
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("Im 2nd B4 Method");
	}

	@Test(groups="smoke")
	public void test1() {
		System.out.println("Im 1st test");
	}
	@Test
	public void test2() {
		System.out.println("Im 2nd test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Im after method");
	}

	@AfterClass
	public void afterCLass() {
		System.out.println("Im after class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Im after Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Im after suite");
	}
}
