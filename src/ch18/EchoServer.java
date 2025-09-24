package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		ServerSocket server = null;
		Socket connection = null;
		BufferedReader in =null;
		
		try {
			server = new ServerSocket(5500);
			System.out.println("서버가 5500번 포트에서 대기 중");
			connection = server.accept();
			System.out.println("메세지 대기 중");
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String message ="";
			while((message=in.readLine()) !=null) {
				if(message.contains("끝")) {
					System.out.println("서버종료");
					in.close();
					connection.close();
					server.close();
					break;
				}
					
				System.out.println("읽은 메세지 : "+ message);
				
			}
		} catch (IOException e) {
			System.out.println("소켓 연결, 메세지 수신중 요류발생");
		}
			
		
	}
	

}
