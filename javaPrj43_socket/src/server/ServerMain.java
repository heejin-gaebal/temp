package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws IOException{
		System.out.println("====== SERVER START ======");
		/*
		 * 서버소켓 : 소켓을 만들고 외부연결 통신을(클라이언트를) 소켓에 연결해준다. 
		 */
		//		서버 소켓 생성		   서버 소켓(port) : 예외처리 IOException
		ServerSocket ss = new ServerSocket(1130);
		
		//서버 소켓한테, 클라이언트의 접속을 대기하도록 명령
		Socket s = ss.accept();
		//Socket s : 서버와 클라이언트 간의 통신을 담당
	
		/* 통로 만들기 */
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		
		/* 메세지 받기 */
		String msg = br.readLine();
		System.out.println(msg);
		
		/* 메세지 보내기*/
		pw.println("나는 서버!");
		pw.flush(); //통로에 걸친 메시지를 쭉 보내준다.
	}
}
