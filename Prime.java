
class Prime {
	void add() {
		System.out.println("Add");
	}
	public static void main(String[] args) {
		multiplication m = new multiplication();
		m.add(); m.mul();
		System.out.println("Hello");
		
	}
}

class multiplication extends Prime {
	void mul() {
		System.out.println("Mul");
	}

	
}
