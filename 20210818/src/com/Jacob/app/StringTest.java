package com.Jacob.app;

public class StringTest {

	public static void main(String[] args) {
		
		String ssn = "930725-1234567";
		
		Object obj = new Object();
		
		//���ڿ�����
		int s = ssn.length();
		System.out.println("���� : " + s);
		
		//����
//		char sex = ssn.charAt(7);
//		System.out.println("���� : " + (sex =='1'?"��":"��" ));
		System.out.println("���� : " + StringUtil.findSex(ssn));
		
		//�������
		String year = ssn.substring(0, 2);
		System.out.println("�⵵ : " + year);
		
	
		
		//�ǵڿ� Ȯ���ڸ� �ڸ��� �������
		//.�� ��ġ�� ã�Ƴ��� �׵��� ��� ���ڸ� �����ϸ� �װ� Ȯ����.
		String fname = "c:/images/2021/home.png";
//		int idt = fname.indexOf(".");
		String ext = fname.substring(fname.indexOf(".")+1);
		
		System.out.println("Ȯ���� : " + ext);
		
		
		//���ϸ�
//		String name = fname.substring(fname.lastIndexOf("/")+1);
//		System.out.println("Ȯ���� : " + name);
		String name = StringUtil.findFileName(fname);
		System.out.println("���ϸ� : " + name);
		
		
		String[] ff = name.split("[.]");
		System.out.println(ff[0] +"----" + ff[1]);
		
		
		//ġȯ
		String result = fname.replace("2021", "2020");
		System.out.println(fname);
		System.out.println(result);
		
		//��Ʈ�� ��
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1==s3);
		
		//���ڿ� ����, ���� (+) StringBuffer,	StringBuilder
		StringBuffer sb = new StringBuffer();
		sb.append("hi")
			.append("every")
			.append("buy");	//"hi" + "ev" + "buy"���ٴ� ������ ���
		
		sb.replace(0, 2, "happy");
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
