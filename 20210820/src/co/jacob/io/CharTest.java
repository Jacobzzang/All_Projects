package co.jacob.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {

//		write1();
//		read1();
		read2();

	}
	//���۸� ���ؼ� �����Է�
	public static void read2() {
		try {
			FileReader fr = new FileReader("C:/Temp/addr.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while(true) {
				s = br.readLine();
				if(s == null) break;
			}
			br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	//�����̲�
	public static void read1() {
	      try {
	         
	         FileReader fr = new FileReader("C:/Temp/addr.txt");   //���ϸ��� ���� 
	         char[] arr = new char[100];
	         
	         while(true) {
	            int a = fr.read(arr);
	            if(a == -1)break;
	            for(int i =0;i<a;i++) {   //������ ���� ���� �״ѱ� a�� ũ�⸸ŭ�� �о��ָ� �� 
	               System.out.print(arr[i]);
	            }
	            //char[] -> String���� ��ȯ 
	            //for�� �Ⱦ��� �ϴ� �� 
	            // �˻��ؼ� ã�ƺ��� 
	         }
	         fr.close();
	      }catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	//�����Ѱ�
//	public static void read1() {
//		try {
//			FileReader fr = new FileReader("c:/Tem/addr.txt");
//			char[] arr = new char[100];
//			while(true) {
//				int a = fr.read(arr);
//				if(a == -1) break;
//				for(int i=0; i<a; i++) {
//					System.out.print(arr[i]);
//				}
//				//char[] -> string���� ����ϴ°��ϴµ� for����� string���� ��ȯ�Ͽ� ��� ���۸��ؼ�
//			}
//			fr.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public static void write1() {
		try {
			FileWriter fw = new FileWriter("c:/Temp/addr.txt");
			System.out.println("�Է� > ");
			Scanner scanner = new Scanner(System.in);
			String s = null;
			while(true) {
				try {
					s = scanner.nextLine();
				} catch(NoSuchElementException e) {
					break;
				}
				fw.write(s+"\n");	
			}
			fw.close();
			System.out.println("����!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
