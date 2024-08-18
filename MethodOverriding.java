class Overriding{
	public void Property() {
		System.out.println("Parent Method : Gole, Land, Car");
	}
	public void marry() {
		System.out.println("Pallavi");
	}
}

class C extends Overriding {
	public void marry() {
		System.out.println("Child Method : Katrina");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		Overriding o = new Overriding();
		o.Property();               //  Parent Method : Gole, Land, Car
		
		C MR = new C(); 
		MR.marry();                // Child Method : Katrina
		
		Overriding or = new C();
		or.marry();              // Child Method : Katrina
	}
}
