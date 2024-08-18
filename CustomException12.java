public class CustomException12 {
	public static void main(String[] args) {
		try {
			throw new CusException12("Created Custom Exception");
		} catch (Exception e) {
			System.out.println(e); // Created Custom Exception
		}
	}
}

class CusException12 extends RuntimeException {
	public CusException12(String message) {
		super(message);
	}
}
