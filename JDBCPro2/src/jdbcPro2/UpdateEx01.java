package jdbcPro2;

//	BD연결 및 update 및 delete
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String id = "JMT";
		String pw = "1234";
		Connection conn = null;
		Statement st = null;
		String sql = "update board set title='수정 제목', content='수정 내용' where bno=1";
		String sql2 = "delete from board where bno=1";
		
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, id, pw);
			st = conn.createStatement();
			int n = st.executeUpdate(sql);
			System.out.println(n + "개의 데이터를 update 되었습니다.");
			int n2 = st.executeUpdate(sql2);
			System.out.println(n2 + "개의 데이터를 delete 되었습니다.");
		}catch(Exception ex) {
			System.out.print("DB 오류 :");
			ex.printStackTrace();
		}finally {
			try {
			st.close();
			conn.close();
			}catch(Exception e) {}
		}
				
	}

}
