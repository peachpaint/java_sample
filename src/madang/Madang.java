package madang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Madang {

	public static void main(String[] args) throws SQLException{
		//1. 관리자 : 새로운 책을 구매했을 떄 구매한 책의 내역을 입력.
		//		책이름, 출판사, 가격
		//2. 관리자 : 새로운 고객이 찾아왔을 떄 고객 정보를 입력
		//		고객명, 주소 전화번호
		//3. 관리자 : 기존 고객이 책을 구매했을 떄 주문 정보를 입력
		// 		고객, 책, 구매가격, 구매일자
		//4. MENU : 1 - 책 (등록, 조회, 수정-->가격만 수정,삭제-->주문내역이 존재하면 삭제X)
		//			2 - 고객 (등록, 조회, 수정-->주소, 전화번호 수정, 삭제-->주문내역이 존재하면 삭제X)
		//			3 - 주문 (등록, 조회, 수정-->판매가격만 수정, 삭제-->당일 등록 자료만 삭제 가능/단 과거자료는 삭제X)
	
		Scanner in =new Scanner(System.in);
		Connection conn = MakeConnetion.getConnection();
		
		String menu = "";
		while(true) {
			//고객
			System.out.println("==============================");
			System.out.println(" 1.도서 | 2.고객 | 3.주문 | 0.종료");
			System.out.println("==============================");
			System.out.println("메뉴를 선택하세요 : ");
			menu=in.nextLine();
			if(menu.equals("0")) {
				break;
			}
			switch (menu) {
			case "1" -> bookManagement(in,conn);
			case "2" -> customerManagement(in,conn);
			case "3" -> ordersManagement(in,conn);

			}
		}
		System.out.println("프로그램 종료합니다");
		conn.close();
		
	}

	//end main

	private static Object bookManagement(Scanner in, Connection conn2) throws SQLException{
		System.out.println("도서 관리 메뉴입니다");
		System.out.println("=========================================");
		System.out.println(" 1.등록 | 2.조회 | 3.수정 | 4.삭제 |5.이전 메뉴");
		System.out.println("=========================================");
		System.out.println("menu >");
		
		String menu = "";
		while(true) {
			//고객
			System.out.println("메뉴를 선택하세요 : ");
			menu=in.nextLine();
			if(menu.equals("5")) {
				break;			
			}
			switch (menu) {
			case "1" -> creatBook();
			case "2" -> listBook(conn);
			case "3" -> updateBook();
			case "4" -> deletBook();

			}
		}
		
	return null;
	}
	
	private static Object deletBook() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object updateBook() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void listBook(Connection conn) throws SQLException{
		String sql = "select * from book";
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		stmt.close();
	}

	private static Object creatBook() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object ordersManagement(Scanner in, Connection conn) {
		System.out.println("주문 관리 메뉴입니다");
		return null;
	}

	private static Object customerManagement(Scanner in, Connection conn) {
		System.out.println("고객 관리 메뉴입니다");
		return null;
	}

	
	private static void clearScreen() {
		System.out.println();
	}
	
	

}//end main class
