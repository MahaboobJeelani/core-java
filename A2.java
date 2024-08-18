//subClass of A1
public class A2 extends A1 {
	void mul() {
		a = 5; b = 5;
		c = a * b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		A2 a = new A2();
		a.add(); a.sub(); a.mul();
	}
}
