package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public void m01() throws IOException{
		
		//파일을 객체로 준비  [파일의 경로]
		File f = new File("D:\\dev\\hello.txt");
			
		//내보내는 통로 준비				  true 값 이어쓰기 여부
		FileWriter fw = new FileWriter(f, true);
		
		//데이터 내보내기
		fw.write("2번~~~~\n 3번입미당~~~");
		fw.flush();
	}
	
	public void m02() throws IOException{
		//파일 객체 준비
		File f = new File("D:\\dev\\hello.txt");
		
		//읽어들이는 통로 준비
		FileReader fr = new FileReader(f);
		
		//데이터 읽기
		for(int i=0; i<10; i++) {
			int result = fr.read();
			System.out.println(result);
			//한글자씩, 숫자로 나오는 형태
		}
	}
	
	public void m03() throws Exception{
		
		//파일 객체 준비
		File f = new File("D:\\dev\\hello.txt");
		
		//읽어들이는 통로 준비 [+ 보조스트림] - BufferedReader(스트림) 
		FileReader fw = new FileReader(f);
		BufferedReader br = new BufferedReader(fw); //자동 문자열 처리

		//데이터 읽기 - 문자열로 읽어들이기, 한줄만 읽기
//		for(int i=0; i<3; i++) { //여러줄 읽기 위해 for 문 사용 
//			String str = br.readLine();
//			System.out.println(str);
//		}
		while(true) {
			String str = br.readLine(); //stream이 끝나면 null출력
			if(str == null) {	   //그래서 str이 null이 되면 반복문 탈출하게 함
				break;
			}
			System.out.println(str);
		}
	}
	
}
