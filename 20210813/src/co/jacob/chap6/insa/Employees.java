package co.jacob.chap6.insa;

public class Employees {
	int employeeId;		//�����ȣ
	String firstName;	//�����
	Departments dept;
	
	//�⺻������
	Employees(){}
	//�����ȣ, ����� �ʱ�ȭ
	Employees(int employeeId, String firstName) {
		this.employeeId = employeeId;
		this.firstName = firstName;
	}
	//�����ȣ, �����, �μ� �ʱ�ȭ
	Employees(int employeeId, String firstName, Departments dept) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.dept = dept;
	}
}
