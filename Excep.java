
public class Excep {
	public static void main(String[] args) {
		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
			try { 
				int v[] = {};
				System.out.println(v[1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("hjhv");

	}
}
