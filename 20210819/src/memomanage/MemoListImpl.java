package memomanage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MemoListImpl implements MemoList {

	ArrayList<Memo> list = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	
	@Override
	public void input(Memo memo) {
//		//��ȣ
////		int no = scanner.nextInt();
//		int no = ScannerUtil.readInt();
//		//��¥
////		String date = scanner.next();
//		String date = ScannerUtil.readDate();
//		//����
////		String content = scanner.next();
//		String content = ScannerUtil.readMultiLine("������ ������ .end ���弼��");
//		//����Ʈ�� �߰�
//		list.add(new Memo(no, date, content));
		list.add(memo);
	}
	@Override
	public void print() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getNo());
			System.out.println(list.get(i).getDate());
			System.out.println(list.get(i).getContent());
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String date) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void delete(int no, String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchContent(String content) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Memo> selectAll() {
		return list;
	}
	
	
}
