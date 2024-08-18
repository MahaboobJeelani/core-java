package collections;

import java.util.Vector;

public class Enumeration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add("jeelani");
		v.add("Basha");
		
		System.out.println(v);
		java.util.Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement() );
		}
	}
}
