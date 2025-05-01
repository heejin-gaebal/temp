package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws IOException {

		System.out.println("====== 서버 스타트 ======");
		
		//서버 소켓
		ServerSocket ss = new ServerSocket(54321);
		
		//접속 기다리고 소켓 리턴받기
		System.out.println("연결 대기중 ...");
		Socket s = ss.accept();
		
		InetAddress ia = s.getInetAddress();
		String ip = ia.getHostAddress();
		
		System.out.println("(클라이언트 요청) 연결완료 " + ip);

		//Stream 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			//통신(데이터 주고 받기)
			
			//클라이언트측 메시지 받기
			String str = br.readLine();
			System.out.println(str);

			//답장
			System.out.print("클라이언트에게 보낼 메시지 : ");
			String input = sc.nextLine();  
			pw.println(input);
			pw.flush();
		}
		
	}

}
