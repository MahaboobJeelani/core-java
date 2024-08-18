
public class CustomException extends RuntimeException{
	CustomException(String msg) {
		super(msg);
	}
	CustomException() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		CustomException c1 = new CustomException("This is a Custom Exception");
		throw c1;
		
	}
	
}
