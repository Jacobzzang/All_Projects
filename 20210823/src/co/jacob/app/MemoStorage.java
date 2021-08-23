package co.jacob.app;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MemoStorage {

	List<Memo> memos = new ArrayList<>();
	
	//�̱���
	//�Ź� ��ü�� ���������ʰ� getInstance�� �޾ƾ��°�
	private static MemoStorage instance = new MemoStorage();
	public static MemoStorage getInstance() {
		return instance;
	}
	
	//read
	
	//file save
	File file = new File("c:/Temp/memo.txt");
	public void fileSave() {
		try {
			FileWriter fw = new FileWriter(file);
			for(Memo memo : memos) {
				fw.append(memo.toString());
			}
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	//����Ʈ�� �߰�
	public boolean saveDate(Memo memo) {
		return memos.add(memo);
		
	
	}
	//����
	public void deleteData(String no) {
		//Iterator���¹��
//		Iterator<Memo> iter = memos.iterator();
//		
//		while(iter.hasNext()) {
//			if(iter.next().getNo().equals(no)) {
//				iter.remove();
//		}
				
		//for�����¹��
//		for(int i=0; i<memos.size(); i++) {
//			if(no.equals(memos.get(i).getNo())) {
////			if(memos.get(i).getNo().equals(no)) {
//				memos.remove(i);
//				}
//		}
		
		//����for�� ���¹��
		for(Memo memo : memos) {
			if(memo.getNo().equals(no)) {
				memos.remove(memo);
			}
		}
			
	}
	//��ü��ȸ
	public List<Memo> searchData() {
		return memos;
	}
		
		
	
//	//��ȸ
//	public void searchData() {
//		
//	}
}
