class typecasting {
	public static void m1() {
		System.out.println("Parent");
	}
}

class typecast extends typecasting {
	public static void m1() {
		System.out.println("Child");
	}
}
public class TypeCa {
	public static void main(String[] args) {
		typecasting t = new typecast();
		t.m1();
		((typecast)t).m1();
	}
}
