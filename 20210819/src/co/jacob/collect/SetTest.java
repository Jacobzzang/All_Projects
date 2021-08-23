package co.jacob.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("���");
		set.add("�ٳ���");
		set.add("Ű��");
		set.add("���");
		
		System.out.println(set);
		
		System.out.println(set.contains("�ٳ���"));
		
		//�ݺ��� Iterator
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
		//���� for��
		for( String temp : set) {
			System.out.println(temp);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("�����");
		}
	}

}
