package co.yedam.emp;

import java.util.Scanner;

public class EmployeeList {

	// �̱��� ����

	static EmployeeList instance = new EmployeeList();

	public static EmployeeList getInstance() {
		return instance;
	}

	Employee[] list; // ��� ���� �迭 ������� ������ �迭 Ÿ��
	int empNum; // ����� ����� ������� üũ�� ����
	Scanner sc = new Scanner(System.in);

	// �⺻ ������
	private EmployeeList() {
	}

	// list �ʱ�ȭ
	private EmployeeList(Employee[] list) {
		this.list = list;
		this.empNum = list.length;

	}

	// �迭��ü ����
	//public > default > private
	// ���             ���� ��Ű��          �ڽ� Ŭ���� �� 
	public void init() {
		System.out.println("<����� �Է�>");
		int Num = sc.nextInt();
		list = new Employee[Num];

	}

	// ������� �Է� -> �迭�� �߰�
	public void input() {
		if (empNum >= list.length) {
			System.out.println("�Է��ʰ�");
			return;
		}

		System.out.printf("%d ���>", empNum);
		int no = sc.nextInt();

		System.out.print("�̸�");
		String name = sc.next();

		System.out.print("�޿�>");
		int sal = sc.nextInt();

		list[empNum++] = new Employee(no, name, sal);

	}

	// ����� �ش��ϴ� �̸��� ��ȸ
	public String search(int employeeId) {
		String name = "";

		for (int i = 0; i < list.length; i++) {
			if (employeeId == list[i].getEmployeeId()) {
				name = list[i].getName();
				break;
			}
		}
		return name;
	}

	// ��ü���
	public void print() {

		for (int i = 0; i < empNum; i++) { // �Էµ� ��� �� ��ŭ�� for
			System.out.printf("%-5d %10s %-7d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}
	}

	// �޿��հ�
	public int sum() {
		int total = 0;

		for (int i = 0; i < empNum; i++) { // �Էµ� ����� ��ŭ
			total += list[i].getSalary();
		}
		// �޿� �հ��ڵ� �߰�

		return total;
	}
}