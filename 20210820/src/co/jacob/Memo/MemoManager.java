package co.jacob.Memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MemoManager {
	List<Memo> memoStorage = new ArrayList<Memo>();
	Scanner scanner = new Scanner(System.in);
	File file = new File("c:/Temp", "phonbook.dat");

	// �̱���
	static MemoManager instance = new MemoManager();

	public static MemoManager getInstance() {
		return instance;
	}

	public MemoManager() {
		readFromFile();
	}

	public void inputData() {
		System.out.println("��ȣ>");
		int no = Integer.parseInt(scanner.nextLine());
		System.out.println("��¥>");
		String date = scanner.nextLine();
		System.out.println("����");
		String content = scanner.nextLine();
		memoStorage.add(new Memo(no, date, content));
	}

	// ��¥�� �Է¹ް� �ش� ��¥�� �޸� ��� ���
	public void searchData() {
		System.out.println("��¥>");
		String date = scanner.nextLine();
		boolean findYn = false; //���� ��ã������ 
		
		for(int i=0; i<memoStorage.size();i++) {
			if(date.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i));
				findYn = true;
			}
		}
		if(findYn == false) {
			System.out.println("�ش糯¥�� �޸� �����ϴ�.");
		}
	}
	// ��ȣ�� �Է¹ް� �Ѱ� ����
	public void deleteData() {
		System.out.println("��ȣ>");
		int no = Integer.parseInt(scanner.nextLine());

//		for (int i = 0; i < memoStorage.size(); i++) {
//			if (memoStorage.get(i).getNo() == no) {
//				memoStorage.remove(i);
//			}
//			return;
//		}
		Iterator<Memo> iter = memoStorage.iterator();
		while(iter.hasNext())
		{
			Memo memo = iter.next();
			if(no == memo.getNo()) {
				iter.remove();
				System.out.println("�����Ϸ�");
				return;
			}
		}
		System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
	}
//			
//			Iterator<PhoneInfo> itr=infoStorage.iterator();
//			while(itr.hasNext())
//			{
//				PhoneInfo curInfo=itr.next();
//				if(name.compareTo(curInfo.name)==0)
//				{
//					itr.remove();
//					System.out.println("�����Ϸ�. \n");
//					return;
//				}
			
		
		
		
	

	public void readFromFile() {
		try {
			if (!file.exists())
				return;

			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			memoStorage = (ArrayList<Memo>) ois.readObject();
			System.out.println(memoStorage);
			// �̸��� ���븸������ִ� for��
//			for(int i =0;i< list.size();i++) {
//		         System.out.println(list.get(i).getName());
//		      }
//			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(memoStorage);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
