package co.jacob.collect;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		 
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("���");
		list.add("��");
		list.remove(0);
		list.set(0, "Ű��");
		list.get(0);
		((LinkedList<String>)list).addFirst("�ٳ���");
		
	}

}
