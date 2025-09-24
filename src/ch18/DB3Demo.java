package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB3Demo {

	public static void main(String[] args) throws SQLException {
		Connection conn = makeConnection();
		//3. preparedStatement 객체 생성
		String sql = "delete from person where id = ? ";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1,3);


		
		//4. sql문 실행
				if(pstmt.executeUpdate()==1) {
					System.out.println("레코드 삭제 성공");
				}else {
					System.out.println("레코드 삭제 실패");
				}
				//5. 연결종료
				pstmt.close();
				conn.close();
	}

	public static Connection makeConnection() {
		String url ="jdbc:mysql://localhost:3306/testdb?serverTimezone=Asia/Seoul";
		Connection conn = null;
		
		//1. 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 중");
			//2. 데이터베이스 연결
			conn = DriverManager.getConnection(url, "root", "1111");
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC드라이버를 찾지 못하였습니다...");
		} catch(SQLException e) {		
			System.out.println("데이터베이스 연결 실패");
		}
		return conn;
		
	}
}
