package co.jacob.collect;

import java.util.ArrayList;

import co.jacob.exception.Emp;

public class EmpListTest {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<>();

		// �߰� 3��
		list.add(new Emp(100, "ȫ�浿", "�λ�"));
		list.add(new Emp(101, "�����", "�λ�"));
		list.add(new Emp(102, "�̼���", "�λ�"));
		
		// ����
//		list.remove(0);
		list.remove(new Emp(101, "�����","�λ�"));
		
		// �̸��� ��� ���
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		
		Emp e1= new Emp(100, "ȫ�浿", "�λ�");
		Emp e2= new Emp(100, "ȫ�浿", "�λ�");
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
	}
	

	
}
