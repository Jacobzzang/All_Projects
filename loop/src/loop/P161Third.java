package loop;

public class P161Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 1;
//		int b = 1;
//		while (a <= 6)
//		{
//			while (b <= 6)
//			{
//				while ((a+b) = 5)
//			}
//			System.out.println((int) (Math.random() * 6)+1);
//		
//		}
		
		//�ֻ��� 2�� ����.
		// 1�� �ֻ��� --> 1~6
		// 2�� �ֻ��� --> 1~6
		// (1�� �ֻ��� ��ȣ, 2���ֻ��� ��ȣ)
//		int Sum;
//		do
//		{
//			int Dice1 = (int) (Math.random() * 6) + 1;
//			int Dice2 = (int) (Math.random() * 6) + 1;
//			
//			System.out.println("(" + Dice1 + "," + Dice2 + ")" );
//			
//			Sum = Dice1 + Dice2;
//		}
//		while ( Sum != 5 );

		
		
//		int Sum;
//		int Dice1;
//		int Dice2;
//		while ( true )
//		{
//			Dice1 = (int) (Math.random() * 6) + 1;
//			Dice2 = (int) (Math.random() * 6) + 1;
//			
//			System.out.println("(" + Dice1 + "," + Dice2 + ")" );
//			
//			Sum = Dice1 + Dice2;
//			if ( Sum == 5)
//			{
//				break;
//			}
//		}
		
		// while������ �ϴ¹�
//		int Sum = 0;
//		while ( Sum != 5 )
//		{
//			int Dice1 = (int) (Math.random() * 6) + 1;
//			int Dice2 = (int) (Math.random() * 6) + 1;
//			
//			System.out.println("(" + Dice1 + "," + Dice2 + ")" );
//			
//			Sum = Dice1 + Dice2;
//		}
		
	
		//���ϴ� ���� ��µ� �� �ٸ� ���� ����ϴ� ���.
		for ( int Sum = 0 ; Sum != 5; )
		{
			int Dice1 = (int) (Math.random() * 6) + 1;
			int Dice2 = (int) (Math.random() * 6) + 1;
			
			System.out.println("(" + Dice1 + "," + Dice2 + ")" );
			
			Sum = Dice1 + Dice2;
			
			if ( Sum != 5)
			{
				System.out.println("������ȸ��.");
			}
			else
			{
				System.out.println("�����ϼ̽��ϴ�.");
			}
		}
		
		
		
	}

}
