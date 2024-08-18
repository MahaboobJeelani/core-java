
public class VarArgumentsover {
	public void m1(int n) {
		System.out.println("General Methods");
	}
	public void m1(int... a) {
		System.out.println("VarArguments");
	}
	public static void main(String[] args) {
		VarArgumentsover v = new VarArgumentsover();
		v.m1();
		v.m1(10);
		v.m1(10, 10, 10);
	}
}
