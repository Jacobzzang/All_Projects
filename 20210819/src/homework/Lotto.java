package homework;

import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		
		//�ߺ����� ���� ���� 6���� ����
		int cnt = 6;
		
//		List<Integer> list = new ArrayList<>();			//set���� �ٲ�� �ߺ������ŵȴ�.
		Set<Integer> list = new HashSet<>();
		
		while(list.size()<6) {
			//����
			int r = (int)(Math.random()*10)+1;	//���� 1~10
			list.add(r);			
			
		}
		System.out.println(list);	//iterator�� �̿��ؼ� ��ü ���
	}

}
