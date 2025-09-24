package ch13;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		try {
			ServerSocket server= new ServerSocket(4000);
			System.out.println("4000번 포트에 서버가 대기중");
			Socket connection = server.accept();
System.out.println("클라이언트와 연결완료");
			InputStream is= connection.getInputStream();
System.out.println("연결완료2");
			ObjectInputStream ois = new ObjectInputStream(is);
			String massage="";
System.out.println("연결완료3");
			try {
				massage = (String) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(massage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
