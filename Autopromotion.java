
public class Autopromotion {
	public void m1(int a) {
		System.out.println("Automatic promotion");
	}
	public void m1(float a) {
		System.out.println("Float Version");
	}
	public static void main(String[] args) {
		Autopromotion Ap = new Autopromotion();
		Ap.m1('a');
	}

}
