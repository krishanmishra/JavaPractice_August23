package stringproblems;

abstract interface A1 {
	public void method1();
}

public class Abstraction implements A1 {

	@Override
	public void method1() {
		System.out.print("Abcd");

	}
	
	public static void main(String[] args) {
		A1 tt=new Abstraction();
		tt.method1();
	}
}
