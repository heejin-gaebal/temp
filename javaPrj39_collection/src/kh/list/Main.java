package kh.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====== List ======");
		
		List x = new ArrayList();
		
		x.add(100);
		x.add("zzz");
		x.add(true);
		x.add(3.14);
		//어떤 타입도 바로 쓸수 있음
		
		System.out.println(x.toString());
		
		x.remove(3);
		System.out.println(x);
		
		x.add(3, 2); //(몇번째에, 무엇)을 넣겠다.
		System.out.println(x);
	}

}
