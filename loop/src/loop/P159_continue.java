package loop;

public class P159_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ݺ� ��������, �ݺ��� ������ġ�� �ٷ� �̵� : continueŰ����
		for(int i=1; i<=10; i++)
		{
			//���� i�� ������ 'Ȧ��'�̸�, �ݺ� ������ �ϴ� �ڵ���� ���������ʰ�, ������������ �ٷ��̵�.
			if(i%2 != 0) 
			{
				continue;		
			}
			System.out.println(i);
		}

	}

}
