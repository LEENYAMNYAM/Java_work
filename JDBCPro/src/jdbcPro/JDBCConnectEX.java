package jdbcPro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class JDBCConnectEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String driverName="com.mysql.cj.jdbc.Driver";
			Class.forName(driverName);
			System.out.println("드라이브 로드 성공");
			
			String url = "jdbc:mysql://localhost:3306/sampledb";
			String id = "JMT";
			String pw = "1234";
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB연결 성공");
			
			Statement stmt = conn.createStatement();
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Timestamp date = rs.getTimestamp("postdate");
				System.out.printf("%d %s %s %s", bno, title, content, writer);
				System.out.println(date);
			}
			
		}catch(ClassNotFoundException ex) {
			System.out.println("드라이브 로드 실패");
			ex.printStackTrace();
		}catch(SQLException ex) {
			System.out.println("DB연결 오류");
			ex.printStackTrace();
		}
		
	}

}
