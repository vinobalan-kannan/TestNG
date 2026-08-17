package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Try2 {
	@Test(groups = "smoke")
	public void test3() {
		System.out.println("Im 3rd test");
	}

	@Test(enabled = true)
	public void test8() {
		System.out.println("Im 8th test");
	}

	@Test(dependsOnMethods = "test8")
	public void dataProviders() {
		System.out.println("checking Depends on helper method");
	}

	@Parameters({ "URL" })
	@Test
	public void checkingParameters(String link) {
		System.out.println(link);

	}
}
