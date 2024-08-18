
public class Hirarchicalinheri2 extends Hirarchicalinheri {
	void apply() {
		System.out.println("I am Eating apply");
	}
	public static void main(String[] args) {
		Hirarchicalinheri2 hi = new Hirarchicalinheri2();
		Hirarchicalinheri1 h1 = new Hirarchicalinheri1();
		hi.apply(); hi.mongo();
		h1.mongo(); h1.banaga();
	}
}
