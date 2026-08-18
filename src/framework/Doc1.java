package framework;

public class Doc1 extends Doc2{

	int a;

	public Doc1(int a) {
		super(a);
		this.a = a;
	}

	public int add() {
		a = a + 1;
		return a;
	}

	public int sub() {
		a = a - 1;
		return a;
	}
}
