package ch13;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	public static void main(String[] args) {
		try {
			Socket client =new Socket("172.30.1.68", 5000);
			OutputStream os= client.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject("확인부탁드려요");
			oos.flush();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (IOException e) {
			System.out.println("데이토 확인");
			e.printStackTrace();
		}
	}

}
