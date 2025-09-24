package madang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookList {

	public static void main(String[] args) throws SQLException {
		Connection conn = MakeConnetion.getConnection();
		
		String sql = "select * from book";
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		stmt.close();
		conn.close();
		
	}

}
