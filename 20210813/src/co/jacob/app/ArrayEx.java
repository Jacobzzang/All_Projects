package co.jacob.app;

public class ArrayEx {

	public static void main(String[] args) {
		
//		int kor[] =new int[10]{100,80,10,40};
//		int eng[] =new int[10]{100,22,11,20};
//		int mat[] =new int[10]{43,32,55,55};
		
		int score[][] = new int[][] {
			{100,80,10,40},	//����
			{100,22,11,20}, //����
			{43,32,55,55} // ����
		};
		
		//���� ���
		System.out.println("=====����=====");
		for(int i=0; i<score[0].length; i++) {
			System.out.println(score[0][i]);
		}
		
		System.out.println("=====����=====");
		for(int k=0; k<score[1].length; k++) {
			System.out.println(score[1][k]);
		}
		
		System.out.println("=====���� ����  ����=====");
		for(int k=0; k<score[0].length; k++) {
			System.out.println(score[0][k] + " " + score[1][k] + " " + score[2][k]);
		}
		/*
		 * �л�0 100 100 43
		 * �л�1 80 22 32
		 * �л�2 10 11 55
		 * �л�3 40 20 55
		 */
		System.out.println("=====�л��� ���� ���� ���� ���� ���� for��=====");
		for(int k=0; k<=score.length; k++) {
			for(int a=0; a<score.length; a++) {
			System.out.print(score[a][k] + " ");
			}
			System.out.println();
		}
		
		
		//���񺰷� ���
		//���� : {100,80,10,40}
		//���� : {100,22,11,20}
		//���� : {43,32,55,55}
//		System.out.println("=====���� ����=====");
//		for(int k=0; k<score.length; k++) {
//			System.out.print(score[k] + " ");
//			}
//			System.out.println();
//		
		String[] className = new String[] {"����", "����", "����"};
//		System.out.println(className[i]);
//		if(i==0) System.out.println("����");
		System.out.println("====���� ���====");
		int i=0;
		for( int[] arr : score ) {
			System.out.println(className[i++] +" ");
			for( int s : arr ) {
				System.out.print(s +" ");
			}
			System.out.println();
		}
		
		
		System.out.println("==========");
		for (int W=0; W<score.length; W++)
		{
			if (W==0) System.out.println("���� : ");
			if (W==1) System.out.println("���� : ");
			if (W==2) System.out.println("���� : ");
		}
		
		
		
//		
//		int[] kor = new int[5];
//		kor[0] = 100;
//		kor[1] = 90;
//		kor[2] = 80;
//		kor[3] = 70;
//		kor[4] = 60;
//		
//		//��ü ���� ��ȸ
//		for(int i=0; i<kor.length; i++) {
//			System.out.println(kor[i]);
//		}
//		
//		System.out.println("���� for�� ���");
//		for( int temp : kor) {
//			System.out.println(temp);
//		}
//		
//		
//		
//		
//		
		
		
		
	}

}
