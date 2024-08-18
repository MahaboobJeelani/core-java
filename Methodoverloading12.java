
public class Methodoverloading12 {
	
	public void m1(int a) {
		System.out.println(a);
	}
	public void m1(String string) {
		System.out.println(string);
	}
	public void m1(String string, int a) {
		System.out.println(string + " " + a);
	}
	public static void main(String[] args) {
		Methodoverloading12 M = new Methodoverloading12();
		M.m1(10);
		M.m1("jeelani");
		M.m1("Basha", 454);
	}
}
