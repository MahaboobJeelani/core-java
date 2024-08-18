
public class trythrows {
	public static void Countwait() throws InterruptedException{
		int n= 10;
		for(int i =1; i<=n; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Countwait();
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println("Eroor");
		}
	}
}
