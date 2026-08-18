package framework;

import org.testng.annotations.Test;

public class Doc {

	@Test
	public void action() {
		Doc1 obj = new Doc1(5);
		System.out.println(obj.add());
		System.out.println(obj.sub());
		System.out.println(obj.multi());
	}

}
