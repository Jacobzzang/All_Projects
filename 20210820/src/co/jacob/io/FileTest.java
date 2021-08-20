package co.jacob.io;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		//createFolder(); //��������
		//�������� �б�
//		fileInfo();
		//���ϻ���
//		fileDelete();
		//�������� ���ϸ���� �о��
		folderInfo();
	}
	
	public static void folderInfo() {
		File file = new File("c:/Temp");
		File[] files = file.listFiles();
		for(File f : files) {
			if(f.isFile())
			System.out.println(f.getName());
		}
	}
	
	
	public static void fileDelete() {
		File file = new File("c:/Temp/bigmatch.JPG");
		file.delete();
	}
	
	public static void fileInfo() {
		File file = new File("c:/Temp/bigmatch.JPG");
		System.out.println("����ũ��:" + file.length());
		System.out.println("���ϰ��:" + file.getParent());
		System.out.println("�����̸�:" + file.getName());
		System.out.println("���డ��:" + file.canExecute());

	}
	
	public static void createFolder() {
		File file = new File("c:/Temp/image");
		file.mkdir();
	}
}
