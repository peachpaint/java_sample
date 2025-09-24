package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo2Server extends Thread{
	//변수
	protected static boolean cont = true;
	protected Socket connection = null;
	
	//생성자
	private Echo2Server(Socket clientSocket) {
		connection =clientSocket;
		start();
	}
	
	
	//main
	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(5500);
			
			while(cont) {
				System.out.println("서버가 5500번 포트에서 대기 중");
				new Echo2Server(server.accept());
				
			}
			server.close();
			
		} catch (Exception e) {
			System.out.println("소켓 연결, 메세지 수신중 요류발생");
		}
			
		
	}
	
	//run()==>스레드 클라이언트가 하나씩 생성되어 실행하는 코드
	public void run() {
		BufferedReader in =null;
		System.out.println("클라이언트와 통신을 위한 새로은 스레드");
		
		try {
		in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		String message ="";
		while((message=in.readLine()) !=null) {
			if(message.contains("끝")) {
				in.close();
				connection.close();
				break;
			}
				
			System.out.println("읽은 메세지 : "+ message);
		} 
			
		}catch(Exception e) {
			
		}
	}
	

}
