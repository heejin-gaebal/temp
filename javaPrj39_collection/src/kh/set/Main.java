package kh.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== SET =====");
		
		Set x = new HashSet();
		
		x.add(100);
		x.add("hello");
		x.add("world");
		x.add("hello");
		
		System.out.println(x);
		
		System.out.println(x.contains("hello"));
		//contains boolean 타입 T/F
	}

}
