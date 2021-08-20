package co.jacob.Memo;

import java.util.Scanner;

public class MemoApp {

	public static void main(String[] args) {
		MemoManager memoManage = MemoManager.getInstance();
		//�̱������ phonebookManager Ŭ���� ����
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true) {
			//�޴����
			System.out.println("1.��� 2.�˻� 3.���� 4.����");
			//�޴���ȣ�Է�
			System.out.println("��ȣ>");
			choice = Integer.parseInt(scanner.nextLine());
			switch(choice) {
			case MENU.INSERT: memoManage.inputData(); break;
			case MENU.SERCH: memoManage.searchData(); break;
			case MENU.DELETE: memoManage.deleteData(); break;
			case MENU.EXIT: memoManage.storeToFile(); System.exit(0);
			}
		}
	}

}
