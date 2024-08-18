
public class ToString {
	String name; int id;
	@Override
	public String toString() {
		return this.name + " "+this.id;
	}
	public static void main(String[] args) {
		ToString n = new ToString();
		n.name = "Jeelani"; n.id = 20;
		System.out.println(n);
	}
}
