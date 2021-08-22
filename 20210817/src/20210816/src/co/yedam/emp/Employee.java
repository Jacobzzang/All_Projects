package co.yedam.emp;

public class Employee {
	
	private int employeeId;			//���
	private String name;			//�̸�
	private int departmentId;		//�μ���ȣ 10:�λ� 20:���� 30:����(�⺻��)
	private String departmentName;  //�μ���
	private int salary;				//�޿�
	private String email;			//�̸���
	
	//�⺻������
	private Employee(){}
	
	
	//��� �̸� �ʱ�ȭ 
	public Employee(int employeeId, String name){
		this(employeeId, name, 0, 30);  //�μ� ��ȣ ������ 30 �⺻�� 
	}

	//�μ���ȣ �ʱ�ȭ
	public Employee(int employeeId, String name, int salary, int departmentId) {
	
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		
		if (departmentId == 10) {
			this.departmentName = "�λ�";
		} 
		else if (departmentId == 20) {
			this.departmentName = "����";
		} 
		else {
			this.departmentName = "����";
		}
	}
	
	// ���, �̸�, ���� �ʱ�ȭ
	
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);      //������ ȣ���� ���� �� ù�� ° �ٿ� �;���
	}											// �⺻�� 30


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
																
	
	
}
