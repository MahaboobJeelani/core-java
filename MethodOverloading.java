
public class MethodOverloading {
	public void m1(String s) {
		System.out.println("String version");
	}
	public void m1(StringBuffer sb) {
		System.out.println("String Buffer");
	}
	public static void main(String[] args) {
		MethodOverloading Ml = new MethodOverloading();
		Ml.m1("String");            // String Verion
		Ml.m1(new StringBuffer("Durga"));  // String Buffer
		Ml.m1(null);                // Compile timeError
	}
}
