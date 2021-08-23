package co.jacob.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		//�л� �̸��� ������ Map�� ����
		Map<String, Integer> map = new HashMap<>();
		map.put("ȫ�浿", 100);
		map.put("�����", 50);
		map.put("�̼���", 80);
		
		//������ȸ
		
		System.out.println(map.get("ȫ�浿"));
		
		
		//��ü��ȸ
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(value);
			
		}
	}

}
