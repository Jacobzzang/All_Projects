package listTest;

import java.util.ArrayList;

public class ListApp {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		//�߰�
		list.add("���");
		list.add("����");
		list.add(0, "�ٳ���");
		System.out.println(list);
		
		//�ܰ� ��ȸ
		System.out.println("1��" + list.get(1));
		
		//��ü ��ȸ
		for(int i=0; i<list.size(); i++ ) {
			System.out.println(String.format("%d�� %s", i, list.get(i)));
		}
		//���� for�� ��ü��ȸ
		for(String temp : list) {
			System.out.println(temp);
		}
		
		//��ȸ
		int idx = list.indexOf("����");
		System.out.println(idx==-1? "no" : idx + "��°"); 		//������  no����ϰ� ������ �ڸ������� 
		
		//����
		list.set(0, "�޷�");	//0��°�ڸ��� ,�ڿ� �μ��� ��ü
		System.out.println(list);
		
		//����
		
		//����
		list.remove(0);
		System.out.println(list);
		
		//��λ���
		list.clear();
		System.out.println(list);
		
	}

}
