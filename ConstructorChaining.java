
public class ConstructorChaining {
	ConstructorChaining(){
		this("Hello Jeelani");
	}
	ConstructorChaining(String str){
		System.out.println(str);
	}
	public static void main(String[] args) {
		ConstructorChaining c = new ConstructorChaining();
	}
}
