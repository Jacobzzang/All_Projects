package co.jacob.app;

public class ScoreAppMain {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("2���̻��Է�");
			System.exit(0);
		}
		
		String num1 = args[0];
		String num2 = args[1];
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int result = n1 + n2;
		System.out.println(result);
		
//		int[] kor = new int[5];
//		kor[0] = 100;
//		kor[1] = 98;
//		kor[2] = 92;
//		kor[3] = 80;
//		kor[4] = 92;
//		
		//��ü ���� ��ȸ
//		for(int i=0; i< kor.length ; i++) {
//				System.out.println(kor[i]);
//		}
//		
		//����� �հ� ���
//		int sum = 0;
//		for(int i=0; i< kor.length; i++)
//		{
//			sum += kor[i];
//		}
//		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
