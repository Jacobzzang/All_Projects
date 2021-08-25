package co.jacob.app; //co.jacob.app.OracleApp.class

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleApp {
	public static void main(String[] args) {
		String user = "hr";
		String pass = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("���Ἲ��..");
			// ��������� -> ������ ������ statement��ü -> ȭ�鿡 ���.
			String sql = "SELECT * FROM employees";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);// ��ȸ : executeQuery(), 
												  //�Է�,����,���� : executeUpdate()
			while (rs.next()) {	//next() => ������ ��Ұ� �ִ��� üũ�ϰ� 
										//������ �Ѱ� �������� true;
				System.out.print("�����ȣ : " + rs.getInt("employee_id"));//getString�� ����
				//�ڹٴ� ��ҹ��� �����ؾ��Ѵ�. ����� �ܾ�� �ι�°�ܾ� ù��° ���ڸ� �빮�ڷ� 
				//ex) EmployeeId
				System.out.print("\t�̸� : " + rs.getString("first_name"));
				System.out.print("\t�̸��� : " + rs.getString("email"));
				System.out.print("\t�޿� : " + rs.getString("salary"));//getInt�� ����
				System.out.println();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end===");

	}
}