package co.jacob.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import co.jacob.exception.Emp;

public class EmpSetTest {

	public static void main(String[] args) {
		
		Set<Emp> set = new HashSet<>();
		
		
		set.add(new Emp(100, "ȫ�浿", "�λ�"));
		set.add(new Emp(101, "�����", "�λ�"));
		set.add(new Emp(102, "�̼���", "�λ�"));
		set.add(new Emp(100, "ȫ�浿", "�λ�"));
		
		//�̸��� ��� Iterator or ���� for
		Iterator<Emp> iter = set.iterator();
		while(iter.hasNext()) {
			Emp temp = iter.next();
			System.out.println(temp);
		}
		
		for( Emp temp : set) {
			System.out.println(temp.getName());
		}
		
	}

}
