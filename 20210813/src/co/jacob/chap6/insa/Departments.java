package co.jacob.chap6.insa;

public class Departments {
	int departmentId;//�μ���ȣ
	String departmentName;//�μ���
	int managerID;//�Ŵ���
	int locationId;//����
	
	//������ �����ε�
	//�⺻������
	Departments(){}
	//�μ��� �ʱ�ȭ
	Departments(String departmentName) {
		this.departmentName = departmentName;
	}
	//�μ���ȣ, �μ��� �ʱ�ȭ
	Departments(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	//�ʵ� 4�� �ʱ�ȭ
	public Departments(int departmentId, String departmentName, int managerID, int locationId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerID = managerID;
		this.locationId = locationId;
	}
	
//	int print() {
//		return departmentId +":" + departmentName;
//	}
	
	@Override
	public String toString() {
		return "Departments [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerID="
				+ managerID + ", locationId=" + locationId + "]";
	}

	
	
}
