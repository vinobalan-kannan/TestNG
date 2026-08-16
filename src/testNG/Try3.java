package testNG;

import org.testng.annotations.Test;

public class Try3 {
	@Test(groups="smoke")
	public void test4() {
		System.out.println("Im 4th test");
	}
	@Test
	public void test5() {
		System.out.println("Im 5th test");
	}@Test
	public void test6() {
		System.out.println("Im 6th test");
	}
}
