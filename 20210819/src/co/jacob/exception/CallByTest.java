package co.jacob.exception;

//Call by refernce
//Call by value

public class CallByTest {
//	static int a = 10;
	public static void main(String[] args) {

		//Call by value (�������� ȣ��)
		int a = 10;
		sub1(a);
		System.out.println(a);
		
		//Call by value : String , Wrapper Ŭ������ ��ü������ �޼����� �μ��� ���� ��� value��
//		Integer b = 10;
		String b = "hi";
		sub2(b);		// �ؿ�  sub2 �޼��带 ȣ���Ѵٴ� ��. 
		System.out.println(b);
	}

	//Call by reference(������ ���� ȣ��)
	Emp c = new Emp();
	c.name = "ȫ�浿";
	sub3(c);
	System.out.println(c.name);
	}
	
	
	
	public static void sub1(int a) {
		a = a * a;
	}
	
//	public static void sub2(Integer b) {
	public static void sub2(String b) {
//		b = b * b;
		b = "hello";
		System.out.println(b);
	}
	
	public static void sub3(Emp a) { a.name = "�̼���"; }
}
