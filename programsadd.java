
class programsadd {
	void add1() {
		int a = 10, b = 30;
		System.out.println("Addition : " + (a + b));
	}
	void add1(int a, int b) {
		System.out.println("Subtraction : "+(a-b));
	}
	void add1(int a, double b) {
		System.out.println("Subtraction : "+(a-b));
	}
	public static void main(String[] args) {
		programsadd pa = new programsadd();
		pa.add1(); pa.add1(10, 40); pa.add1(30, 30.65);
	}
}
