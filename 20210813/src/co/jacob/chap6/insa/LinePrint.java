package co.jacob.chap6.insa;
// Ŭ���� = �ʵ� + �޼���


//�޼��� ���� ����
//1.dataó��
//2.�ݺ��Ǵ� �ڵ带 �޼��� ����

//�޼��� �����ε� : �����̸��� �޼��� ������ ���� ��, �Ű������� Ÿ��,������ �޶���Ѵ�.

public class LinePrint {
  void print() {
	 System.out.println("=================");
  }
	 
	 void print(int cnt){
		 for(int i=0; i<cnt; i++) {
			 System.out.println("=");
		 }
		 System.out.println();
	 }
	 
	 
	 void print( int cnt, String s ){
		 for(int i=0; i<cnt; i++) {
			 System.out.println(s);
		 }
		 System.out.println();
	 }
 }
