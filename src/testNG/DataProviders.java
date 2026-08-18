package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@Test(dataProvider = "setData")
	public void useData(String username, String psswrd) {
		System.out.println(username + " " + psswrd);
	}

	@DataProvider
	public Object[][] setData() {
		Object[][] data = new Object[3][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin1";
		data[1][1] = "admin123";

		data[2][0] = "Admin2";
		data[2][1] = "admin123";

		return data;
	}
}
