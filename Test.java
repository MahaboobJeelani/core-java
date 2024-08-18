class E {
	public static void m1() {
		System.out.println("Parent");
	}
}

class B extends E {
	public static void m1() {
		System.out.println("Child");
	}
}

class D extends B {
	public  static void m1() {
		System.out.println("Grand Child");
	}
}

public class Test {
	public static void main(String[] args) {
		D d = new D();
		d.m1();
		((B)d).m1();
	}
}
