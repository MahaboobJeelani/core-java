
public interface Payment {
	abstract void sendMoney();
	abstract void receivedMoney();
	abstract void checkBalance(int balance);
}
