package co.jacob.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	String user = "hr";
	String pass = "hr";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("���Ἲ��");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	}//Ŀ��Ʈ�� ������ָ�ȵǰ� ��ȯ�� ����� ������ �����ϴ�.
	//��������
	void disconnect() {
		if(conn != null) {//conn�� null�� �ƴϸ�
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}