package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("====== STREAM ======");
		
		/*
		 * Stream
		 * 
		 * inputStream : 들어오는 방향
		 * outputStream : 나오는 방향
		 * 
		 * 데이터에 따라 : 
		 * 		1byte - input / output
		 * 		문자열 - Reader / Writer
		 */
		
		Test test = new Test();
		test.m03();
	}

}
