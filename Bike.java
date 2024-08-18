import java.lang.reflect.Constructor;

public class Bike {
	String name = "jeelani";
	int id = 123;
//	Bike(String name,int id ){
//		this.name = name;
//		this.id = id;
//	}
//	public void displa() {
//		System.out.println("Name " + name);
//		System.out.println("Id "+id);
//	}
	public static void main(String[] args) {
		Bike b1= new Bike();
		System.out.println("Name:" + b1.name);
		System.out.println("id :"+ b1.id);
	}

}
