package kh.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== MAP =====");
		
		Map x = new HashMap();
		
		//		 key | value
		x.put("겨울옷", "패딩");
	  //x.put("겨울옷", "털모자"); 
	  //키의 값과 타입이 똑같은 것은 안됨, 키값이 중복되면 최근 들어온 데이터를 따름
		x.put("여름옷", "반팔");
		x.put(123, true);
		
		System.out.println(x);
		
		System.out.println(x.get("겨울옷"));
	}

}
