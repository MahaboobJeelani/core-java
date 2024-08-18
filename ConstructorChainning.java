//
//public class ConstructorChainning {
//	ConstructorChainning(){
//		this("jeelani");
//	}
//	ConstructorChainning(String name){
//		System.out.println("Name : "+name);
//	}
//	public static void main(String[] args) {
//		ConstructorChainning cc = new ConstructorChainning();
//	}
//}

class hyrerchical {
	public void add() {
		System.out.println("Addition");
	}
}

class hyrerchical1 extends hyrerchical {
	public void substraction() {
		System.out.println("Sub");
	}
}

class hyrerchical2 extends hyrerchical {
	public void multiplication() {
		System.out.println("Multiplication");
	}
}

public class ConstructorChainning {
	public static void main(String[] args) {
		hyrerchical1 h1 = new hyrerchical1();
		hyrerchical2 h2 = new hyrerchical2();
		
		h1.add(); h1.substraction(); h2.multiplication(); 
	}
}