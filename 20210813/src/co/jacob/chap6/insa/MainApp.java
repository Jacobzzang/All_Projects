package co.jacob.chap6.insa;

public class MainApp {

	public static void main(String[] args) {
		Departments dept = new Departments();
		dept.departmentId = 10;
		dept.departmentName = "�λ�";
		
		Departments dept1 = new Departments("��ȹ");
		Departments dept2 = new Departments(30,"����");
		Departments dept3 = new Departments(40,"�ѹ�", 100, 7000);
		
		System.out.println(dept1.toString());
		System.out.println(dept2.toString());
		System.out.println(dept3.toString());            // ====>toString ��������
				
				
		//���
			Employees emp = new Employees(100,"������");
			Employees emp1 = new Employees(101,"ȫ�浿", dept1 );
			Employees emp2 = new Employees(102,"�����", new Departments(30,"����"));
			
		//emp1 ����� �μ����� ���
		System.out.println(emp1.dept.departmentName);
	
		Employees emp3 = new Employees(100,"������");
	    System.out.println(emp3.dept);    //----> Null����
	    System.out.println(emp3.dept.departmentName);   // ----> ���� departmentName�� �����ϱ� NullPoint�������.
	}
	
	

}
