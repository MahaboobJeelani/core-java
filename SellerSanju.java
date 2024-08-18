
public class SellerSanju implements CustomerRaj {
	@Override
	public void Purchase() {
		
		System.out.println("Amt"+ amt);
	}
	public static void main(String[] args) {
		CustomerRaj r = new SellerSanju();
		r.Purchase();
		int r1 = CustomerRaj.amt;
		System.out.println(r1);
	}
}
