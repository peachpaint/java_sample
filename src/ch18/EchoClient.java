package ch18;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	private static Object String;

	public static void main(String[] args) {
		Socket client = null;
		PrintWriter out =null;
		//서버 연결
		try {
			client = new Socket();
			System.out.println("서버와 연결 시도 증");
			client.connect(new InetSocketAddress("localhost ",5500), 3000);
			System.out.println("서버와 연결 성공");
		}catch(Exception e) {
			System.out.println("서버와 연결 시도 증 오류 발생");
		}
		
		//데이터 보내기
		Scanner in =new Scanner(System.in);
		try {
			out = new PrintWriter(client.getOutputStream(),true);
			String message="";
			System.out.println("보낼 메세지가 있습니까?");
			while((message=in.nextLine())!=null) {
				if(message.contains("끝")) {
					System.out.println("클라이언트 종료");
					out.close();
					in.close();
					client.close();
					break;
				}
				out.println(message);
				System.out.println("보낼 메세지 있습니까?");
			}
		} catch (IOException e) {
			
		}
		
	}

}
