package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorclass {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("Jeelani");
		al.add(100);
		al.add(200);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
