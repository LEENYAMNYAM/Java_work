package jdbcPro2;

//	접속 및 insert & select 연습

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

public class JDBCConnectEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testdb";
		String id = "root";
		String pw = "1234";
		String sql1 = "select * from member";
		String sql2 = "insert into member(name, id, password) "
				+ "values('장원영', 'JWY', '1234')";
		Connection conn = null;
		Statement st = null;
		
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, id, pw);
			st = conn.createStatement();
//			int n = st.executeUpdate(sql2);
//			System.out.println(n + "개의 데이터를 추가했습니다.");
			ResultSet rs = st.executeQuery(sql1);
			while(rs.next()) {
				int mno = rs.getInt("mno");
				String name = rs.getString("name");
				String id1 = rs.getString("id");
				String pw1 = rs.getString("password");
				Timestamp date = rs.getTimestamp("regdate");
				System.out.printf("%d\t %s\t %s\t %s\t", mno, name, id1, pw1);
				System.out.println(date);
			}
		}catch(Exception ex) {
			System.out.print("실패 : ");
			ex.printStackTrace();
		}finally {
			try {
				st.close();
				conn.close();
			}catch(Exception ex) {}
		}
		
	}

}
