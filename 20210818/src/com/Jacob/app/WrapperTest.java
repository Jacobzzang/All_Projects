package com.Jacob.app;

/*��üȭ
Ÿ�Ժ�ȯ
int -> long (int)
��ü���� �θ�� �ڽ� (�θ�)
String -> int, long, date
*/
public class WrapperTest {

	public static void main(String[] args) {
		//1.��üȭ   int <-> Integer
		int a=10;
		Integer b = Integer.valueOf(a); //boxing
		b = a;	//auto boxing
		
		a = b;		//auto unboxing 
		a = b.intValue();	//unboxing
		
		//2. Ÿ�Ժ�ȯ
		
		//ĳ����
		//int -> String
//		String c = a;		//X
		String c = Integer.toString(a);		//O
		
		//String -> int
		a = Integer.parseInt(c);
		
		//double -> String
		double d = 10.5;
		c = Double.toString(d);
		c = String.valueOf(d);
		
		//String -> double
		d = Double.parseDouble(c);
		
		//3.������ȯ
		int e = 15;
		String r1 = Integer.toBinaryString(e);	//2����
		String r2 = Integer.toOctalString(e);	//8����
		System.out.println(r1 + ":" + r2);
		
		
		
		
		
		
	}

}
