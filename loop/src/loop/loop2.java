package loop;

public class loop2 {

	public static void main(String[] args) {
	//�ڵ尡 �����ϴ� ��(block)�� Ż���ϴ� ��� : breakŰ����
		
	//�ֻ����� ������ 4�� ������ ���ߴ� ����
		while ( true )
		{
			int DiceNum = (int) ( Math.random() * 6 ) + 1;
			System.out.println( DiceNum );
			if ( DiceNum == 4 )   //break�� �������� or ����
			{
				break;
			}
		}
		

	}

}
