package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		System.out.println("====== Client START ======");
		
		//소켓 생성
		Socket s = new Socket("127.0.0.1", 1130);
		
		/*
		 * Stream
		 * 내보내는 송신 스트림
		 * 들어오는 수신 스트림
		 * 
		 * 2개의 통로 필요 
		 * 단방향 전송
		 */
		
		/* 통로 만들기 */
		//BufferedReader : 읽어들임 | PrintWriter : 내보내기
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		
		/* 통로 이용해서 메시지 보내기 */
		pw.println("나는 클라이언트!");
		pw.flush(); //통로에 걸친 메시지를 쭉 보내준다.
		
		/* 통로 이용해서 메시지 받기 */
		String msg = br.readLine();
		System.out.println("받은 메세지 : " + msg);
		
	}

}
