

class Method{
	public static void m1() {
		System.out.println("Parent");
	}
}

class MethodHide extends Method{
	public static void m1() {
		System.out.println("Child");
	}
}


public class MethodHiding {
	public static void main(String[] args) {
		Method m = new Method();
		m.m1();                  // Parent
		
		MethodHide mh = new MethodHide();
		mh.m1();                   // Child
		
		Method MH = new MethodHide();
		MH.m1();                  // Parent
	}
}



