import java.util.Scanner;;
interface Client {
	void input();
	void output();
}
class Raju implements Client{
	String name; double salary;
	public void input() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the name");
		name = r.nextLine();
		System.out.println("Enter the Salary");
		salary = r.nextDouble();
	}
	public void output() {
		System.out.println(name);
		System.out.println(salary);
	}
	
}
