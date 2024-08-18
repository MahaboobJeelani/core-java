public class HDFC implements Payment{
	@Override
	public void sendMoney() {
		System.out.println("Money sended from HDFC Bank");
	}
	@Override
	public void receivedMoney() {
		System.out.println("Money Received from HDFC Bank");
	}
	@Override
	public void checkBalance(int balance) {
		System.out.println( balance + "Bank - Balance of HDFC Bank");
	}
}