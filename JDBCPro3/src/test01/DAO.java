package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class DAO {

	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	private void getConnect() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb";
		String id = "JMT";
		String pw = "1234";
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, id, pw);
		}catch(Exception ex) {
			System.out.print("DB 오류 :");
			ex.printStackTrace();
		}
	}
	private void closeDB() {
		try {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(conn!=null)conn.close();
		}catch(Exception e) {}
	}

	public void insert(String title, String content, String writer) {
		String sql ="insert into board(title, content, writer) values(?,?,?)";
//		prepareStatement를 이용하면 값을 ?입력후 나중에 추가 가능함.
		try {
			getConnect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			int n = ps.executeUpdate();
			System.out.println(n + "개의 데이터가 추가되었습니다.");
		}catch(Exception ex) {
			System.out.print("DB 데이터 처리 오류 : ");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
	
	public void SelectOne(int bno) {
		String sql = "select * from board where bno=?";
		try {
			getConnect();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			rs= ps.executeQuery();
			if(rs.next()) {
				int dbbno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Timestamp postdate = rs.getTimestamp("postdate");
				System.out.printf("%5d|%10s|%20s|%10s|", dbbno, title, content, writer);
				System.out.println(postdate);
			}
			
		}catch(Exception ex) {
			System.out.println("데이터 삭제 오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
	
	
	public void delete(int bno) {
		String sql="delete from board where bno=?";
		try {
			getConnect();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			int n = ps.executeUpdate();
			System.out.println(n + "개의 데이터가 삭제 되었습니다.");
		}catch(Exception ex) {
			System.out.println("데이터 삭제 오류");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
	
	
	public void update(String title, String content, int bno) {
		String sql ="update board set title=?, content=? where bno=?";
//		prepareStatement를 이용하면 값을 ?입력후 나중에 추가 가능함.
		try {
			getConnect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bno);
			int n = ps.executeUpdate();
			System.out.println(n + "개의 데이터가 수정되었습니다.");
		}catch(Exception ex) {
			System.out.print("DB 데이터 처리 오류 : ");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
	
	public void selectAll() {
		String sql = "select * from board";
		
		try {
			getConnect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("---------------------------------------------------------------");
			System.out.printf("%5s|%10s|%20s|%10s|%s\n","bno", "title", "content", "writer", "postdate" );
			System.out.println("---------------------------------------------------------------");
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				Timestamp postdate = rs.getTimestamp("postdate");
				System.out.printf("%5d|%10s|%20s|%10s|", bno, title, content, writer);
				System.out.println(postdate);
			}
		}catch(Exception ex) {
			System.out.print("DB 데이터 처리 오류 : ");
			ex.printStackTrace();
		}finally {
			closeDB();
		}
	}
	
	
}
