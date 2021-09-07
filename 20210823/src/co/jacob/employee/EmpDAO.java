package co.jacob.employee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO extends DAO {// �θ�Ŭ���� DAO�� ��� �޼��� ���
	// Connection, ResultSet, Statement, connect(), disconnect()

	// �߰����.(��ȸ, �Է� . . . )
	public void getEmpList() {
		connect();// ���ᰴü�� ������ִ� �޼��带 ȣ���ؾ��� �ȴ�.
		String sql = "SELECT * FROM employees";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);// ��ȸ : executeQuery(),
										// �Է�,����,���� : executeUpdate()
			while (rs.next()) { // next() => ������ ��Ұ� �ִ��� üũ�ϰ�
								// ������ �Ѱ� �������� true;
				System.out.print("�����ȣ : " + rs.getInt("employee_id"));// getString�� ����
				// �ڹٴ� ��ҹ��� �����ؾ��Ѵ�. ����� �ܾ�� �ι�°�ܾ� ù��° ���ڸ� �빮�ڷ�
				// ex) EmployeeId
				System.out.print("\t�̸� : " + rs.getString("first_name"));
				System.out.print("\t�̸��� : " + rs.getString("email"));
				System.out.print("\t�޿� : " + rs.getString("salary"));// getInt�� ����
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// end of getEmpList()

	// �Ѱ� �߰� ���
	void insrtEmp(String empId, String lastName, String email, String hireDate, String jobId) {
		String sql = "INSERT INTO employees(email, hire_date,job_id,last_name, employee_id)\r\n" + "values(\'" + email
				+ "\', \'" + hireDate + "\', \'" + jobId + "\', \'" + lastName + "\', \'" + empId + "\')";
		System.out.println(sql);
		// connection�� �ϳ��� ������ ������������ ���� �� �ִ�.
		connect(); // conn = ��ü
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);// �ۼ��� sql������ ����
			System.out.println(r + "�� �ԷµǾ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end====");
	}
	// ������

	void insrtEmp(Employee emp) {
		String sql = "INSERT INTO employees(email, hire_date,job_id,last_name, employee_id)\r\n" + "values(\'"
				+ emp.getEmail() + "\', \'" + emp.getHireDate() + "\', \'" + emp.getJobId() + "\', \'" + emp.getLastName() + "\', \'"
				+ emp.getEmployeeId() + "\')";
		System.out.println(sql);
		// connection�� �ϳ��� ������ ������������ ���� �� �ִ�.
		connect(); // conn = ��ü
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);// �ۼ��� sql������ ����
			System.out.println(r + "�� �ԷµǾ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end====");
	} // end of insertEmp
	
	void updateEmp(Employee emp) {
		String sql = "update employees set email = ? where employee_id = ?";
		connect();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getEmail());//?�� �������ְ� ���߿� ���� �����شٴ¶�
			psmt.setInt(2, emp.getEmployeeId());
			int r = psmt.executeUpdate();
			System.out.println(r+"�� ����Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	void deleteEmp(int eno) {
		//���� .
		//psmt ��ü. �Ķ���� ó��
		//psmt.executeUpdate.
	}
}