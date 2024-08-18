
interface PrivateStatic {
	default void call() {
		add(11, 22);
	}
	private void add(int a, int b) {
		System.out.println("Addition :"+(a+b));
	}
}

