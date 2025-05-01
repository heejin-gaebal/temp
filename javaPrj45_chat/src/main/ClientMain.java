package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
		System.out.println("====== 클라이언트 ======");
		
		System.out.println("서버랑 연결완료");
		
		//소켓 생성 및 연결요청
		System.out.print("접속할 서버 IP : ");
		String ip = sc.nextLine();
		System.out.print("접속할 서버 Port : ");
		int port = Integer.parseInt(sc.nextLine());
		Socket s = new Socket(ip, port);
		
		//Stream 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		
		while(true) {
			//통신(데이터 주고 받기) 발신
			System.out.print("서버에게 보낼 메시지 : ");
			String input = sc.nextLine();
			pw.println(input);
			pw.flush();
			  
			//수신
			String str = br.readLine();
			System.out.println(str);
		}
		
	}

}
