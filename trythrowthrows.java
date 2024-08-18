
public class trythrowthrows {
	public static void main(String[] args) throws InvalidAgeException {
		try {
			vote(15);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void vote(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Not Eligible for voting");
		}
		else {
			System.out.println("Eligible for Voting");
		}
	}
}
